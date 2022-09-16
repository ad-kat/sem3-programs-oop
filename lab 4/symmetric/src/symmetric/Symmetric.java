/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package symmetric;

import java.util.*;
public class Symmetric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc=new Scanner(System.in);
        System.out.println("enter dimensions");
        int r=sc.nextInt();
        int flag=0;
        int arr[][]=new int[r][r];
        int arr2[][]=new int[r][r];
         System.out.println("enter matrix elements");
         for(int i=0;i<r;i++)
         {
         for(int j=0;j<r;j++)
             arr[i][j]=sc.nextInt();
         }
         for(int i=0;i<r;i++)
         {
         for(int j=0;j<r;j++)
             arr2[j][i]=arr[i][j];
         }
         for(int i=0;i<r;i++)
         {
             for(int j=0;j<r;j++)
             {
                if(arr[i][j]!=arr2[i][j])
                    flag=1;
             }             
         }
         if(flag==0)
             System.out.println("SYMMETRIC");
         else 
             System.out.println("NOT SYMMETRIC");
         
    }
    
}
