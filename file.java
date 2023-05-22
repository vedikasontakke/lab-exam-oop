import java.util.*;
import java.io.*;

public class file {
    
    public static void main(String args[]) throws Exception
    {
        String line ;
        FileReader file = new FileReader("data.txt");
        BufferedReader file_b = new BufferedReader(file);

        int count = 0;

        while((line = file_b.readLine()) != null)
        {
           String words[] = line.split(" ");
           count = count + words.length;
        }

        System.out.println("total words are : "+ count);

    }
}
