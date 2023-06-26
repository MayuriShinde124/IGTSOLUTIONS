import java.util.*;
class Clerk
{
	int id,age,salary=20000;
	String name,designation="Clerk";
	Scanner sc=new Scanner(System.in);
	Clerk()
	{ 	System.out.println("For Clerk ::::::::: ");
		System.out.print("Enter the ID ?");
		id=sc.nextInt();
		System.out.print("Enter the Name ?");
		name=sc.next();
		System.out.print("Enter the Age ?");
		age=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("+++++++++++++++++++++++++Clerk  Details+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Name :"+name);
		System.out.println("ID :"+id);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+this.salary);
		System.out.println("Designation :"+this.designation);
	}
}
class Developer
{
	int id,age,salary=80000;
	String name,designation="Developer";
	Scanner sc=new Scanner(System.in);
	Developer()
	{ 
		System.out.println("For Developer :::::::");
		System.out.print("Enter the ID ?");
		id=sc.nextInt();
		System.out.print("Enter the Name ?");
		name=sc.next();
		System.out.print("Enter the Age ?");
		age=sc.nextInt();
		
	}
	void display()
	{	System.out.println("++++++++++++++++++++++++++++++++Developer Details+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Name :"+name);
		System.out.println("ID :"+id);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Designation :"+designation);
	}

}
class Manager
{
	int id,age,salary=100000;
	String name,designation="Manager";
	Scanner sc=new Scanner(System.in);
	Manager()
	{
		System.out.println("For Manager :::::::");
		System.out.print("Enter the ID ?");
		id=sc.nextInt();
		System.out.print("Enter the Name ?");
		name=sc.next();
		System.out.print("Enter the Age ?");
		age=sc.nextInt();
		
	}
	void display()
	{	System.out.println("++++++++++++++++++++++++++++++++++++++Manager  Details++++++++++++++++++++++++++++++++++++++");
		System.out.println("Name :"+name);
		System.out.println("ID :"+id);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Designation :"+designation);
	}

}
class Tester
{
	int id,age,salary=40000;
	String name,designation="Tester";
	Scanner sc=new Scanner(System.in);
	Tester()
	{
		System.out.println("For Tester  :::::: ");
		System.out.print("Enter the ID ?");
		id=sc.nextInt();
		System.out.print("Enter the Name ?");
		name=sc.next();
		System.out.print("Enter the Age ?");
		age=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++Tester Details++++++++++++++++++++++++++++++++++");
		System.out.println("Name :"+name);
		System.out.println("ID :"+id);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Designation :"+designation);
	}

}
class Project
{
	public static void main(String ar[])
	{
		int ch;		
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1.  Clerk");
			System.out.println("2.  Developer");
			System.out.println("3.  Manager");
			System.out.println("4.  Tester");
			System.out.println("5.  Exit");
			System.out.print("Enter the Choice : ");
			ch=sc.nextInt();
			if(ch==1)
			{
				Clerk c=new Clerk();
				c.display();
			}
			else if(ch==2)
			{
				Developer d=new Developer();
				d.display();
			}
			else if(ch==3)
			{
				Manager m=new Manager();
				m.display();
			}
			else if(ch==4)
			{
				Tester t=new Tester();
				t.display();
			}
			else if(ch==5)
			{
				System.out.println("thank you");
				System.exit(0);
			}
		}while(ch<=4);

	}

}
