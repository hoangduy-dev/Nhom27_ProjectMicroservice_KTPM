package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Phone;
import com.example.demo.service.PhoneService;

@RestController
@CrossOrigin()
public class PhoneController {
	@Autowired
	private PhoneService phoneService;
	@PostMapping("/phones/{brandId}")
	public Phone add(@RequestBody Phone phone, @PathVariable("brandId") int id) throws Exception {
		return phoneService.addPhone(phone, id);
	}
	@GetMapping("/phones")
	public List<Phone> findAll(){
		return phoneService.findAll();
	}
	@GetMapping("/phones/brands/{brandId}")
	public List<Phone> findbyBrandId(@PathVariable("brandId") int brandId){
		return phoneService.findByBrandId(brandId);
	}
	@GetMapping("/phones/{id}")
	public Phone findById(@PathVariable("id") int id) {
		return phoneService.findById(id);
	}
	@DeleteMapping("/phones/{id}")
	public void delete(@PathVariable("id") int id) {
		phoneService.delete(id);
		System.out.println("Deleted Successful !!");
	}
	@PutMapping("/phones/{id}")
	public Phone update(@PathVariable("id") int id, Phone phone) {
		return phoneService.update(id, phone);
	}
}
