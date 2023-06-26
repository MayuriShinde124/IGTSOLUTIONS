class A
{
	int a1=1000;

}
class B extends A
{
	int a1=100;
	void abc(int a1)
	{
  		System.out.println("Hii B class "+a1);
		System.out.println("hii B Class  "+this.a1);
		System.out.println("hii A Class  "+super.a1);
	}

}
class Demo9
{

	public static void main(String ar[])
	{
		B b=new B();
		b.abc(10);

	}

}