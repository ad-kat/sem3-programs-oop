
package combinations;

import java.util.*;
class Combinations {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("All possible combinations using 1,2,3,4:");
        System.out.println("WITH REPETITION: \n");
        for(int a=1;a<=4;a++)
        {
            for(int b=1;b<=4;b++)
            {
                for(int c=1;c<=4;c++)
                {
                    for(int d=1;d<=4;d++)
                    {
                        System.out.print(a);
                        System.out.print(b);
                        System.out.print(c);
                        System.out.print(d);
                        System.out.print("\t");
                    }
                }
            }
        }
       System.out.println(" \nWITHOUT REPETITION: \n");
        for(int a=1;a<=4;a++)
        {
            for(int b=1;b<=4;b++)
            {
                for(int c=1;c<=4;c++)
                {
                    for(int d=1;d<=4;d++)
                    {
                        if(a!=b&&b!=c&&c!=d&&b!=d&&a!=c&&a!=d&&b!=a&&c!=a&&c!=b)
                                {
                                    System.out.print(a);
                                    System.out.print(b);
                                    System.out.print(c);
                                    System.out.print(d);
                                    System.out.print("\t");
                                }
                                }
                        
                    }
                }
            }
        }
    }
    

