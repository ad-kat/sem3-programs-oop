package box_volume;
import java.util.*;
class Box_volume 
{
    int l,b,h;
    public Box_volume(int a,int b,int c)
    {
       l=a;
       this.b=b;
       h=c; 
    }
    double volume()
    {
        double vol=l*b*h;
        return vol;
    }
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of box:");
        int p=sc.nextInt();
        System.out.println("enter breadth of box:");
        int q=sc.nextInt();
        System.out.println("enter height of box:");
        int r=sc.nextInt();
        Box_volume bv=new Box_volume(p,q,r);
        double vol=bv.volume();
        System.out.println("Volume is:"+vol);
    }    
}
