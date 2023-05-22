/*
 * Write a Java Program to count the number of words in a string using HashMap.Output:
Input :Enter String: "This this is is done by Saket Saket";
{Saket=2, by=1, this=1, This=1, is=2, done=1}

 */

import java.util.*;
public class HashMapExample {
    
    public static void main(String args[])
    {
        String string = "This this is is done by Saket Saket";
        String words[]  = string.split(" ");

        HashMap<String,Integer> hashMap = new HashMap<String , Integer>();

        for(String i : words)
        {
            if(hashMap.containsKey(i))
            {
                hashMap.put(i, hashMap.get(i)+1);
            }else{

                hashMap.put(i, 1);
            }
        }

        System.out.println(hashMap);
    }
}
