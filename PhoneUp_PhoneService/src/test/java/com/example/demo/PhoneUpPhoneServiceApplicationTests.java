package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Phone;
import com.example.demo.service.PhoneService;

@SpringBootTest
class PhoneUpPhoneServiceApplicationTests {
	@Autowired
	private PhoneService phoneService; 
//	@Test
//	public void findAll() {
//		phoneService.findAll().forEach(p -> {
//			System.out.println(p);
//		});
//	}
	@Test
	public void add() {
//		Phone p1 = new Phone();
//		p1.setName("Iphone 13 pro max");
//		p1.setColor("Red");
//		p1.setPrice(30000000);
//		p1.setDescription("Test1");
//		p1.setImgUrl("Test1");
//		p1.setCpu("Test1");
//		p1.setRam(8);
//		p1.setRom(64);
//		p1.setBrandId(1);
//		Phone p2 = new Phone();
//		p2.setName("Iphone 13 pro max");
//		p2.setColor("Black");
//		p2.setPrice(30000000);
//		p2.setDescription("Test1");
//		p2.setImgUrl("Test1");
//		p2.setCpu("Test1");
//		p2.setRam(8);
//		p2.setRom(64);
//		p2.setBrandId(2);
//		
//		phoneService.add(p1);
//		phoneService.add(p2);
	}
	
	
}
