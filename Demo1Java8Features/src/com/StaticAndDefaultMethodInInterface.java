package com;
interface Bank
{
	void loan();
	default void OT()
	{
		System.out.println("hi OT Method");
	}
	static void withdraw()
	{
		System.out.println("hi withdraw method");
	}
	
}
class SBI implements Bank
{
	@Override
	public void loan() {
		
	}
	
}
class Axis implements Bank
{
	@Override
	public void loan() {
		
	}
}

public class StaticAndDefaultMethodInInterface {

	public static void main(String[] args) {
		SBI s=new SBI();
		s.OT();//if default we have to create obj
		Bank.withdraw();//no need of object creation

	}

}
