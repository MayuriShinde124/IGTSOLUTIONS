import java.util.*;
import java.io.*;
class FileHandling1
{
	
	  public static void main (String ar[])
	{        
		String line=null;
		try
		{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		System.out.println("enter file name");
		String fname=br.readLine();
		
		File f=new File(fname);
		if(f.exists())
		{
			BufferedReader fr=new BufferedReader(new FileReader(fname));
			while((line=fr.readLine())!=null)
			{
				System.out.println(line);
			}
		}
		else
		{	
                   System.out.println("sorry file not exits");
		}

		}
		catch(Exception e)
		{
		}
		
	
	}
}