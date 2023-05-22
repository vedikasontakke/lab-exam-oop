/*
 * Write the following code in your editor below:
A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic. The main method in the Tester class should print the
 following:
  SAMPLE O/P:My superclass is: Arithmetic
42 13 20

 */

class Arithmetic{

    int add(int a , int b)
    {
       return a+b;
    }
}

class Adder extends Arithmetic{

    
}

public class Tester {
    
    public static void main(String args[])
    {
          Adder adder = new Adder();

          System.out.println("My super class is : " + adder.getClass().getSuperclass().getName());

          int sum = adder.add(12, 13);
          System.out.println("Sum is : " + sum);

    }
}
