package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CartItem;
import com.example.demo.entity.Phone;
import com.example.demo.repository.CartItemRepository;

@Service
public class CartItemService {
	@Autowired
	private CartItemRepository cartItemRepository;
	
	public CartItem add(CartItem cartItem) {
		return cartItemRepository.save(cartItem);
	}
	public List<CartItem> findAll(){
		return cartItemRepository.findAll();
	}
	
	public void deleteItem(int id) {
		cartItemRepository.deleteById(id);
	}
	
	public CartItem findById(int id) {
		return cartItemRepository.findById(id).get();
	}
	
	public CartItem updateItem(int id, CartItem newItem) {
		CartItem item = cartItemRepository.findById(id).get();
		item.setQuantity(newItem.getQuantity());
		return cartItemRepository.save(item);
	}
}
