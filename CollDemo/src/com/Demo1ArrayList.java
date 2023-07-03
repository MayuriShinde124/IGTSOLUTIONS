package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1ArrayList {

	public static void main(String[] args) {
		//List l=new List();
		//hetrogenous values
		//size is not fixed
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(10.5);
		al.add("mayuri");
		al.add('A');
		al.add(true);
		
	        Iterator i=al.iterator();
	        while(i.hasNext()) {
	            System.out.println(i.next());
	        }
	        
	        System.out.println("=====================");
	        System.out.println(al.contains(100));
	        System.out.println(al.size());
	        System.out.println(al.isEmpty());
	        System.out.println(al.contains(400));
	        System.out.println(al.contains(al));
	        
	        //System.out.println(a1.clear());
	              
	}

}
