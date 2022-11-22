package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Brand;
import com.example.demo.entity.Phone;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer>{
	@Query("select p from Phone p where p.brand.id = :id")
	public List<Phone> findPhoneByBrand(@Param("id") int brandId);
	@Query("select p from Phone p where p.name = :name")
	public List<Phone> findPhoneByName(@Param("name") String name);
}
