/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg2;
import java.util.*;

class Count
{
    static int count =0;

    Count()
    {
        count+= 1;
    }
}

class Prg2
{
    public static void main(String args[])
    {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

        System.out.println("Number of objects: "+ Count.count);

    }
}
