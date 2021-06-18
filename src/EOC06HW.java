/**
 * EOC06HW.
 *
 * @author Aryan Inamdar
 * @version 3/19/21
 */

import java.util.Scanner;
import java.util.Random;

public class EOC06HW {
    public static void main(String[] args) {
        EOC06HW eoc06HW = new EOC06HW();
        eoc06HW.e6_1();
    }

    public void e6_1() {
        // part a
        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("Sum of all even numbers between 2 and 100: " + sum);

        // part b
        int sum2 = 0;
        for (int i = 0; i <= 10; i++) {
            double square = i * i;
            sum2 += square;
        }
        System.out.println("Sum of all squares between 1 and 100: " + sum2);

        // part c
        for (int i = 0; i <= 20; i++) {
            int powerOf2 = (int) Math.pow(2, i);
            System.out.print(powerOf2 + ",");
        }

        // part d
        int sum3 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();

        if (a % 2 == 0) {
            for (int i = a + 1; i <= b; i += 2) {
                sum3 += i;
            }
            System.out.println("Sum of all odd numbers in this range: " + sum3);
        }
        else {
            for (int i = a; i <= b; i += 2) {
                sum3 += i;
            }
            System.out.println("Sum of all odd numbers in this range: " + sum3);
        }

        // part e
        int sum4 = 0;
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                sum4 += digit;
            }
            num /= 10;
        }
        System.out.println("Sum of all odd digits is: " + sum4);
    }

    public void e6_3() {
        // part a
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        for(int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                System.out.println(word.charAt(i));
            }
        }

        // part b
        String newWord = "";
        for (int i = 0; i < word.length(); i += 2) {
            newWord += word.charAt(i);
        }
        System.out.println("New word: " + newWord);

        // part c
        String noVowels = word.replaceAll("[aeiouAEIOU]", "_");
        System.out.println("Word without vowels: " + noVowels);

        // part d
        int count = 0;
        for (int i = 0; i < noVowels.length(); i++) {
            if (noVowels.charAt(i) == '_') {
                count++;
            }
        }
        System.out.println("Number of vowels in word: " + count);

        // part e
        System.out.println("Position of vowels: " + noVowels.indexOf("_"));
    }

    public void e6_5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 decimal numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // part a
        double average = (num1 + num2 + num3)/3;
        System.out.println("Average: " + average);

        // part b
        double smallest = 0;
        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest number is: " + num1);
            smallest = num1;
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println("The smallest number is: " + num2);
            smallest = num2;
        }
        else if (num3 < num2 && num3 < num1) {
            System.out.println("The smallest number is: " + num3);
            smallest = num3;
        }

        // part c
        double biggest = 0;
        if (num1 > num2 && num1 > num3) {
            System.out.println("The biggest number is: " + num1);
            biggest = num1;
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.println("The biggest number is: " + num2);
            biggest = num2;
        }
        else if (num3 > num2 && num3 > num1) {
            System.out.println("The biggest number is: " + num3);
            biggest = num3;
        }

        // part d
        System.out.println("Range: " + (biggest - smallest));
    }

    public void e6_9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        StringBuilder reversedWord = new StringBuilder();
        reversedWord.append(word);
        reversedWord.reverse();
        System.out.println("Reversed word: " + reversedWord);
    }
}
