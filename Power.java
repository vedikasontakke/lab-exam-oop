/*
 * You are required to compute the power of a number by implementing a calculator. 
 * Create a class My Calculator which consists of a single method long power (int, int). 
 * This method takes two integers n and p, as parameters and finds (n)p. If either or is negative, 
 * then the method must throw an exception which says " n or p should not be negative”.
 *  Also, if both and are zero, then the method must throw an exception which says "n or p should not be negative”.
 */

 import java.util.*;

class MyCalculator{

    long power(int n , int p) throws Exception
    {
       if(n<0 || p<0)
       {
       throw new Exception("n or p should not be negative \n");
       }else if(n==0 || p==0)
       {
        throw new Exception("n or p should not be zero \n");
       }else{
        return (long) Math.pow(n, p);
       }
    }
}
public  class Power {
    
    public static void main(String args[])
    {

        MyCalculator cal = new MyCalculator();

        try{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        long result = cal.power(n, p);

        System.out.println(n + " raised to the power of " + p + " is: " + result);
    }catch(Exception e)
    {
        System.out.println(e.getMessage()); 
    }
    }
    
}
