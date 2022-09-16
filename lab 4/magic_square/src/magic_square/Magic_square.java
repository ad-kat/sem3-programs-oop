/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package magic_square;

import java.util.*;
public class Magic_square {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dimensions");
        int r=sc.nextInt();
        int flag=0,sum=0;
        int arr[][]=new int[r][r];
         System.out.println("enter matrix elements");
         for(int i=0;i<r;i++)
         {
         for(int j=0;j<r;j++)
             arr[i][j]=sc.nextInt();
         }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(i==j)
                    sum+=arr[i][j];
            }
        }
        if(flag==0)
        {
           for(int i=0;i<r;i++)
        {           
            for(int j=0;j<r;j++)
            {
                int num=arr[i][j];
                for(int k=0;k<r;k++)
                {
                    for(int l=0;l<r;l++)
                    {
                        if(num==arr[k][l])
                            flag=1;
                    }
                }
            }
            
        } 
        }
        if(flag==0)
        {
           for(int i=0;i<r;i++)
        {
           int rsum=0;
            for(int j=0;j<r;j++)
            {
               
                    rsum+=arr[i][j];
            }
            if(sum!=rsum)
                flag=1;
            break;
        } 
        }
        if(flag==0)
        {
           for(int i=0;i<r;i++)
        {
           int csum=0;
            for(int j=0;j<r;j++)
            {
               
                    csum+=arr[j][i];
            }
            if(sum!=csum)
                flag=1;
            break;
            
        } 
        }
        if(flag==0)
            System.out.println("MAGIC SQUARE");
        else 
             System.out.println("NOT magic square");
    }
    
}
