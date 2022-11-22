package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_phone")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "phone_id")
	private int id;
	@Column
	private String name;
	@Column
	private double price;
	@Column
	private String color;
	@Column
	private int ram;
	@Column
	private int rom;
	@Column
	private String cpu;
	@Column
	private String description;
	@Column
	private String imgUrl;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
	@JsonIgnore
	private Brand brand;
	
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phone(String name, double price, String color, int ram, int rom, String cpu, String description,
			String imgUrl, Brand brand) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.ram = ram;
		this.rom = rom;
		this.cpu = cpu;
		this.description = description;
		this.imgUrl = imgUrl;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", ram=" + ram
				+ ", rom=" + rom + ", cpu=" + cpu + ", description=" + description + ", imgUrl=" + imgUrl + ", brand="
				+ brand + "]";
	}
	
	
}
