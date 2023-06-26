import java.util.*;
class A
{	int id;
	String name;
	A()
	{
		System.out.println("A Class");
		//if I create a Child Class object automatically parent class default construtor will call 
	}
}
class B extends A
{
	B()
	{
		System.out.println("B Class");
	}
}
class Demo11
{
	public static void main(String ar[])
	{
		//A b=new A();
		//B b=new B();

		B b=new B();
	}
}

/*
A cn 
B co: 
        both 
 
A 
no B : 
        only A 
 
B 
no A 
        only B 
No A 
No B :     
        no output

*/

/*
3 class 30 lines of code 
 
100 class :
        100 * 10 lines - 1000 lines of code we reduced 

        our application performace will be incressesssssss....!
        fast 
*/