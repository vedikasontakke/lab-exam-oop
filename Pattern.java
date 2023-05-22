import java.util.*;

public class Pattern {
    
    public static void main(String args[])
    {
      //  lunadkhade mutkhde
        int rows = 7;

        for(int i=0 ; i<rows ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print("*"+" ");
            }

            System.out.println("");    
        }

        for(int i=rows-1 ; i>=0 ; i--)
        {
           for(int j=0 ; j<i ; j++)
           {
            System.out.print("*"+" ");
           }

           System.out.println("");    
        }
    }
}
