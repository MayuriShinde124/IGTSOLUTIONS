package com;

import java.util.*;
public class Demo2ForEach {

 

    public static void main(String[] args) {
       ArrayList al = new ArrayList<>();
       al.add("Apple");
       al.add("Banana");
       al.add("Grapes");
       al.add("Jack");
       al.add("Orange");

 

       Iterator i = al.iterator();
       while(i.hasNext()) {
           System.out.println(i.next());
       }
       System.out.println("============For Each Loop=============");

       al.forEach(fruits->{System.out.println(fruits);});

       int arr[] = {1,34,2,4,56,6,4,33};
       for(int i1=0;i1<arr.length;i1++) {
           System.out.println(arr[i1]);
       }
       System.out.println("======================================");
           for(int j: arr) {
               System.out.println(j);

           }
    }

 

}