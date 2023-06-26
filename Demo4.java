import java.util.*;
class A
{
	int id,age,salary;
	String name,designation;
 	A()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ID ?");
		id=sc.nextInt();

		System.out.print("Enter the Name ?");
		name=sc.next();

		System.out.print("Enter the Age ?");
		age=sc.nextInt();
		
		System.out.print("Enter the Designation ?");
		designation=sc.next();

		System.out.print("Enter the Salary?");
		salary=sc.nextInt();

	}
	void display()
	{
		System.out.println("==========================================================");
		System.out.println("Name :"+name);
		System.out.println("ID :"+id);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Designation :"+designation);
	}
	
}
class Demo4
{
 	public static void main(String arg[])
	{
		System.out.println("Demo4");
		A a=new A();
		a.display();
	}
}