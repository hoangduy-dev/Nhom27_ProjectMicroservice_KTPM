package com.example.demo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Cart;
import com.example.demo.entity.User;
import com.example.demo.service.CartService;

@RestController
public class CartController {
	@Autowired
	private CartService cartService;
	@GetMapping("/carts")
	public List<Cart> getAllCart(){
		return cartService.findAll();
	}
	@GetMapping("/carts/{id}")
	public Cart getCartById(@PathVariable("id") int id) {
		return cartService.findById(id);
	}
	@PostMapping("/carts/{userId}")
	public Cart createCart(@PathVariable("userId") int userId,Cart cart) {
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));

		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("my_other_key", "my_other_value");

		HttpEntity<User> entity = new HttpEntity<User>(headers);

		ResponseEntity<User> response = restTemplate.exchange("http://localhost:8084/users/{userId}", //
				HttpMethod.GET, entity, new ParameterizedTypeReference<User>(){}, userId);
		cart.setUser(response.getBody());
		
		return cartService.add(cart);
	}
}
