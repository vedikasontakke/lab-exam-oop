/*
 * Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.

 */

import java.util.*;

public class longest_consigative {
    
    public static void main(String args[])
    {
        int arr[] = {49, 1, 3, 200, 2, 4, 70, 5} ;
        int currentNumber = 0 ;
        int currentSeq = 0;
        int longest_consigative=0;

        HashSet<Integer> hashmap = new HashSet<Integer>();

        for(int num : arr)
        {
            hashmap.add(num);
        }

        for(int num : arr)
        {
            if(!hashmap.contains(num-1))
            {
                 currentNumber = num;
                  currentSeq = 1;
            

            while(hashmap.contains( currentNumber + 1))
            {
                currentSeq++;
                currentNumber++;
            }
        

            if(currentSeq > longest_consigative)
            {
                longest_consigative = currentSeq;
            }
        }
        }

        System.out.println("longest consigative number is " + longest_consigative);

    }
}
