package com;

 

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Id;

 

@Entity
public class EmployeeIGT { 

    @Id
    private int uid; 
    private String name; 
    private String desig;
    private int age;
    private int salary;
    


    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesig() {
        return desig;
    }
    public void setDesig(String desig) {
        this.desig = desig;
    } 
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    

}