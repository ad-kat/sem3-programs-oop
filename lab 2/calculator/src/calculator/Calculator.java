/*
 Create the equivalent of a four-function calculator. The program should request the 
user to enter a number, an operator, and another number. (Use floating point.) It should 
then carry out the specified arithmetic operation: adding, subtracting, multiplying, or 
dividing the two numbers. Use a switch statement to select the operation. Finally, 
display the result. When it finishes the calculation, the program should ask if the user 
wants to do another calculation. The response can be 'y' or 'n'. [Hint: use do-while 
loop]
 */
package calculator;

import java.util.*;


class Calculator 
{

    
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      
        char y;
        do{
            System.out.println("Enter a number");
        int n1=sc.nextInt();
        System.out.println("Enter the operator");
        char ch=sc.next().charAt(0);
        System.out.println("Enter another number");
        int n2=sc.nextInt();
        float ans;
            switch(ch)
            {
                case '+':{
                        ans=n1+n2 ;
                        System.out.println(n1+"+"+n2+"="+ans);
                        }break;
                case '-':{
                        ans=n1-n2 ;
                         System.out.println(n1+"-"+n2+"="+ans);
                         }break;
                case '*': {
                        ans=n1*n2 ;
                         System.out.println(n1+"*"+n2+"="+ans);
                         }break; 
                case '/':{
                        ans=n1/(float)n2 ;
                         System.out.println(n1+"/"+n2+"="+ans);
                         }break;
                default: System.out.println("Invalid operator");break;
                
                    
                }
            System.out.println("Want another operatrion? Enter 'Y' for yes and 'N'for no");
            y=sc.next().charAt(0);
            
            }while(y=='y'||y=='Y');
        }
        
    }
    


