/**
 * Write a description of class Sat2009f here.
 *
 * @author Aryan Inamdar
 * @version 3/6/21
 */

import java.util.Random; //metaphor: like getting a phone app
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Client04bSatAryanInamdar
{
    public static void main(String[] args) {
        Client04bSatAryanInamdar client04bSatAryanInamdar = new Client04bSatAryanInamdar();
        client04bSatAryanInamdar.scannerBug();
    }
    public void variable()
    {
        // ref pg 100: This example shows how
        // to declare and initialize variables
        int testGrade = 100;
        long cityPopulation = 425612340L;
        byte ageInYears = 19;

        float  salesTax = .05F;
        double interestRate = 0.725;
        double avogadroNumber = 6.022E23;
        // avogadroNumber is represented in scientific notation;
        //     its value is 6.022 x 10 to the power 23

        char finalGrade = 'A';
        boolean isEmpty = true;

        System.out.println( "testGrade is " + testGrade);
        System.out.println( "cityPopulation is " + cityPopulation);
        System.out.println( "ageInYears is " + ageInYears );
        System.out.println( "salesTax is " + salesTax );
        System.out.println( "interestRate is " + interestRate );
        System.out.println( "avogadroNumber is " + avogadroNumber );
        System.out.println( "finalGrade is " + finalGrade );
        System.out.println( "isEmpty is " + false );
    }


    /**
     Escape chars examples \n, \t, \b, \",  \\

     "Computers in the future may weight
     no more than 1.5 tons."
     - Popular Mechanics, 1949

     QQQ: print the message above with ONE println statement
     */
    public void popularMechanics1949()
    {
        System.out.println("\"Computers in the future may weigh\nno more than 1.5 tons\"\n- Popular Mechanics, 1949");
    }

    public static void scannerBug( )
    {
        //QQQ run this method and state what went wrong
        String name;   // To hold the user's name
        int age;       // To hold the user's age
        double income; // To hold the user's income

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the user's age.
        System.out.print("What is your age? ");
        age = keyboard.nextInt();

        // Get the user's income
        System.out.print("What is your annual income? ");
        income = keyboard.nextDouble(); // 4542.35(CR)

        // These two statements are the error. add another keyboard.netLine() to allow user input
        System.out.print("What is your name? ");
        keyboard.nextLine();
        name = keyboard.nextLine();

        // Display the information back to the user.
        System.out.println("Hello, " + name + ". Your age is " +
                age + " and your income is $" +
                income);
    }


    //Simple operators
    //Should print something like this:
    //22 + 97 is 119
    //22 - 97 is -75
    //22 * 97 is 2134
    public void simpleOperators()
    {
        Random xyz = new Random();  //create a random object
        int x = xyz.nextInt( 30 ) + 10;
        int y = xyz.nextInt( 40 ) + 10;
        int result;

        result = x + y;
        System.out.println( x + " + "+ y + " is " + result );

        result = x - y;
        System.out.println( x + " - "+ y + " is " + result );

        result = x * y;
        System.out.println( x + " * "+ y + " is " + result );

        System.out.println("y % 3 = "+y%3); //return remainder of 13 divided by 3
        System.out.println("y / 3 = "+ y/3);
        x++; //means x = x + 1 after you use it. "Post increment"
        ++x; //means x = x + 1 add the 1 first then use it. "Pre increment"
        System.out.println("x++ equals "+ x++ );
        System.out.println("++x equals "+ ++x );

        x += 4; //add 4 to x
        x -= 10; //subtract 10 from x, ie x = x - 10
        x *= 5;
        x %= 7;
    }

    public void testJOptionDialog( )
    {  //pg127 qqq your notes
        String priceS    = JOptionPane.showInputDialog("Price, ex 4.55");
        String quantityS = JOptionPane.showInputDialog("Quantity, ex 5");
        String name      = JOptionPane.showInputDialog("Your name?");

        double price = Double.parseDouble( priceS );
        int quantity = Integer.parseInt( quantityS );

        String msg = name + ", your order totals "+ price*quantity;
        JOptionPane.showMessageDialog(null, msg );
    }

    public void divByZero(  )
    {
        //This type of divide by zero won't freeze the code
        //and it actually good because the code is still running
        //which means your 1000 line tetris game won't stop
        double result1 = 4.3 / 0.0;
        System.out.println( "The value of result1 is " + result1 );

        //qqq what does this do?
        double result2 = 0.0 / 0.0;
        System.out.println( "The value of result2 is " + result2 );

        //qqq what does this do?
        int result3 = 4 / 0;
        System.out.println( "The value of result3 is " + result3 );

        System.out.println("If you can see this, I'm still ALIVE!!");
    }

    public void shortCutOp(  )
    {
        Random random = new Random();
        int a = random.nextInt(18) - 9; //replace with random num between -9 & +9
        int b = random.nextInt(18) - 9; //replace with random num between -9 & +9
        System.out.println(a);
        System.out.println(b);

        //qqq explain what prefix and postfix ++ or -- does
        System.out.println( "At the beginning, a is " + a );
        System.out.println( "++a makes a = " + ++a );
        System.out.println( "In the end, a is " + a );

        System.out.println( "\nAt the beginning, b is " + b );
        System.out.println( "b-- makes b = " + --b );
        System.out.println( "In the end, b is " + b );
    }

    //This should print something like this.
    // a is -8
    // After a += 10; a is 2
    // After a -= 3; a is -1
    // After a *= 2; a is -2
    // After a /= 6; a is 0
    // After a %= 3; a is 0
    public void shortCutMathOp(  )
    {
        //replace with random one digit negative number
        //that means -1 or -2  or -3 or ... -9
        Random rand = new Random();

        int a = rand.nextInt( 8 )  - 9 ;
        System.out.println( "a is " + a );

        a += 10;      //  a = a + 10;
        System.out.println( "After a += 10, a is " + a );

        a -= 3;       //  a = a - 3;
        System.out.println( "After a -= 3, a is " + a );

        a *= 2;       //  a = a * 2;
        System.out.println( "After a *= 2, a is " + a );

        a /= 6;       //  a = a / 6;
        System.out.println( "After a /= 6, a is " + a );

        a %= 3;       //  a = a % 3;
        System.out.println( "After a %= 3, a is " + a );

    }


    public void loop1()
    {
        //sjsjsj
        // Use to run statements multiple times
        for(int n = 0; n<10; n++ )
        {
            System.out.println("Hello");
        }
    }

    public void loop2()
    {
        Random rrr = new Random();
        int num;

        //Use to run statements multiple times
        for(int n = 0; n<10; n++ )
        {
            num = rrr.nextInt(10);
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void read1()
    { //sect 4.3 sjsj
        Scanner input = new Scanner(System.in);
        int amy, ben, dan; //ages, qqq add dan

        //Prompt the user for information
        System.out.print("Amy's age: ");
        amy = input.nextInt( ); //get from scanner

        System.out.print("Ben's age: ");
        ben = 1234; //get from scanner

        double avg = (amy + ben) / 2.0;
        System.out.println("Average age = " + avg);
        System.out.printf ("or about %.2f",   avg);  //show 2 decimal place print
        System.out.println();
    }

    public void read2( )
    {
        for(int n=0; n<4; n++)
        {
            System.out.println("Hello");
        }
    }

    public void numQuarters(double amt)
    {
    }

    public int numDimes(double amt)
    {
        return 1234;
    }

}
