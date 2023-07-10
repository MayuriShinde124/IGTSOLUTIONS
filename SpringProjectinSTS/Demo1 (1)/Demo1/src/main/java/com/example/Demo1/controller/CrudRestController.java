package com.example.Demo1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo1.model.Product;
import com.example.Demo1.services.CrudService;

@RestController
public class CrudRestController {

	@Autowired
	private CrudService serv;
	
	@GetMapping("")
	public String entrypage()
	{
		return "welcome to spring mvc application chrome";
	}
	
	@GetMapping("/getProd")
	public List<Product> fetchProductList()
	{
		List<Product> products=new ArrayList<>();
		products=serv.fetchProductList();
      	return products;
	}
	
	@GetMapping("/getProd/{id}")
	public Product fetchProductListById(@PathVariable int id)
	{
		return serv.fetchProductListByid(id).get();
	}
	
	@PostMapping("/addProd")
	public Product saveProductList(@RequestBody Product product)
	{
		return serv.saveProductToBD(product);
	}
	
	
	@PutMapping("/updateRecord")
	public Product updateProductList(@RequestBody Product product)
	{
		return serv.saveProductToBD(product);
	}
	
	@DeleteMapping("/deleteProd/{id}")
	public String deleteProductListById(@PathVariable int id)
	{
		return serv.deleteProductListbyId(id);
	}
	
}
