package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Cart;
import com.example.demo.entity.CartItem;
import com.example.demo.entity.Phone;
import com.example.demo.service.CartItemService;
import com.example.demo.service.CartService;

@RestController
public class CartItemController {
	@Autowired
	private CartItemService cartItemService;
	@Autowired
	private CartService cartService;
	@PostMapping("/cartItems/{cartId}/{phoneId}")
	public CartItem addToCart(@PathVariable("cartId") int cartId, @PathVariable("phoneId") int phoneId,@RequestBody CartItem cartItem) {
		RestTemplate restTemplate = new RestTemplate();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));

		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("my_other_key", "my_other_value");

		HttpEntity<Phone> entity = new HttpEntity<Phone>(headers);

		ResponseEntity<Phone> response = restTemplate.exchange("http://localhost:8082/phones/{phoneId}", //
				HttpMethod.GET, entity, new ParameterizedTypeReference<Phone>(){}, phoneId);
		cartItem.setPhone(response.getBody());

		Cart cart = cartService.findById(cartId);
		cartItem.setCart(cart);
		return cartItemService.add(cartItem);
	}
	@DeleteMapping("/cartItems/{id}")
	public void deleteItem(@PathVariable("id") int id) {
		cartItemService.deleteItem(id);
	}
	@PutMapping("/cartItems/{id}")
	public CartItem updateItems(@PathVariable("id") int id, CartItem cartItem) {
		return cartItemService.updateItem(id, cartItem);
	}
	@GetMapping("/cartItems/{id}")
	public CartItem findById(@PathVariable("id") int id) {
		return cartItemService.findById(id);
	}
}
