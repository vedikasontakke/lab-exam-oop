/*
 * Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods
 * to add and remove courses.
 */

import java.util.*;

class Student{

    String name , grade;
    List<String> courses;

    Student(String name , String grade)
    {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public String getGrade()
    {
        return grade;
    }

    List<String> getCourses()
    {
        return courses;
    }

    void addCourses(String course)
    {
        courses.add(course);
    }

    void removeCourses(String course)
    {
        courses.remove(course);
    }

}

public class StudentExample {
    
    public static void main(String args[])
    {
        Student student = new Student("John Smith", "A");

        student.addCourses("Science");
        student.addCourses("Maths");
        student.addCourses("English");

        // Print student information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Courses: " + student.getCourses());

        // Remove a course
        student.removeCourses("Science");

        // Print updated student information
        System.out.println("Updated Courses: " + student.getCourses());



    }
}
