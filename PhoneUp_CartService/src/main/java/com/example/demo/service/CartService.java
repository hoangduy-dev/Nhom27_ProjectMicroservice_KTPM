package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cart;
import com.example.demo.repository.CartRepository;
@Service
public class CartService {
	@Autowired
	private CartRepository cartRepository;
	
	public Cart findById(int id) {
		return cartRepository.findById(id).get();
	}
	
	public List<Cart> findAll(){
		return cartRepository.findAll();
	}
	
	public Cart add(Cart cart) {
		return cartRepository.save(cart);
	}
}
