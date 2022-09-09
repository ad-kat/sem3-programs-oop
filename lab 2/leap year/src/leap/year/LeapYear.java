/*Write a Java program to find whether a given year is leap or not using boolean data 
type. [Hint: leap year has 366 days;]
Algorithm:
if (year is not exactly divisible by 4) then (it is a common year)
else
if (year is not exactly divisible by 100) then (it is a leap year)
else
if (year is not exactly divisible by 400) then (it is a common year)
else (it is a leap year)
*/
package leap.year;

import java.util.*;
 class LeapYear {

   
    public static void main(String args[])
    {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        int yr=sc.nextInt();
        boolean leap=(yr%4!=0)?true:false;
        if(leap)
            System.out.println("Not leap year");
        else 
            
            System.out.println(" leap year");
            
        
    }
    
}
