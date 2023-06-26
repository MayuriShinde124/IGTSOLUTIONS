import java.util.*;
class Demo2
{

 	public static void main(String arg[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ID ?");
		int id=sc.nextInt();

		System.out.print("Enter the Name ?");
		String name=sc.next();

		System.out.print("Enter the Age ?");
		int age=sc.nextInt();
		
		System.out.print("Enter the Designation ?");
		String designation=sc.next();

		System.out.print("Enter the Salary?");
		int salary=sc.nextInt();


		System.out.println("Name :"+name);
		System.out.println("ID :"+id);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		System.out.println("Designation :"+designation);
		
	}
}