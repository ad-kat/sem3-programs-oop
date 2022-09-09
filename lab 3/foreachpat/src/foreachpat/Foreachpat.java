
package foreachpat;

import java.util.*;
public class Foreachpat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("make pattern upto number:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
         for(int num:arr)
         {
             for(int i=1;i<=num;i++)
             {
                System.out.print(num+"\t"); 
             }
             System.out.println(); 
         }
        
    }
    
}
