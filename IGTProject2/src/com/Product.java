package com;

public class Product
{
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	private int pid;
	private String pname;
	private String price;
	private String pdesc;
	public void display() {
		System.out.println(pid+" "+pname+" "+price+"  "+pdesc);
		
	}
	
}