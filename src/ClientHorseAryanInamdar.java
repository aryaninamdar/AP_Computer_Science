/**
 * Write a description of class Sat2009f here.
 *
 * @author Aryan Inamdar
 * @version 3/13/21
 */

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class ClientHorseAryanInamdar {
    public static void main(String[] args) {
        ClientHorseAryanInamdar clientHorseAryanInamdar = new ClientHorseAryanInamdar();
        clientHorseAryanInamdar.GuiIf1();
    }
    public void testJOptionDialog( ) {
        String priceS    = JOptionPane.showInputDialog("Price, ex 4.55");
        String quantityS = JOptionPane.showInputDialog("Quantity, ex 5");
        String name      = JOptionPane.showInputDialog("Your name?");

        double price = Double.parseDouble( priceS );
        int quantity = Integer.parseInt( quantityS );

        String msg = name + ", your order totals "+ price*quantity;
        JOptionPane.showMessageDialog(null, msg );
    }

    public void if1() {
        String first = "Mark";
        String last = "Smith";
        // length method to calculate length
        if (first.length() > last.length()) { // > comparison
            System.out.println(first + " is longer than " + last);
        }
        else if (last.length() > first.length()) {
            System.out.println(last + " is longer than " + first);
        }
        else {
            System.out.println(first + " is the same length as " + last);
        }
    }

    public void if2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First name, ex Mike: ");
        String first = scanner.next();
        System.out.print("Last name, ex Smith: ");
        String last = scanner.next();
        // length method to calculate length
        if (first.length() < last.length()) { // < comparison
            System.out.println(first + " is not as long as " + last);
        }
        else if (last.length() < first.length()) {
            System.out.println(last + " is not as long as " + first);
        }
        else {
            System.out.println(first + " is the same length as " + last);
        }
    }

    public void if3(String first, String last) { // data coming in as parameters
        if (first.length() != last.length()) { // > comparison
            System.out.println(first + " and " + last + " are not the same length");
        }
    }

    public void if4(String name) {
        int position = name.indexOf(" ");
        String first = name.substring(0, position);
        String last = name.substring(position + 1, name.length());
        if (first.length() > last.length()) { // > comparison
            System.out.println(first + " is longer than " + last);
        }
        else if (last.length() > first.length()) {
            System.out.println(last + " is longer than " + first);
        }
        else {
            System.out.println(first + " is the same length as " + last);
        }
    }

    public void GuiIf1() {
        // There's more to comparing decimal values than you think
        String amt1S = JOptionPane.showInputDialog("amt1, ex 15");
        String amt2S = JOptionPane.showInputDialog("amt2, ex 16.0");
        int amt1 = Integer.parseInt(amt1S);
        double amt2 = Double.parseDouble(amt2S);
        if (amt1 == amt2) {
            System.out.println("Equal");
        }
        else if (amt1 <= amt2 + 5 || amt2 <= amt1 + 5) {
            System.out.println("Close enough");
        }
        else {
            System.out.println("You owe me");
        }
    }
}
