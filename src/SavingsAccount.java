public class SavingsAccount {
    private int initialBalance;
    public int interestRate;

    public SavingsAccount(int bal, int inter) {
        this.initialBalance = bal;
        this.interestRate = inter;
    }

    public void addInterest() {
        double balanceWithInterest = initialBalance + (initialBalance * (0.01 * interestRate));
        System.out.println("Balance with interest: $" + balanceWithInterest);
    }
}
