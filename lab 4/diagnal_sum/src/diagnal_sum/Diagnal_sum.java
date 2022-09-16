
package diagnal_sum;

import java.util.*;
public class Diagnal_sum {

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
                 System.out.print(arr[i][j]+"\t");
            }
             System.out.println();
          }
          for(int i=0;i<r;i++)
          {
            for(int j=0;j<r;j++)
            {
                if(i==j)
                {
                    System.out.print(arr[i][j]+"\t");
                    sum+=arr[i][j];
                }
                else{
                    continue;
                }
            }
            
          }
         System.out.println("Required sum="+sum);
    }
    
}
