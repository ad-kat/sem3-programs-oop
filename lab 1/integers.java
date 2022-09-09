// Write a Java program to enter 10 numbers and display the number of positive,negative and zeros number
import java.util.*;
class integers
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int a=0,b=0,c=0;
    System.out.println("enter 10 numbers");
    for(int i=1;i<=10;i++)
    {
    int num=sc.nextInt();
    if(num>0) a++;
    else if(num==0) b++;
    else c++;
    }
   
   System.out.println("positive numbers:"+a);
   System.out.println("negative numbers:"+c);
   System.out.println("Total zeroes:"+b);
}
}