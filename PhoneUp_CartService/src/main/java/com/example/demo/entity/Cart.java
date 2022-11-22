package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "tb_cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private int id;
	@OneToOne
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private User user;
	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	private List<CartItem> items;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(List<CartItem> items) {
		super();
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<CartItem> getItems() {
		return items;
	}
	public void setItems(List<CartItem> items) {
		this.items = items;
	}
	

	@Override
	public String toString() {
		return "Cart [id=" + id + ", user=" + user + ", items=" + items + "]";
	}

	
	
}
