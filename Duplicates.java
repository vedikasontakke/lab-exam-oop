// Program to remove all repeated elements from an array
/*
 * 
 * HashSet : every item is unique
 */
import java.util.*;


public class Duplicates{
 
    public static void main (String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter size of array : ");
         int size = sc.nextInt();

         int array[] = new int[size];
         System.out.println("enter " + size + " elements of the array : ");

         for(int i=0  ; i<size ; i++)
         {
            array[i] = sc.nextInt();
         }

         HashSet<Integer> set = new HashSet<Integer>();

         for(int i=0 ; i<size ; i++)
         {
            set.add(array[i]);
         }

         System.out.println(set);      
    }
}
