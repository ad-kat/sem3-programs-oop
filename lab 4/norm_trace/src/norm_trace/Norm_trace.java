/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package norm_trace;

import java.util.*;
public class Norm_trace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter dimension:");
        int r=sc.nextInt();
        int arr[][]=new int[r][r];
         System.out.println("enter matrix elements");
         for(int i=0;i<r;i++)
         for(int j=0;j<r;j++)
             arr[i][j]=sc.nextInt();
         int sum=0;
         for(int i=0;i<r;i++)
          {
            for(int j=0;j<r;j++)
            {
                if(i==j)
                {                   
                   sum+=arr[i][j];
                }
                else{
                    continue;
                }
            }
            
          }
         System.out.println("trace="+sum);
         double sq,ssum=0.0;
         for(int i=0;i<r;i++)
          {
            for(int j=0;j<r;j++)
            {
                   sq=Math.pow(arr[i][j],2);                
                   ssum+=sq;
            }
                
          }
         double norm=Math.sqrt(ssum);
          System.out.println("Norm="+norm);
            
      }
    }
    

