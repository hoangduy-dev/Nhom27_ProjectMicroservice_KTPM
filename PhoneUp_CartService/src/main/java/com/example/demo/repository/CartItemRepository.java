package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cart;
import com.example.demo.entity.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer>{
	@Query("select ci from CartItem ci where ci.cart.id = :id")
	public List<Cart> findByCartId(@Param("id") int id);
}
