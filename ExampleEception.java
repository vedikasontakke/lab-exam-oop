import java.util.*;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String msg) {
        super(msg);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String msg) {
        super(msg);
    }
}

class Student {
    int roll_no, age;
    String name, course;

    public Student(int roll_no, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age of student is not in between 15 and 21.");
        }

        if (name.matches(".*[^a-zA-Z ].*")) {
            throw new NameNotValidException("Name shouldn't contain numbers or special symbols.");
        }

        this.age = age;
        this.name = name;
        this.roll_no = roll_no;
        this.course = course;
    }

    public String getName() {
        return name;
    }
}

public class ExampleEception {
    public static void main(String[] args) {
        try {
            Student s = new Student(12, "null", 2, "null");
            System.out.println("Created " + s.getName());
        } catch (AgeNotWithinRangeException e) {
            System.out.println(e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
