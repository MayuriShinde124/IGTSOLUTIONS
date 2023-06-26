import java.util.*;
class CharCount
{	public static void main(String arg[])
	{
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string  : ");
		String str=sc.next();
		
		
 		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count=count+1;
			}
		
			
		}
		System.out.println("Character in string  : "+count);
		
			
	}
}

