/**
 * @author Aryan Inamdar
 * @version 01-30-21
 */

import java.awt.Rectangle;

public class Ch02Day2AryanInamdar {
    public static void main(String[] args) {
        Ch02Day2AryanInamdar day2 = new Ch02Day2AryanInamdar();
        day2.VariableDemo02();
        day2.methodDemo03();
        day2.constructorDemo04();
        day2.accessorMutatorDemo05();
        day2.moveTester07();
        day2.copyDemo08();
    }
    public void VariableDemo02() {
        int width = 10; // Declares width and initializes it with 10
        System.out.println("Width: " + width);

        width = 20; // Changes width to 20
        System.out.println("Width: " + width);

        int height = 20;
        width = height + 10; // The right hand side can be an expression
        System.out.println("Width: " + width);

        width = width + 10; // The same variable can occur on both sides
        System.out.println("Width: " + width);
    }

    public void methodDemo03() {
        int ageOfManny = 25;
        int numberOfPets = 123;
        double joeGPA = 3.2;
        double price = 409.99;
        String myAddress = "1234 Main Street, Tustin, CA 12345";

        String greeting = "Hello, World!";
        System.out.println(greeting);
        // greeting is the argument in this call to the println method
        int numberOfCharacters = greeting.length();

        // The length method returns a value
        System.out.println(numberOfCharacters);

        // You can use the return value of one method as an argument of another method
        System.out.print(numberOfCharacters);

        // The replace method has two arguments
        String river = "Mississippi";
        river = river.replace("issipp", "");
        System.out.print(river);
    }

    // stopped here Saturday 01-30-21

    public void constructorDemo04() {
        // Constructs and prints a rectangle
        System.out.println(new Rectangle(5, 10, 20, 30));

        // Constructs a rectangle and saves it in a variable
        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.print("qqq");

        // The constructor with no arguments
        box = new Rectangle();
        System.out.print("qqq");
    }

    public void accessorMutatorDemo05() {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.print("qqq");

        // getWidth is an accessor method
        double width = box.getWidth();
        System.out.print("qqq");

        // Calling an accessor doesn't change the object
        System.out.print("box: ");
        System.out.println(box);

        // translate is a mutator method
        box.translate(15, 25);

        // Calling a mutator changes the object.
        System.out.print("qqq");
    }

    public void moveTester07() {
        Rectangle box = new Rectangle(5, 10, 20, 30);

        // Move the rectangle
        box.translate(15, 25);

        // Print information about the moved rectangle
        System.out.print("x: ");
        System.out.print("qqq");
        System.out.println("Expected: 20");

        System.out.print("y: ");
        System.out.print("qqq");
        System.out.println("Expected: 35");
    }

    public void copyDemo08() {
        // Declare two object variables and copy the first into the second

        Rectangle box = new Rectangle(5, 10, 20, 30);
        Rectangle box2 = box;

        // Both variables refer to the same object

        System.out.print("box: ");
        System.out.print("qqq");
        System.out.print("box2: ");
        System.out.print("qqq");

        System.out.println("Mutating box2");
        box2.translate(15, 25);

        // Both variables refer to the mutated object

        System.out.print("box: ");
        System.out.print("qqq");
        System.out.print("box2: ");
        System.out.print("qqq");

        // Declare two number variables and copy the first into the second

        int luckyNumber = 13;
        int luckyNumber2 = luckyNumber;

        System.out.print("luckyNumber: " + "qqq");
        System.out.print("luckyNumber2: " + "qqq");

        System.out.println("Changing luckyNumber2");
        luckyNumber2 = 12;

        // Only the second number changes.

        System.out.print("luckyNumber: " + "qqq");
        System.out.print("luckyNumber2: " + "qqq");
    }
}
