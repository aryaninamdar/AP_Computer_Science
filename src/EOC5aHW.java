/**
 *
 * @author Aryan Inamdar
 * @version 3/10/21
 */

import java.util.Scanner;

public class EOC5aHW {
    public static void main(String[] args) {
        EOC5aHW eoc5aHW = new EOC5aHW();
        eoc5aHW.e5_3();
        eoc5aHW.e5_5();
        eoc5aHW.e5_13();
        eoc5aHW.e5_15();
    }

    public void e5_3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int count = 0;
        for (; num != 0; num /= 10, ++count) {
        }

        System.out.println("Number of digits: " + count);
    }

    public void e5_5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word = scanner.nextLine();
        String firstHalf;
        String secondHalf;
        if (word.length() % 2 == 0) {
            firstHalf = word.substring(0, (word.length()/2));
            secondHalf = word.substring((word.length()/2), word.length());
            if (firstHalf.equals(secondHalf)) {
                System.out.println("First and second half same");
            }
            else {
                System.out.println("First and second half different");
            }
        }
        else {
            firstHalf = word.substring(0, ((word.length() - 1)/2));
            secondHalf = word.substring(((word.length() - 1)/2) + 1, word.length());
            if (firstHalf.equals(secondHalf)) {
                System.out.println("First and second half same");
            }
            else {
                System.out.println("First and second half different");
            }
        }
    }

    public void e5_13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String letterGrade = scanner.nextLine();
        double numericGrade;
        if (letterGrade.equals("A+")) {
            numericGrade = 4.0;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("A")) {
            numericGrade = 3.7;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("A-")) {
            numericGrade = 3.4;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("B+")) {
            numericGrade = 3.3;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("B")) {
            numericGrade = 3.0;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("B-")) {
            numericGrade = 2.7;
            System.out.println(numericGrade);
        }else if (letterGrade.equals("C+")) {
            numericGrade = 2.6;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("C")) {
            numericGrade = 2.3;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("C-")) {
            numericGrade = 2.0;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("D+")) {
            numericGrade = 1.9;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("D")) {
            numericGrade = 1.6;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("D-")) {
            numericGrade = 1.3;
            System.out.println(numericGrade);
        }
        else if (letterGrade.equals("F")) {
            numericGrade = 0;
            System.out.println(numericGrade);
        }
        else {
            System.out.println("Invalid Grade");
        }
    }

    public void e5_15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter income: ");
        int income = scanner.nextInt();
        double tax;
        if (income <= 50000) {
            tax = 0.01 * income;
            System.out.println("Tax: " + tax);
        }
        else if (income > 50000 && income <= 75000) {
            tax = 0.02 * income;
            System.out.println("Tax: " + tax);
        }
        else if (income > 75000 && income <= 100000) {
            tax = 0.03 * income;
            System.out.println("Tax: " + tax);
        }
        else if (income > 100000 && income <= 250000) {
            tax = 0.04 * income;
            System.out.println("Tax: " + tax);
        }
        else if (income > 250000 && income <= 500000) {
            tax = 0.05 * income;
            System.out.println("Tax: " + tax);
        }
        else if (income > 500000) {
            tax = 0.06 * income;
            System.out.println("Tax: " + tax);
        }
    }

    public void p5_3() {
        Scanner scanner = new Scanner(System.in);
        double tax;
        System.out.println("Are you single or married?: ");
        String status = scanner.nextLine();
        if (status.equalsIgnoreCase("single")) {
            System.out.println("Enter your income: ");
            int income = scanner.nextInt();
            if (income <= 8000) {
                tax = 0.1 * income;
                System.out.println("Tax: " + tax);
            }
            else if (income > 8000 && income <= 32000) {
                tax = (0.15 * income) + 800;
                System.out.println("Tax: " + tax);
            }
            else if (income > 32000) {
                tax = (0.25 * income) + 4400;
                System.out.println("Tax: " + tax);
            }
        }
        else if (status.equalsIgnoreCase("married")) {
            System.out.println("Enter your income: ");
            int income = scanner.nextInt();
            if (income <= 16000) {
                tax = 0.1 * income;
                System.out.println("Tax: " + tax);
            }
            else if (income > 16000 && income <= 64000) {
                tax = (0.15 * income) + 1600;
                System.out.println("Tax: " + tax);
            }
            else if (income > 64000) {
                tax = (0.25 * income) + 8800;
                System.out.println("Tax: " + tax);
            }
        }
    }
}
