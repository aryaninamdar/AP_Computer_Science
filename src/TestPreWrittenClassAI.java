/**
 * TestPreWrittenClassAI.
 *
 * @author Aryan Inamdar
 * @version 2/6/21
 */

import java.util.Scanner;
import java.util.Random;

public class TestPreWrittenClassAI {
    public static void main(String[] args) {
        TestPreWrittenClassAI test = new TestPreWrittenClassAI();
        test.exScanner1();
        test.exScanner2();
        test.exString1();
        test.exRandom1();
    }

    //data we will use
    private int n1, n2;
    private double d1, d2;
    private String word;

    public void exScanner1()
    {
        Scanner scan = new Scanner( System.in ); //#1

        System.out.print( "Enter first name: " ); //#2
        //qqq what is the new Java command and
        //what does the next line do?
        //You can create a scanner object and use the method next() to read user input (type string)
        String firstName = scan.next( ); //#3
        System.out.print( "Enter last name: " ); //#2
        //qqq what is the new Java command and
        //what does the next line do?
        //You can create a scanner object and use the method next() to read user input (type string)
        String lastName = scan.next( ); //#3
        System.out.println( "You are: " + firstName + " " + lastName );


        //qqq what is the purpose of this print?
        System.out.print( "\nYour age, eg 24: " );
        //qqq what is the new Java command and
        //what does the next line do?
        //You can create a scanner object and use the method next() to read user input (type int)
        int age = scan.nextInt( );
        System.out.println( "You are " + age + " years old");

        System.out.print( "\nYour GPA: " );
        //qqq what is the new Java command and
        //what does the next line do?
        //You can create a scanner object and use the method next() to read user input (type double)
        double gpa = scan.nextDouble( );
        System.out.println( "Your GPA is " + gpa );
    }

    public void exScanner2()
    {
        Scanner scanner = new Scanner(System.in);  //#1
        System.out.println("Enter first number (int): "); //#2
        int num1 = scanner.nextInt(); //#3
        System.out.println("Enter second number (double): "); //#2
        double num2 = scanner.nextDouble(); //#3
        System.out.println("Enter third number (double): "); //#2
        double num3 = scanner.nextDouble(); //#3
        double average = (num1 + num2 + num3)/3;
        System.out.println("The average is: " + average);
    }

    public void exString1()
    {
        //length, indexOf, substring, replace,
        //toUpperCase, toLowerCase
        // length method calls all spaces and all punctuation placed in any position
        String name = "Aryan Inamdar";
        System.out.println("\nName is: " + name);
        int size = name.length();
        System.out.println("Name has " + size + " characters");

        String name2 = name.toUpperCase();
        System.out.println("Name is now " + name2);

        // the two numbers are beginning and ending indexes (exlucsive) for which all
        // the characters of the string in between the two indexes are stored in the name3 variable
        String name3 = name.substring(0, 5);
        System.out.println("Name is now: " + name3);

        int position = name.indexOf("m"); // returns the index of the argument in the string
        System.out.println("Position of letter m is: " + position);

        String name4 = name.replace("a", "@");
        System.out.println("Name is now: " + name4);
    }

    public void exRandom1()
    {
        //nextInt, nextDouble
        Random abc = new Random();
        n1 = abc.nextInt(10); // chooses random num between 0 and 10
        int n2 = abc.nextInt(10); // chooses random num between 1 and 10
        d1 = abc.nextDouble(); // chooses random double between default bounds 0.0 - 1.0
        double d2 = abc.nextDouble(); // chooses random double between default bounds 0.0 - 1.0
        System.out.println("4 nums are: " + n1 + ", " + n2 + ", " + d1 + ", " + d2);
    }

    public void method3( ) //exMath1()
    {
        //pow, sqrt, max, min
    }
}
