/*
 * Write a Java program to find the common elements between two arrays of integers.
 */

 import java.util.*;

public class Common {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of 1st array : ");
        int size_1 = sc.nextInt();

         int array_1[] = new int[size_1];
         System.out.println("enter " + size_1 + " elements of the array : ");

         for(int i=0  ; i<size_1 ; i++)
         {
            array_1[i] = sc.nextInt();
         }

         System.out.println("enter size of 2nd array : ");
         int size_2 = sc.nextInt();

         int array_2[] = new int[size_2];
         System.out.println("enter " + size_2 + " elements of the array : ");

         for(int i=0  ; i<size_2 ; i++)
         {
            array_2[i] = sc.nextInt();
         }

         HashSet<Integer> set_1 = new HashSet<Integer>();
         HashSet<Integer> set_2 = new HashSet<Integer>();

         for(int i=0 ; i<size_1 ; i++)
         {
            set_1.add(array_1[i]);
         }

         for(int i=0 ; i<size_2 ; i++)
         {
            set_2.add(array_2[i]);
         }

         set_1.retainAll(set_2);

         System.out.println(set_1);
    }
}
