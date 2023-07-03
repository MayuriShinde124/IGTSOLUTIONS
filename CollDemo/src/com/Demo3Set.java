package com;

import java.util.ArrayList;
import java.util.*;

public class Demo3Set {

	public static void main(String[] args) {
		
		//list :will allow the duplicate 
		
		//ArrayList al=new ArrayList();
		//LinkedList al=new LinkedList();
		//vector al=new Vector();
		//Stack s1=new Stack<>();
		
		//SET
		//HashSet al=new HashSet<>();//no duplicates
		//LinkedHashSet al=new LinkedHashSet<>();//no duplicates + user entered order
		TreeSet al=new TreeSet();//no duplicates + sorted order
		
		
		//al.add(100);
		//al.add(100);
		//al.add(900);
		//al.add(300);
		//al.add(200);
		//al.add(500);
		al.add("mayuri");
		al.add("Pallavi");
		al.add("divya");
		
	        Iterator i=al.iterator();
	        while(i.hasNext()) {
	            System.out.println(i.next());
	        }
	        
	      
	        
	    

	}
	
//LIST                               SET
//========================================================
	//Duplicate                        no duplicate value
	//will maintain the order         hash set :no duplicate
	//                                LinkedHashSet :no duplicates + user entered order
	//                                TreeSet : no duplicates + sorted order

}
