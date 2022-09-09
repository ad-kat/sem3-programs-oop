//Write a program to compute whether a no . is an Armstrong number or not.Use any of the iteration statements
import java.util.*;
class Armstrong
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int num=n,w=0;
        while(n!=0)
        {
            int d=n%10;
            n=n/10;
            w=w + (int)Math.pow(d,3);
        }
        if(w==num)
        System.out.println("ARMSTRONG number");
        else
        System.out.println("NOT ARMSTRONG number");
    }
}