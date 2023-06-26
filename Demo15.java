class A
{
	A()
	{
		System.out.println("A()");
	}
	
	A(int a)
	{
		System.out.println("A(int a)");
	}
	
	A(int a,String name)
	{
		System.out.println("A(int a,String name)");
	}

}
class Demo15
{
	public static void main(String ar[])
	{
		A a=new A();
		A a1=new A(10);
		A a2=new A(100,"Mayuri");
	}

}

//over loading 
//same constructor name- + multiple time + with different parametern + in same class called constructor