/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg1;

/**
 *
 * @author katya
 */
import java.util.*;

class Student_detail{
    String name;
    String id;
    static String college_name = "MIT";

    void Student_detail(String n, String sid, String cn){
         name = n;
         id = sid;
         college_name = cn;
    }
    
    void display_details()
    {
       System.out.println("College name: "+college_name+"\nStudent name: "+name+"\nStudent id: "+id);
    }
}

class Prg1
{
    public static void main(String args[])
    {
        String name;
        String id;
        Scanner sc = new Scanner(System.in);
        Student_detail sd = new Student_detail();

        System.out.println("Enter student name:");
        sd.name = sc.nextLine();
        System.out.println("Enter Student ID:");
        sd.id = sc.nextLine();

        sd.display_details();
    }
}

