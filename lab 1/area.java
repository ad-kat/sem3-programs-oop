// To write a program in Java to find the area of a rectangle and verify the same with  various inputs(length, breadth)
import java.util.*;
class area
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length");
   int l=sc.nextInt();
   System.out.println("enter breadth");
   int b=sc.nextInt();
   int c=l*b;
   System.out.println("area="+c);
}
}