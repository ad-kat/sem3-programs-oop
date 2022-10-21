
package employees;
import java.util.*;

class employee
{
    int basic_salary;
    int dearness_allowance;
    int house_rent;
    int total;

    public void getdata(int sal, int all, int ren)
    {
        basic_salary = sal;
        dearness_allowance = all;
        house_rent = ren;
    }

    public void calculate()
    {
       total = basic_salary + (basic_salary*dearness_allowance)/100 + house_rent;
    }

    public void display()
    {
        System.out.println("The total is: " +total);
    }
}

class Employees
{
    public static void main(String[] args)
    {
       int salary, allowance, rent;  
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your name:");
       String name = sc.nextLine();
       System.out.println("Enter your city name:");
       String city = sc.nextLine();

       System.out.println("Enter your basic salary:");
       salary = sc.nextInt();
       System.out.println("Enter your dearance allowance:");
       allowance = sc.nextInt();
       System.out.println("Enter house rent:");
       rent = sc.nextInt();

       System.out.println("YOUR NAME: " +name+ "\nYOUR CITY: " +city);

       employee emp = new employee();
       emp.getdata(salary, allowance, rent);
       emp.calculate();
       emp.display();
    }
}