package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
  int id;
  String name;
  float price;
  
  public Product(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}

  
 
}

public class Demo5 {

	public static void main(String[] args) {
	
		ArrayList<Product>prod=new ArrayList<Product>();
		prod.add(new Product(100,"oppo",89000));
		prod.add(new Product(680,"vivo",19000));
		prod.add(new Product(300,"mi",34000));
		prod.add(new Product(200,"samsung",25000));
		
		for(Product product:prod)
		{
			if(product.price<300000)
			{
				System.out.println(product.id+" : "+product.name+" : "+product.price);
			}
		}
		
		System.out.println("=====================");
		List myproduct=prod.stream()
				.filter(p->p.price<500000)
				.map(p->p.price)
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(myproduct);
		
		
	}

}
