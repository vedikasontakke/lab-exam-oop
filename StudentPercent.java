/*
 * We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A
 *  and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 
 * 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which
 *  returns the percentage of the students. The constructor of student A takes the marks in three subjects as its 
 * parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two 
 * classes and print the percentage of marks for both the students.
 */

import java.util.*;

abstract class Marks{

    abstract double getPercentage();
}

 class A extends Marks{

    int dbms , ds , oop;

    A(int dbms , int ds , int oop)
    {
         this.dbms = dbms;
         this.ds = ds;
         this.oop = oop;
    }

    double getPercentage()
    {
        double percent = (this.dbms + this.ds + this.oop)/3;
        return percent;
    }
}

class B extends Marks{

    int dbms , ds , oop , iot;

    B(int dbms , int ds , int oop , int iot)
    {
         this.dbms = dbms;
         this.ds = ds;
         this.oop = oop;
         this.iot = iot;
    }
    
    double getPercentage()
    {
        double percent = (this.dbms + this.ds + this.oop + this.iot)/4;
        return percent;
    }
}

public class StudentPercent {
    
    public static void main(String args[])
    {
        Marks s1 = new A(98 , 94 , 88 );
        double s1_percent = s1.getPercentage();
        System.out.println(s1_percent);

        Marks s2 = new B(98 , 94 , 88  , 44);
        double s2_percent = s2.getPercentage();
        System.out.println(s2_percent);
    }

}
