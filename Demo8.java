class A
{
	int a1=100;

	void abc(int a1)
	{
  		System.out.println("Hii A class "+this.a1);
		System.out.println("hii A Class  "+a1);
	}
}
class Demo8
{

	public static void main(String ar[])
	{
		A a=new A();
		a.abc(1000);

	}

}