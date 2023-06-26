class A
{

	A()
	{
		System.out.println("A Class");
	}
	void abc()
	{
		System.out.println("ABC Method");
	}
}
class Demo6
{	public static void main(String arg[])
	{
		System.out.println("Demo4");
		A a=new A();
		a.abc();
		a.abc();
		a.abc();
	}
}