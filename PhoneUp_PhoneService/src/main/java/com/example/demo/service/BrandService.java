package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Brand;
import com.example.demo.repository.BrandRepository;
@Service
public class BrandService {
	@Autowired
	private BrandRepository brandRepository;

	public Brand add(Brand brand) {
		return brandRepository.save(brand);
	}
	public List<Brand> findAll() {
		return brandRepository.findAll();
	}
	public Brand findById(int id) {
		return brandRepository.findById(id).get();
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		brandRepository.deleteById(id);
	}
}
