package com;

public class Product {
	private int pid;
	private String pname;
	private String price;
	private String pdesc;
	
	
	public Product(int pid, String pname, String price, String pdesc) 
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.pdesc = pdesc;
	}
	public String toString()
	{
		return "Product[id="+pid+",pname="+pname+",price="+price+",pdesc="+pdesc+"]";
		
	}

	public void display() 
	{
		System.out.println("Product id : "+pid);
		System.out.println("Product Name : "+pname);
		System.out.println("Product Price : "+price);
		System.out.println("Product Decscription : "+pdesc);
		System.out.println(pid+" "+pname+" "+price+"  "+pdesc);
    }
}
