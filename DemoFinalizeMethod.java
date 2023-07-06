class A
{
	int a=100;
	A()
	{

	}
	public void finalize()
	{
		System.out.println("object removed......!");
	}

}
class B
{
	int b=100;
	B()
	{

	}
	public void finalize()
	{
		System.out.println("object removed......!");
	}
}
class DemoFinalizeMethod
{
public static void main(String ar[])
{
	A a1=new A();
	B b1=new B();
	
	System.out.println(a1.a);
	System.out.println(b1.b);

	a1=null;
	b1=null;

	
	//System.out.println(a1.a);
	//System.out.println(b1.b);
	System.gc();//garbage collector //this is internal process
   
}
}