import java.util.*;
class Emp
{
	int id;
	String name;
	Scanner sc= new Scanner(System.in);
	
	Emp()
	{
		 // as soon as we create a child class object it automatically create or call a super class default constrauctor ....!
		System.out.print("Enter ID: ");
		id= sc.nextInt();
		System.out.print("Enter Name :");
		name= sc.next();
	}

}
class Clerk extends Emp
{
	void display()
	{
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);	
	}
}
class Developer extends Emp
{
	void display()
	{
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);	
	}
}
class Tester extends Emp
{
	void display()
	{
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);	
	}
}
class Demo12
{
	public static void main(String args[])
	{
		System.out.println("===============CLERK====================");
		Clerk c=new Clerk ();
		c.display();
		System.out.println("================DEVELOPER=======================");
		Developer d=new Developer();
		d.display();
		System.out.println("================TESTER====================");
		Tester t=new Tester();
		t.display();	
	}
}