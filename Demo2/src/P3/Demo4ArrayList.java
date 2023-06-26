package P3;

import java.util.Date;

import javax.swing.*;

import java.util.*;

public class Demo4ArrayList {
	public static void main (String ar[])
	{
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(10.5);
		al.add("mayuri");
		al.add('A');
		al.add(true);
     	al.add(new Thread());
     	al.add(new Date());
     	//al.add(new Emp());

        System.out.println(al);
        
        for(int i=0;i<al.size();i++) {
            System.out.println(al.get(i));
        }
        System.out.println("=====================");
        Iterator i=al.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
         
        
		
	}

}
