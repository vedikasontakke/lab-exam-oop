/*
 *   Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). 
 *   Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method
 *   to include the employee's job title.
 */
class Person{
    
    String firstname , lastname;

    Person(String firstname , String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    String getFirstName()
    {
        return firstname;
    }

    String getLastName()
    {
        return lastname;
    }
}

class Emplopee extends Person{

    String EmployeeId , JobTtile;

    Emplopee(String firstname , String lastname , String EmployeeId , String JobTtile)
    {
        super(firstname, lastname);
        this.EmployeeId = EmployeeId;
        this.JobTtile = JobTtile;
    }

    String getEmployeeId()
    {
        return EmployeeId;
    }

    String getLastName()
    {
        return lastname + "(" + JobTtile + ")";
    }
}

public class PersonExample {
    
    public static void main(String args[])
    {
     Person person = new Person("John", "Bolle");

     System.out.println("First Name: " + person.getFirstName());
     System.out.println("Last Name: " + person.getLastName());

     Emplopee employee = new Emplopee("Jane", "Smith", "12345", "Manager");
     System.out.println("First Name: " + employee.getFirstName());
     System.out.println("Last Name: " + employee.getLastName());
     System.out.println("Employee ID: " + employee.getEmployeeId());        
    }
}
