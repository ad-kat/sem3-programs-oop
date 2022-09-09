/*
Write a Java program to multiply and divide a number by 2 using bitwise operator.
[Hint: use left shift and right shift bitwise operators]
 */
package bitwise;

import java.util.*;
class Bitwise { 
  
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int mul2=n<<1;
        int div2=n>>1;
        System.out.println(n+"*2="+mul2);
        System.out.println(n+"/2="+div2);
        
    }
}
    

