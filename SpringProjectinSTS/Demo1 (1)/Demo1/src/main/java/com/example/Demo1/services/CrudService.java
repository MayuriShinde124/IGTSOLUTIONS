package com.example.Demo1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Demo1.model.Product;
import com.example.Demo1.repo.CrudRepo;

@Service
public class CrudService {
	
	@Autowired
    private CrudRepo repo;
	
	
	public List<Product> fetchProductList()
	{
		return repo.findAll();
	}
	

	public Optional<Product> fetchProductListByid(int id)
	{
		return repo.findById(id);
	}


	public Product saveProductToBD(Product product)
	{
		return repo.save(product);
	}


	public String deleteProductListbyId(int id)
	{
		String result;
		try {
			repo.deleteById(id);
			result="deleted";
			
		}
		catch(Exception e){
			result="not deleted";
		}
		return result;
	}
}
