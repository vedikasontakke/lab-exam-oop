
import java.util.*;

public class multiplication {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // prime number 

        int flag  = 0;

        if(num == 0 || num==1)
        {
            System.out.println(" not a prime number ");
        }

        if(num == 2)
        {
            System.out.println("prime number \n");
        }
        else{

            for(int i=2 ; i<=num/2 ; i++)
            {
                if(num%i == 0)
                {
                    flag = 1;
                    break;
                }
            }

            if(flag == 1)
            {
                System.out.println("not a prime number ");
            }
            else
            {
                System.out.println("Prime number ");
            }
        }

        // multiplication 
        for(int i=1 ; i<=10 ; i++)
        {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
