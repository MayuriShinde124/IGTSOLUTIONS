import java.util.*;
class A
{
	A()
	{
		System.out.println("A Class");
	}
	void abc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		int a=sc.nextInt();
		System.out.print("Enter B :");
		int b=sc.nextInt();
		System.out.print("Enter C :");
		int c=sc.nextInt();

		if(a>b && a>c)
		{
			System.out.println(+a+"  A is Greater");
		}
		else if(b>c && b>a )
		{
			System.out.println(+b+" B is Greater");
		}
		else
		{
			System.out.println(+c+" C is Greater");		}
			
	         }
}
class Demo7
{	public static void main(String arg[])
	{
		A a=new A();
		a.abc();	
	}
}

