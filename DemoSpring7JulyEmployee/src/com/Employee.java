package com;

public class Employee {
	private int uid;
	private String name;
	private int age;
	private int salary;
	private String desig;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString()
	{
		return "Employee[uid="+uid+",name="+name+",age="+age+",salary="+salary+",desig="+desig+"]";
		
	}
	public void display()
	{
		System.out.println(uid+" :"+name+" :"+age+":"+salary+" : "+desig);
		
	}
}
