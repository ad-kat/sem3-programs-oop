//Write a program to check whether a number is palindrome or not.
import java.util.*;
class palindrome
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    //int a=0,b=0,c=0;
    System.out.println("enter the number");
    int num=sc.nextInt();
    int nn=num;int n=0;
    while(nn>0)
    {
        int d=nn%10;
        nn=nn/10;
        n=n*10+d;
    }
    if(num==n) 
    System.out.println("Palindrome");
    else
    System.out.println(" NOT Palindrome");

}
}