/*
 Define a class Employee with data members: employee name, city, basic salary, 
dearness allowance (DA%) and house rent (HRA%). Define getdata(), calculate(), and 
display() functions. Calculate method should find the total salary and display method 
should display it.
 Total = basic+basic*da/100+basic*hra/100;
 */
package employees;

import java.util.*;
public class Employees 
{
    String empname,city;
    double salary,DA,HRA;
    
    public Employees()
    {
        empname="";
        city="";
        salary=0.0;
        DA=0.0;
        HRA=0.0;
        
    }
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name:");
        empname=sc.nextLine();
        System.out.println("Enter city:");
        city=sc.nextLine();
        System.out.println("Enter basic salary:");
        salary=sc.nextDouble();
        System.out.println("Enter dearness allowance (DA%):");
        DA=sc.nextDouble();
        System.out.println("Enter house rent (HRA%):");
        HRA=sc.nextDouble();
    }
    void cA
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
