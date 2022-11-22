package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Brand;
import com.example.demo.service.BrandService;

@RestController
public class BrandController {

	@Autowired
	private BrandService brandService;

	@PostMapping("/brands")
	public Brand add(@RequestBody Brand brand) {
		return brandService.add(brand);
	}
	@GetMapping("/brands/{id}")
	public Brand getBrandById(@PathVariable("id") int id) {
		return brandService.findById(id);
	}
	@DeleteMapping("/brands/{id}")
	public void delete(@PathVariable("id") int id) {
		brandService.delete(id);
	}
	@GetMapping("/brands")
	public List<Brand> getAllBrand(){
		return brandService.findAll();
	}
}
