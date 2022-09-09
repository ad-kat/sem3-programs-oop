// Write a Java program to print table of number entered by user .
import java.util.*;
class table
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int a=0;
    System.out.println("enter the number");
    int num=sc.nextInt();
    for(int i=1;i<=12;i++)
    {
        a=i*num;
        System.out.println(num+"*"+i+"="+a);
    
    }
   
   
}
} 
