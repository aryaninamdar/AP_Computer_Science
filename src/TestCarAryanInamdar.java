/**
 * TestCarAryanInamdar
 *
 * @author Aryan Inamdar
 * @version 2/6/21
 */

import java.util.Scanner;

public class TestCarAryanInamdar {
    public void example()
    {
        Scanner scan = new Scanner( System.in );

        System.out.print( "Enter first name: " );
        String firstName = scan.next( );
        System.out.print( "Enter last name: " );
        String lastName = scan.next( );
        System.out.println( "You are: "
                + firstName + lastName );

        System.out.print( "\nYour age, eg 24: " );
        int age = scan.nextInt( );
        System.out.println( "You are " + age + " years old");

        System.out.print( "\nYour GPA: " );
        double gpa = scan.nextDouble( );
        System.out.println( "Your GPA is " + gpa );
    }

    public void testTheCar()
    {
        Scanner scan = new Scanner( System.in );

        System.out.print( "\nHow much gas is left, eg 10.1: " );
        double fuel = scan.nextDouble( );
        System.out.println( "You have " + fuel + " gallons left" );

        System.out.print( "\nWhat does the odometer read, eg 1234: " );
        int odo = scan.nextInt( );
        System.out.println( "Your odometer says " + odo + " miles" );

        System.out.print( "\nWhat is your mile/gal or km/liter, eg 12: " );
        int eff = scan.nextInt( );
        System.out.println( "Your efficiency is " + odo + " " );


        // TestCarAryanInamdar moms = new TestCarAryanInamdar(fuel, eff, odo);
    }
}
