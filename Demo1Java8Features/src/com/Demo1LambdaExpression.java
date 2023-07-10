package com;
interface I
{
     void add();
}
interface Cal
{
	int mul(int a,int b);
}
public class Demo1LambdaExpression {
     public static void main(String ar[])
     {
            I i=new I() {
            	public void add()
            	{
            		System.out.println("hi demo");
            	}
            };
            i.add();
            
            System.out.println("=======================");
             I i1=()->{
            	System.out.println("hi lambda"); 
             };
             i1.add();
            

             System.out.println("=============@parameters============");
              Cal c1=(int a,int b)->(a*b);
             	System.out.println("multiplication : "+c1.mul(10, 4)); 
              
            
            	
     }
}
