/**
 * Write a description of class Investment2 here.
 *
 * @author Aryan Inamdar
 * @version 3/20/21
 */

public class Investment2
{
    private double balance;
    private double rate;
    private int year;

    public Investment2(double aBalance, double aRate)
    {
        balance = aBalance;
        rate = aRate;
        year = 0;
    }

    public void waitForBalance(double targetBalance)
    {
        while (balance < targetBalance)
        {
            year++;
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
    }

    public void waitYears(int numberOfYears)
    {
        for (int i = 1; i <= numberOfYears; i++)
        {
            double interest = balance * rate / 100;
            balance = balance + interest;
        }
        year = year + numberOfYears;
    }

    public double getBalance()
    {
        return balance;
    }

    public int getYears()
    {
        return year;
    }
}
