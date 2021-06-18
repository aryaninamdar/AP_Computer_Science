/**
 *
 *
 @author Aryan Inamdar
 @version 5/1/21
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Random;

public class ClientAcctAI
{
    //private ArrayList<Pupil> bio23;
    public void test1Accts( )
    {
        Random rrrr = new Random();
        int size = 4;
        //accounts with random balances
        MeasurableAI[] accounts = {
                new BankAccountAI(900),
                new BankAccountAI(700),
                new BankAccountAI(800),
                new BankAccountAI(400) };

        double averageBalance = MeasurableAI.average(accounts); // BankAccount implements Measurable
        System.out.println("Average balance: " + averageBalance);

        double mx = MeasurableAI.max(accounts);
        System.out.printf("Max=%.2f\n",mx);

        double mn = MeasurableAI.min(accounts);
        System.out.println("Min="+mn);

    }
    //private ArrayList<Pupil> bio23;
    public void test2Accts( )
    {
        Random rrrr = new Random();
        int size = 4;
        //accounts with random balances
        MeasurableAI[] accounts = {
                new BankAccountAI(900),
                new BankAccountAI(700),
                new BankAccountAI(800),
                new BankAccountAI(400) };

        System.out.print("DBG Original: "+Arrays.toString(accounts));
        //
        //

        double averageBalance = MeasurableAI.average(accounts);
        System.out.println("Average balance: " + averageBalance);

        System.out.println("Finished");
    }

}
