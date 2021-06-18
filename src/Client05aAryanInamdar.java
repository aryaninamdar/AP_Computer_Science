/**
 * Write a description of class Client05aYourName
 *
 * @author Aryan Inamdar
 * @version 3/6/21
 */

import java.util.Scanner;
import java.util.Random;
public class Client05aAryanInamdar
{
    //public static void main(String[] args)
    public void elevatorSimulation()
    {  //ref pg 132, also see illustration
        //This program simulates an elevator panel
        //that skips the 13th floor.
        Scanner in = new Scanner(System.in);
        //prompt the user for a floor# between 1 and 16 but NOT 13
        System.out.print("\nWhich floor ex 1,2,3,4,5,6,7,8,9,10,11,12,  14,15 or 16? ");
        //we are using two variables, floorRequested and actualFloor
        //to keep things straight in our mind
        int floorRequested = in.nextInt();  //get user input

        // Adjust floor if necessary
        int actualFloor;
        //qqq test for above floor 13
        if ( floorRequested > 13 )
        {
            actualFloor = -123; //qqq

        }
        else
        {
            actualFloor = -234; //qqq
        }
        System.out.println("Floor requested: "+floorRequested);
        System.out.println("Actual floor:    "+actualFloor);
    }

    //public static void main(String[] args)
    public void compare1( )
    {   //SEC 5.2 PG137
        //
        //Comparing Integers ==========================
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        for(int k=0; k<2; k++)
        {
            //qqq ask how old is amy?
            System.out.print("qqq1 ex 12? ");
            int amy = sc.nextInt();

            //qqq ask how old is zoe?
            System.out.print("qqq2 ex 15? ");
            int zoe = sc.nextInt();

            //print if same, who's older or younger
            if( amy > zoe )
            {
                System.out.println("qqq3");
            }
            else  if( amy < zoe )
            {
                System.out.println("qqq4");
            }
            else
            {
                System.out.println("qqq5");
            }

        }
    }

    public void compare2( )
    {   //SEC 5.2 PG137
        // Comparing Floating-point numbers sec 5.2.2============
        // Note: CodePad is very good here
        double x = Math.sqrt(2);
        double y = 2.0; //2.000000001

        if (x * x == y)
        {
            System.out.println("sqrt(2) times sqrt(2) is 2");
        }
        else
        {
            //qqq explain what are %.18f and %n all about
            System.out.printf("sqrt(2) times sqrt(2) is not 2 but %.18f%n", x * x);
        }

        double smallDiff = 1E-14;
        //qqq Math.abs( ____ ) makes the results positive
        if (Math.abs(x * x - y) < smallDiff)
        {
            System.out.println("sqrt(2) times sqrt(2) is approximately 2");
        }

    }

    public void compare3()
    { //ref pg140
        // Comparing Strings sec 5.2.3=========================
        // Note: CodePad is very good here.
        String s = "Sammy";
        String t = "Samuel";

        //qqq explain compareTo( ) method
        int result = s.compareTo(t);

        String comparison;
        if (result < 0)
        {
            //qqq replace ____ with before OR after
            comparison = "comes ______";
        }
        else if (result > 0)
        {
            //qqq replace ____ with before OR after
            comparison = "comes _____";
        }
        else
        {
            comparison = "SAME ";
        }

        String u = t;

        System.out.println ("The strings s and t are "+ s +" and "+ u);
        if (s != u)
        {
            System.out.print("not ");
        }
        System.out.print("identical. They are ");
        if (!s.equals(u))
        {
            System.out.print("not ");
        }
        System.out.println("equal.");
        System.out.println("The results of compareTo is: "+comparison);
        System.out.println("results = "+result);
    }

    //public static void main(String[] args)
    public void sales( )
    {  //sec How To, 5.1, page 143
        //Note: read the problem description FIRST
        Scanner in = new Scanner(System.in);

        System.out.print("Original price before discount: ");
        double originalPrice = in.nextDouble();

        double discountRate;
        /* qqq fill in the blanks then uncomment the code
        if ( ____ )
        {
            discountRate = ____;
        }
        else
        {
            discountRate = ____;
        }

        double discountedPrice = discountRate * originalPrice;
        */

        //System.out.printf("Discounted price: qqq_____", discountedPrice);
    }

    public void compare4(double x, double y)
    {   //ref pg 161 but using parameters instead of Scanner
        //Uses &&, || and prints if >, <, ==, closer than 0.01, same sign.

    }

    //public static void main(String[] args)
    public void elevatorSimulation2( )
    {  //ref pg166 elevator with input validation
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        if (in.hasNextInt()) //input validation
        {
            // Now we know that the user entered an integer

            int floor = in.nextInt();

            if (floor == 123) //qqq
            {
                System.out.println("Error: There is no thirteenth floor.");
            }
            else if (floor == 123) //qqq
            {
                System.out.println("Error: The floor must be between 1 and 20.");
            }
            else
            {
                // Now we know that the input is valid

                int actualFloor = floor;
                if (floor > 13)
                {
                    actualFloor = floor - 1;
                }

                System.out.println("The elevator will travel to the actual floor "
                        + actualFloor);
            }
        }
        else
        {
            System.out.println("Error: Not an integer.");
        }
    }

}


