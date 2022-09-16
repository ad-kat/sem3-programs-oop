/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package non_diagonal;
import java.util.*;
public class Non_diagonal {
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
                    System.out.print("  \t");
                }
                else{
                    System.out.print(arr[i][j]+"\t");
                    sum+=arr[i][j];
                }
            }
            System.out.println();
          }
         System.out.println("Required sum="+sum);
    }
    
}
