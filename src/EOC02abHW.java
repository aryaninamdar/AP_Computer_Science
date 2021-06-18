/**
 * @author Aryan Inamdar
 * @version 02-05-21
 */

import java.awt.*;
import java.util.Scanner;

public class EOC02abHW {
    public static void main(String[] args) {
        // E2.7
        String mississippi = "Mississippi";
        String newString1 = mississippi.replace("i", "!");
        String newString2 = newString1.replace("s", "$");
        System.out.println("E2.7 Output:");
        System.out.println("Actual: " + newString2);
        System.out.println("Expected: M!$$!$$!pp!");

        // E2.9
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nE2.9: ");
        System.out.println("Please enter a string to be reversed: ");
        String input = scanner.next();
        String reversedString = new StringBuilder(input).reverse().toString();
        System.out.println("Actual: " + reversedString);
        System.out.println("Expected: " + reversedString);
    }
}
