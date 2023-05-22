/*
 * 
 * Java Program to Count Number of Duplicate Words in String
 */

import java.util.*;

public class DuplicateWords {
    
    public static void main(String args[])
    {
        String umbrella = "umbrella";
        System.out.println(umbrella + " " + umbrella.contains("e"));

        StringBuilder s = new StringBuilder(umbrella);
       // s.append(umbrella);

       String s_reverse = s.reverse().toString();

       System.out.println("Reverse of umbrella is "+ s_reverse + "\n ");


       if(umbrella.equals(s_reverse)){

        System.out.println("palindrome");
       }
       else
      {
         System.out.println(" not palindrome");

        }
        
        if(umbrella.contains("e") == true)
        {
            System.out.println(" string contains e");
        }else{
            System.out.println(" string doesnt contains e");

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String string = sc.nextLine();

        String string_array[] = string.split(" ");

        HashMap<String , Integer> hashMap = new HashMap<String , Integer>();

        for(String i : string_array)
        {
            if(hashMap.containsKey(i))
            {
                hashMap.put(i, hashMap.get(i)+1);
            }else
            {
                hashMap.put(i, 1);
            }
        }

        System.out.println(hashMap);
    }
}
