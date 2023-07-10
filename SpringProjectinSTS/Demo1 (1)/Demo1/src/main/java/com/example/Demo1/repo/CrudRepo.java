package com.example.Demo1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Demo1.model.Product;

public interface CrudRepo extends JpaRepository<Product,Integer>
{
	

}
