/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package merge_sort;

import java.util.*;
public class Merge_sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("no.of array elements in a[]");
        int n1=sc.nextInt();
        int a[]=new int[n1];
        System.out.println("no.of array elements in b[]");
        int n2=sc.nextInt();
        int b[]=new int[n2];
        System.out.println("Enter array elements for a[]");
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter array elements for b[]");
        for(int i=0;i<n2;i++)
        {
            b[i]=sc.nextInt();
        }
        int n3=n1+n2;
        int c[]=new int[n3];
        for(int i=0;i<n1;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<n2;i++)
        {
           c[i+n1]=b[i];
        }
        
        for(int i=0;i<n3;i++)
        {
            for(int j=0;j<n3-i-1;j++)
            {
                if(c[j]>c[j+1])
                {
                    int temp=c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }
         for(int i=0;i<n3;i++)
        {
           System.out.print(c[i]+"\t");
        }
        
    }
    
}
