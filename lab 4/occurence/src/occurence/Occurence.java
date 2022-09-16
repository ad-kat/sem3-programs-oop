/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package occurence;

import java.util.*;
public class Occurence {

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
        System.out.println("Count occurences of:");
        int num=sc.nextInt();
        int oc=0;
        for(int i=0;i<n;i++)
        {
            if(num==arr[i])
            {
                oc++;
            }
        }
        System.out.println(num+" occurs "+oc+" times.");
    }
    
}
