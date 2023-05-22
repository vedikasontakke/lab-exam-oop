/*
 * . A Company manufactures Vehicles, which could be a Helicopter, a Car, or a Train depending on the customer’s demand.
 *  Each Vehicle instance has a method called move, which prints on the console the nature of movement of the vehicle. 
 * For example, the Helicopter Flies in Air, the Car Drives on Road and the Train Runs on Track. Write a program that 
 * accepts input from the user on the kind of vehicle the user wants to order, and the system should print out nature of
 *  movement. Implement all Java coding best practices to implement this program.
 */

 import java.util.*;

 abstract class Vechile{

    abstract void move();
 }

class Helicopter extends Vechile{

    String name;

    Helicopter(String name)
    {
       this.name = name;
    }

    void move()
    {
        System.out.println("Helicopter flies in air \n");
    }
}

class Car extends Vechile{
    String name;

    Car(String name)
    {
       this.name = name;
    }

    void move()
    {
        System.out.println("Car drives on road \n");
    }
}

class Train extends Vechile{

    String name;

    Train(String name)
    {
       this.name = name;
    }

    void move()
    {
        System.out.println("Train runs on the track\n");
    }
}

public class VechileOrder {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String vechString = sc.nextLine();

        switch(vechString)
        {
            case "Car" : Vechile car = new Car(vechString);
                         car.move();
                         break;

            case "Train" : Vechile train = new Train(vechString);
                         train.move();
                         break;

            case "Helicopter" : Vechile helicopter = new Helicopter(vechString);
                                helicopter.move();
                                break;
        }
    }
}
