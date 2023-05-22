/*
 * Write a program to implement following inheritance. Accept data for 5 persons and display the name of employee
 *  having salary greater than 5000.

Class Name: Person
Member variables:
Name, age

Class Name: Employee
Member variables:
Designation, salary
 */

import java.util.*;

class Person{

    String name ;
    int age;

    void acceptData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of employee :");
        name = sc.nextLine();

        System.out.println("enter age of employee :");
        age = sc.nextInt();

    }
}

class Employee extends Person {

    String designation;
    int salary;

    void acceptData()
    {
        super.acceptData();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter designation of employee :");
        designation = sc.nextLine();

        System.out.println("enter salary of employee :");
        salary = sc.nextInt();

    }

    void display()
    {
        if(salary>5000)
        {
            System.out.println("Emplopee name : "+ super.name);
        }
    }

}

public class Inheritance {
    
    public static void main(String args[])
    {
        Employee employee[] = new Employee[5];

        System.out.println("Enter data for 5 employees:");

        for(int i=0 ; i<employee.length ; i++)
        {
            System.out.println("Employee "+ (i+1));
            employee[i] = new Employee();
            employee[i].acceptData();
        }

        System.out.println("\nEmployees with salary greater than 5000:");

        for(int i=0 ; i<employee.length ; i++)
        {
            employee[i].display();
        }
        
    }
}
