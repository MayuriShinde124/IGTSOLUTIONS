package com;

import java.io.*;
import java.io.FileReader;

public class FileHandling1 {
	public static void main(String ar[])
	{
		String line=null;
		try
		{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		System.out.println("enter file name");
		String fname=br.readLine();
		
		File f=new File("/DateProjectDemo5July/src/com/emp.txt");
		if(f.exists())
		{
			BufferedReader fr=new BufferedReader(new FileReader("/DateProjectDemo5July/src/com/emp.txt"));
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


