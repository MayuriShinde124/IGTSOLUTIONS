class A
{
	public void display()
	{
		System.out.println("hiiiiiiii ");
	}
	
}
class B extends A
{
	public void display()
	{
		//same method name with different implementation in child class ......!!over riding 
		System.out.println("hellooooo ");
	}
	
}
class Demo19
{
public static void main(String ar[])
{
	B b=new B();
	b.display();
}
}
