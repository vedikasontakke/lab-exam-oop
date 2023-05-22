/*
 * You are given a phone book that consists of people's names and their phone number.
 *  After that you will be given some person's name as query. For each query, print the phone number of that person. 
 * Use HashMap to implement it.The first line will have an integer denoting the number of entries in the phone book.
 *  Each entry consists of two lines: a name and the corresponding phone number.
After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file.
Constraints:
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format
 'first-name'. Each phone number has exactly 8 digits without any leading zeros.For each case, print "Not found" 
 if the person has no entry in the phone book. Otherwise, print the person's name and phone number.
 */

import java.util.*;

public class PhoneBook {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter nubmer of entries : ");
        int totalEntries = sc.nextInt();

        sc.nextLine();         //// Consume the remaining newline character after reading the integer input

        HashMap <String , Integer> map = new HashMap <String , Integer>();

        for(int i=0 ; i<totalEntries ; i++){

            System.out.println("enter name of "+ i+1 + " person : ");
            String name = sc.nextLine();    

            System.out.println("enter phone number of "+ i+1 + " person : ");
            int phoneno = sc.nextInt();
            sc.nextLine();

            map.put(name , phoneno);
        }

        System.out.println("Enter the queries (press Ctrl+D or Ctrl+Z to exit):");

        while(sc.hasNextLine())
        {
            String query = sc.nextLine();
            
            if(map.containsKey(query))
            {
               int phoneNo = map.get(query);
               System.out.println("Phone number of the query you fired is "+ phoneNo);
            }else{
                System.out.println("Not Found \n");
            }
        }

        sc.close();
    }
}
