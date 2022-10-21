
package q6;
import java.util.*;

class book
{
    String title;
    String author;
    int edition;

    public book()
    {
        title = "";
        author = "";
        edition = 0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter title,author,edition:");
        title=sc.nextLine();
        author=sc.nextLine();
        edition=sc.nextInt();
    }

    
    public void display()
    {  if(author.equalsIgnoreCase("Harry"))
       System.out.println(title+"\t"+author+"\t"+edition);
    }
    

}

class Q6
{
    public static void main(String[] args)
    {
          
        

        book b0 = new book();
        
        book b1 = new book();
        book b2 = new book();
        book b3 = new book();
        book b4 = new book();
        book b5 = new book();
        b0.input();
        b1.input();
        b2.input();
        b3.input();
        b4.input();
        b5.input();
        b0.display();
        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        
            
    }
}