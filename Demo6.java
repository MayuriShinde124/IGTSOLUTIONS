import java.util.*;
class A
{

	A()
	{
		System.out.println("A Class");
	}
	void abc()
	{
		System.out.println("ABC Method");
		int a,b,c;
			

	}

}
class Demo6
{	public static void main(String arg[])
	{
		System.out.println("Demo6");
		A a=new A();//always try to create once
		a.abc();//methods can call many times
		a.abc();
		a.abc();
	}
}


//Constructor                                    Method
//A(){}						same+other name also
//no return type				return type
//always create once				created many time
//internally it allocate the memory		it just utlize same memory	