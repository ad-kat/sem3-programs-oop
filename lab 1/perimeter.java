//  Write a Java program to find area and circumference of a rectangle. (Hint: circumference = 2 (length + breadth) ; area= length x breadth).
import java.util.*;
class perimeter
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter length");
   int l=sc.nextInt();
   System.out.println("enter breadth");
   int b=sc.nextInt();
   int c=l*b;
   int peri=2*(l+b);
   System.out.println("area="+c);
   System.out.println("circumference="+peri);
}
}