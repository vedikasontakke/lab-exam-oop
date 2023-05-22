/*
 * Write a program to read 10 string from console and then print the sorted strings on console (Use String Class).2) 
 * combine two string   3)reverse first string nd dispaly it .
 */

import java.util.*;

public class StringExample {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> array = new ArrayList<String>();

        for(int i=0 ; i<10 ; i++)
        {
            array.add(sc.nextLine())  ;
       }

       String reverse = "";

       String s = array.get(0);
       String s1 = array.get(1);

       for(int i=s.length()-1 ; i>=0 ; i--)
       {
        //  char ww = 
          reverse = reverse+s.charAt(i);;
       }

       System.out.println(reverse);
       
       array.sort(null);
       System.out.println(array);

      

       String combine = s+s1;
       System.out.println(combine);

 
    }
}
