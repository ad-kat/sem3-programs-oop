// Write a Java programs to print factorial of a given no.
import java.util.*;
class factorial
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    //int a=0,b=0,c=0;
    System.out.println("enter the number");
    int num=sc.nextInt();
    int fact=1,nn=num;
    while(nn>0)
    {
        int d=nn%10;
        nn--;
        fact=fact*d;
    }
    
    System.out.println("factorial of "+num+" is:"+fact);
   

}
}