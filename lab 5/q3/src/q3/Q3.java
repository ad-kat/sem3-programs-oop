package q3;
import java.util.Scanner;
class time{
    int hour,min,sec;
    public time()
    {
        hour=0;
        min=0;
        sec=0;
    }
    public time(int h,int m,int s){
        hour=h;
        min=m;
        sec=s;
    }
    void display(){
        System.out.println(hour+":"+min+":"+sec);
    }
    public void add(time t1,time t2){
        int time1=(t1.sec+(t1.min*60)+(t1.hour*3600));
        int time2=(t2.sec+(t2.min*60)+(t2.hour*3600));
        int time3=time1+time2;
        hour=(int)(time3/3600);
        min=(int)((time3%3600)/60);
        sec=(int)(time3%60);
    }
}
class Q3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first time: ");
        int h1=sc.nextInt(),m1=sc.nextInt(),s1=sc.nextInt();
        time t1=new time(h1,m1,s1);
        t1.display();
        System.out.print("\nEnter second time: ");
        int h2=sc.nextInt(),m2=sc.nextInt(),s2=sc.nextInt();
        time t2=new time(h2,m2,s2);
        t2.display();
        time t3=new time();
        t3.add(t1,t2);
        t3.display();
        sc.close();
    }
}
