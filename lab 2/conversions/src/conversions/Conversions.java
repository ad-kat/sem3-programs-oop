/*Write a Java program to read an int number, double number and a char from keyboard 
and perform the following conversions:- int to byte, char to int, double to byte, double 
to int*/
package conversions;

import java.util.*;
public class Conversions {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer value");
        int n=sc.nextInt();
        System.out.println("Enter a double value");
        double d=sc.nextDouble();
        System.out.println("Enter an char value");
        char ch=sc.next().charAt(0);
        byte b=(byte)n;
        int c=(int)ch;
        byte d1=(byte)d;
        int d2=(int)d;
        System.out.println("int "+n+" = byte"+b);
        System.out.println("char "+ch+" = int"+c);
        System.out.println("double "+d+" = byte"+d1);
        System.out.println("double "+d+" = int"+d2);
        
    }
    
}
