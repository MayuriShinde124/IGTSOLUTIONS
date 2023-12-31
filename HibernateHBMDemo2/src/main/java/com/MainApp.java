package com;
import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

public class MainApp {
public static void main(String args[]) {

    Configuration cfg= new Configuration();
    cfg.configure("hibernate.cfg.xml");

    SessionFactory factory=cfg.buildSessionFactory();
    Session sesion=factory.openSession();
    Transaction tx= sesion.beginTransaction();

    Employee e = new Employee();
    Scanner sc= new Scanner(System.in);

        System.out.println("ENter  ID : ");
        int pid=sc.nextInt();        

        System.out.println("Enter First Name :");
        String fname=sc.next();

        System.out.println("Enter LAST name  : ");
        String lname=sc.next();
        e.setId(pid);
        e.setFirstName(fname);
        e.setLastName(lname);

        sesion.save(e);
        tx.commit();

        System.out.println("Saved Succcessfully...!");
        }
}