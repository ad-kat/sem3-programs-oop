/*
 Write a Java program to find the result of the following expressions for various 
values of a & b:
a. (a << 2) + (b >> 2)
b. (b > 0)
c. (a + b * 100) / 10
d. a & b
 */
package expressions;

import java.util.*;
public class Expressions {

    
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a and b");
         
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=(a << 2) + (b >> 2);
         boolean t=(b > 0);
         double d=(a + b * 100) / 10;
         
         
          System.out.println(" (a << 2) + (b >> 2)="+c);
          System.out.println(" (b > 0)="+t);
          System.out.println(" (a + b * 100) / 10="+d);
          System.out.println(" a & b="+(a&b));
          
    }
    
}
