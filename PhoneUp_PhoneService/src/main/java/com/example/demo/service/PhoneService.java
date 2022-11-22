package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Phone;
import com.example.demo.repository.BrandRepository;
import com.example.demo.repository.PhoneRepository;

@Service
public class PhoneService {
	@Autowired
	private PhoneRepository phoneRepository;
	@Autowired
	private BrandRepository brandRepository;
	public Phone addPhone(Phone phone, int brandId) { 
		Brand brand = brandRepository.findById(brandId).get();
		phone.setBrand(brand);
		return phoneRepository.save(phone);
	}
	public Phone findById(int id) {
		return phoneRepository.findById(id).get();
	}
	
	public List<Phone> findByBrandId(int brandId){
		return phoneRepository.findPhoneByBrand(brandId);
	}
	
	public List<Phone> findAll(){
		return phoneRepository.findAll();
	}
	
	public void delete(int id) {
		phoneRepository.deleteById(id);
	}
	
	public Phone update(int id,Phone newPhone) {
		Phone phone = phoneRepository.findById(id).get();
		phone.setBrand(newPhone.getBrand());
		phone.setColor(newPhone.getColor());
		phone.setCpu(newPhone.getCpu());
		phone.setDescription(newPhone.getDescription());
		phone.setImgUrl(newPhone.getImgUrl());
		phone.setName(newPhone.getName());
		phone.setPrice(newPhone.getPrice());
		phone.setRam(newPhone.getRam());
		phone.setRom(newPhone.getRom());
		return phoneRepository.save(phone);
	}
	
	
}
