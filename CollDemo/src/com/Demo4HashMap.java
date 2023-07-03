package com;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.*;

public class Demo4HashMap {
	public static void main(String ar[])
	{
	       //list :will allow the duplicate 
			//SET
		    //MAP=List+Set
		
			//HashSet al=new HashSet<>();//no duplicates
			//LinkedHashSet al=new LinkedHashSet<>();//no duplicates + user entered order
			//TreeSet al=new TreeSet();//no duplicates + sorted order
			
		//HashMap map=new HashMap<>();//no duplicate
		//LinkedHashMap map=new LinkedHashMap<>();//no duplicates + user entered order
		TreeMap map=new TreeMap<>();////no duplicates + sorted order
			
			map.put(111,"mayuri");
			map.put(222,"rani");
			map.put(888,"gauri");
			map.put(111,"palak");
			map.put(555,"riya");
			map.put(666,"rita");
			
			Set s=map.entrySet();
			
		        Iterator i=s.iterator();
		        while(i.hasNext()) {
		            System.out.println(i.next());
		        }
	}        

}
