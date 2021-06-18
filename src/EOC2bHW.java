/**
 * @author Aryan Inamdar
 * @version 02-12-21
 */

import java.util.Scanner;
import java.awt.Rectangle;
import java.util.Random;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class EOC2bHW {
    public static void main(String[] args) {
        EOC2bHW eoc2bHW = new EOC2bHW();
        eoc2bHW.groceryShopping();
        eoc2bHW.FourRectanglePrinter();
        eoc2bHW.CenteredSquaresPrinter();
        eoc2bHW.LotteryPrinter();
        eoc2bHW.GregorianCalendar();
    }

    // Scanner exercise/Problem #1
    public void groceryShopping() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name, eg. Greg: ");
        String name = scanner.nextLine();
        System.out.println("Enter sandwich price, eg. 3.50: ");
        double sandwichPrice = scanner.nextDouble();
        System.out.println("Enter sandwich quantity, eg. 2: ");
        int sandwichQuantity = scanner.nextInt();
        System.out.println("Enter salad price: eg, 3.50: ");
        double saladPrice = scanner.nextDouble();
        System.out.println("Enter salad quantity, eg. 2: ");
        int saladQuantity = scanner.nextInt();
        System.out.println("Enter drink price, eg. 3.50: ");
        double drinkPrice = scanner.nextDouble();
        System.out.println("Enter drink quantity, eg. 2: ");
        int drinkQuantity = scanner.nextInt();
        double totalSandwichCost = sandwichPrice * sandwichQuantity;
        double totalSaladCost = saladPrice * saladQuantity;
        double totalDrinkCost = drinkPrice * drinkQuantity;
        double totalCostNoTax = totalSandwichCost + totalSaladCost + totalDrinkCost;
        double tax = totalCostNoTax * 0.0775;
        tax = Math.round(tax * 100.0) / 100.0;
        double totalCost = totalCostNoTax + tax;
        System.out.println(name + " your order: $" + totalCostNoTax);
        System.out.println("7.75% Sales Tax: " + tax);
        System.out.println("=================================");
        System.out.println("Total: " + totalCost);
    }

    // P2.1
    public void FourRectanglePrinter() {
        Rectangle box = new Rectangle(0,0,10,10);
        System.out.println(box);
        box.translate(10,0);
        System.out.println(box);
        box.translate(0,10);
        System.out.println(box);
        box.translate(-10,0);
        System.out.print(box);
    }

    // P2.3
    public void CenteredSquaresPrinter() {
        Rectangle square = new Rectangle(100, 100, 200, 200);
        System.out.println(square);
        square.grow(-50, -50);
        square.translate(0, 0);
        System.out.println(square);
    }

    // P2.5
    // Handwritten

    // P2.7
    public void LotteryPrinter(){
        Random r = new Random();
        System.out.println("Play this combination - it'll make you rich! "+(r.nextInt(49)+1)+" "+(r.nextInt(49)+1)+" "+(r.nextInt(49)+1)+" "+(r.nextInt(49)+1)+" "+(r.nextInt(49)+1)+" "+(r.nextInt(49)+1));
    }

    // P2.9
    public void GregorianCalendar() {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal);
        System.out.println();
        System.out.println("Today's Date: "+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.YEAR));
        cal.add(Calendar.DAY_OF_YEAR, 100);
        System.out.println("Date 100 days from today: "+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.YEAR));
        GregorianCalendar birthday = new GregorianCalendar(2005,Calendar.MAY,18);
        System.out.println("My Birthday: "+(birthday.get(Calendar.MONTH)+1)+"/"+birthday.get(Calendar.DAY_OF_MONTH)+"/"+birthday.get(Calendar.YEAR));
        System.out.println("Day of the week of my birthday: "+birthday.get(Calendar.DAY_OF_WEEK));
        birthday.add(Calendar.DAY_OF_YEAR, 10000);
        System.out.println("The date 10,000 days from my birthday: "+(birthday.get(Calendar.MONTH)+1)+"/"+birthday.get(Calendar.DAY_OF_MONTH)+"/"+birthday.get(Calendar.YEAR));
    }
}
