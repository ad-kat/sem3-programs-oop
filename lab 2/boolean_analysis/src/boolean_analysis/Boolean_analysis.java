/*
Write a Java program to execute the following statements. Observe and analyze 
the outputs
a. boolean x =true;      b. boolean x =true;
int y = x;              int y =(int)x;

 */
package boolean_analysis;

import java.util.*;
public class Boolean_analysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
         boolean x =true;
         int y = (int)x; 
         System.out.println(x);
         System.out.println(y);
    }
    
}


         