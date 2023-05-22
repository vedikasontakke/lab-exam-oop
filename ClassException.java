/*
 * . Create a class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor.
 *  If age of student is not in between 15 and 21 then generate user-defined exception "AgeNotWithinRangeException".
 *  If name contains numbers or special symbols raise exception "NameNotValidException". Define the two exception classes.

 */

 import java.util.*;

class AgeNotWithinRangeException extends Exception{

    public AgeNotWithinRangeException(String msg)
    {
        super(msg);
    }
}

class NameNotValidException extends Exception{

    public NameNotValidException(String msg)
    {
        super(msg);
    }
}

class Student{

    int roll_no , age ;
    String name , course;

    public Student(int roll_no , String name , int age , String course) throws AgeNotWithinRangeException , NameNotValidException
    {
        if(age< 15 || age>21)
        {
            throw new AgeNotWithinRangeException("age of student is not in between 15 and 21");
        }

        if(name.matches(".*[^azAZ].*"))
        {
            throw new NameNotValidException("name shouldnt contains numbers or special symbols");

        }

        this.age = age;
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;

        String getName()
        {
            return name;
        }
      
    }
}

public class ClassException {


    try{

        Student s = new Student(12, "null",2 , "null");
        System.out.println("created "+ s.getName());
    }catch(AgeNotWithinRangeException e)
    {
        System.out.println(e.getMessage());

    }catch(NameNotValidException e)
    {
        System.out.println(e.getMessage());

    }

    
}
