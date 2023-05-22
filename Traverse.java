import java.util.*;

public class Traverse {
    
    public static void main(String args[])
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("For loop : ");

        for(int i=0 ; i<numbers.size() ; i++)
        {
            System.out.println(numbers.get(i));
        }

        System.out.println("Advanced For loop : ");
        for(int i : numbers)
        {
            System.out.println(i);
        }

        System.out.println("Iterator loop : ");

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
