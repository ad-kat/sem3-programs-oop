/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package largest_smallest;

import java.util.*;
public class Largest_smallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("no.of array elements");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int l=arr[0],s=arr[0];
        for(int i=0;i<n;i++)
        { 
            if(arr[i]>l)
                   l=arr[i];
               if(arr[i]<s)
                   s=arr[i];
           
        }
        System.out.println(l+" is largest");
        System.out.println(s+" is smallest");
    }
    
}
