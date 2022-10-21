
package q5;
import java.util.Scanner;
class Number{
    private int num;
    public Number(int n){
        num=n;
    }
    public boolean isZero(){
        if (num==0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isPositive(){
        if (num>0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isNegative(){
        if (num<0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isOdd(){
        if (num%2!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEven(){
        if (num%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isPrime(){
        for(int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean isArmstrong(){
        int temp=num,sum=0,dig;
        for (;temp>0;temp/=10){
            dig=temp%10;
            sum+=Math.pow(dig,3);
        }
        if (sum==num){
            return true;
        }
        else{
            return false;
        }
    }
}
class Q5
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        Number n=new Number(num);
        if (n.isZero()){
            System.out.println("It is a zero...");
        }
        if (n.isPositive()){
            System.out.println("It is a positive number...");
        }
        if (n.isNegative()){
            System.out.println("It is a negative number...");
        }
        if (n.isOdd()){
            System.out.println("It is an odd number...");
        }
        if (n.isEven()){
            System.out.println("It is an even number...");
        }
        if (n.isPrime()){
            System.out.println("It is a prime number...");
        }
        if (n.isArmstrong()){
            System.out.println("It is an armstrong number...");
        }
        sc.close();
    }
}
