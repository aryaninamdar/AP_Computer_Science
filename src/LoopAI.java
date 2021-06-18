/**
 * Write a description of class LoopYI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
public class LoopAI
{
    public static void main(String[] args) {
        testSentinelLoop();
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

    public static void testSentinelLoop( )
    {  //qqq your notes
        String priceS;
        String quantityS;
        double price=0;
        int quantity=0;
        double total = 0;
        String name      = JOptionPane.showInputDialog("Your name?");
        do
        {
            priceS    = JOptionPane.showInputDialog("Price, ex 4.55 or -1 to exit");
            price     = Double.parseDouble( priceS );
            if (Math.abs(price + 1) < 0.01) { // detect if price = -1... -1+1 = 0 and is < 0.01
                break;
            }
            quantityS = JOptionPane.showInputDialog("Quantity, ex 5 or -1 to exit");
            quantity = Integer.parseInt( quantityS );
            if (Math.abs(quantity + 1) < 0.01) { // detect if quantity = -1... -1+1 = 0 and is < 0.01
                break;
            }
            total += price*quantity;
        }
        while (quantity != -1 || price != 1);

        String msg = name + ", your order totals "+ total;
        JOptionPane.showMessageDialog(null, msg );
    }

    //Generally a tester or client or runner or driver are static
    //but we have not been doing that because of the emphasis on
    //objects
    public static void test1()
    {
        //1-create an investment for mom with $1000.00 at Chase earning 5% a year
        Investment mom = new Investment( 1000.00, 5 ) ;
        //don't assign the results from a mutator
        //int xx = waitForBalance( 2000 );
        mom.waitForBalance( 2000 );
        int howLong = mom.getYears();

        System.out.println("Mom needs "+howLong+" years");

    }

    public static void test2()
    {
        //1-Ask the user how many years to invest.
        //  This uses investment2 which adds one extra method
        //  to investment
        //2-Make dads account with a starting balance of $1234.00

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Dad has $1234.00 in his account. How many years"
                + " would he like to invest his money? ");
        int years = keyboard.nextInt( );

        System.out.print("What interest rate is his investment, e.g. 8.0%? ");
        double rate = keyboard.nextDouble();

        Investment2 dad = new Investment2( 1234.00, rate/100.00 );
        // double newBalance = qqq.qqq ;  //make dad's investment go for a few years and get balance
        //System.out.println("After "+years+", dad has "+newBalance);
    }

    public static void infiniteLoop()
    {
        int year = 1;
        short count = 0;
        while( year <= 20)
        {
            //Warning: you must have a case where the
            //while condition will be false sometimes.
            //It could be after 1000 loops or 2 loops.
            double interest = 1232.0;
            System.out.println( count +" is "+interest );
            count++;
        }
    }

    public static void forExample()
    {
        System.out.println("Start for demo");
        for(int k=0;  k<5;  k++)
        {
            System.out.println("k is "+k);
        }
    }

    public static void stringexample()
    {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(9);
        int rand_int2 = rand.nextInt(9);
        String october = "ItisOctober";
        if (rand_int2 <= rand_int1)
        {
            rand_int2 = rand_int1 + 3;
            System.out.println("the string is "+ october.substring(rand_int1,rand_int2));
        }
        else if  (rand_int1 < rand_int2)
        {
            System.out.println("the string is: "+ october.substring(rand_int1,rand_int2));
        }
    }
}
