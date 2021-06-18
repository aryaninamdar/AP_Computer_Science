/**
 *
 *
 @author Aryan Inamdar
 @version 5/1/21
 */

public class BankAccountAI implements MeasurableAI
{
    private double balance;

    /**
     Constructs a bank account with a zero balance.
     */
    public BankAccountAI()
    {
        balance = 0;
    }

    /**
     Constructs a bank account with a given balance.
     @param initialBalance the initial balance
     */
    public BankAccountAI(double initialBalance)
    {
        balance = initialBalance;
    }

    /**
     Deposits money into the bank account.
     @param amount the amount to deposit
     */
    public void deposit(double amount)
    {
        //qqq
    }

    /**
     Withdraws money from the bank account.
     @param amount the amount to withdraw
     Code validates to prevent overdrawing
     the account.
     */
    public void withdraw(double amount)
    {
        //qqq
    }

    /**
     Gets the current balance of the bank account.
     @return the current balance
     */
    public double getBalance()
    {
        return 123;
    }

    public double getMeasure()
    {
        return getBalance();
    }

    public int compareTo(Object other)
    {
        return 123;
    }
}
