/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplication;

import java.util.*;
public class Multiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
         System.out.println("enter dimensions for a[][]");
        int r1=sc.nextInt();        
        int r2=sc.nextInt();
        System.out.println("enter dimensions for b[][]");
        int r3=sc.nextInt();
        int r4=sc.nextInt();
        int a[][]=new int[r1][r2]; 
        int b[][]=new int[r3][r4];
        int sum[][]=new int[r1][r2];
        int mul[][]=new int[r1][r4]; 
        
    if(r1!=r3||r2!=r4)
        System.out.println("addition is not possible");       
    else if(r2!=r3)
         System.out.println("multiplication is not possible");
    else
    {
        int r=r1,c=r2;
        System.out.println("enter elements for a[][]");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)   
                   a[i][j]=sc.nextInt();
        System.out.println("enter elements for b[][]");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)   
                   b[i][j]=sc.nextInt();
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                
                sum[i][j]=a[i][j]+b[i][j];
            }
                
        }
        System.out.println("sum is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(sum[i][j]+"\t");
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mul[i][j]=0;
              for(int k=0;k<c;k++)      
                {      
                    mul[i][j]+=a[i][k]*b[k][j];      
                }  
            }
        }
        
        
        System.out.println("product is:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<r4;j++)
                System.out.print(mul[i][j]+"\t");
            System.out.println();
        }
    }
    }    

    
}

