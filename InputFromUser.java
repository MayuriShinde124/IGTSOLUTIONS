import java.util.*;
import java.io.*;
class  InputFromUser
{
	public static void main (String ar[])
	{
		try
		{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		
		
		System.out.println("enter id");
		int id=Integer.parseInt(br.readLine());

		System.out.println("enter first name");
		String fname=br.readLine();
		
		System.out.println("enter secoun name");
		String lname=br.readLine();

		System.out.println("ID : "+id);
		System.out.println("FIRST NAME : "+fname);
		System.out.println("LAST NAME : "+lname);

		}
		catch(Exception e)
		{
		}
		
	}
}