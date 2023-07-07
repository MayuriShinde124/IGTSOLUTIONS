package com;

public class Student {
   private int sid;
   private String sname;
   private int smarks;
   public int getSmarks() {
	return smarks;
}


public void setSmarks(int smarks) {
	this.smarks = smarks;
}


public int getSid() {
	return sid;
}


public void setSid(int sid) {
	this.sid = sid;
}


public String getSname() {
	return sname;
}


public void setSname(String sname) {
	this.sname = sname;
}


public String getSection() {
	return section;
}


public void setSection(String section) {
	this.section = section;
}


private String section;
   
   
public void display() {
	System.out.println("id : "+sid);
	System.out.println("name : "+sname);
	System.out.println("section : "+section);
	System.out.println("Marks : "+smarks);
}
}
