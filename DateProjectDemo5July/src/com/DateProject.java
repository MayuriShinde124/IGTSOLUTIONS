package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
class A
{
	A()
	{
		

	Date d=new Date();
	System.out.println(d);
	
	LocalDate l=LocalDate.now();
	System.out.println(l);
	
	LocalDate tomorrow =LocalDate.now().plusDays(1);
	System.out.println("tomorrow is : "+tomorrow);
	
	DayOfWeek sunday=LocalDate.parse("2016-06-12").getDayOfWeek();
	int tweleve =LocalDate.parse("2016-06-12").getDayOfMonth();
	
	System.out.print(sunday);
	System.out.print(tweleve);
	
	LocalTime now = LocalTime.now();
	System.out.println(now);
	
	
	

      }
}
public class DateProject
{
	public static void main(String ar[])
	{
		A a=new A();
	}
}