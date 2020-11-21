
/**
 * The SavingAccount is used to represent saving accounts.
 */
public class SavingAccount extends BankAccount {
    private static double interestRate = 0.5;
    private double amount;
  	private double balance;
    private double interest;

    //default constructor
    public SavingAccount(){

  	}

    public SavingAccount(double amount){
      deposit(amount);
    }

    /** Method to calculate the interest rate of the savings account
  	 * @return interest - calculated interest rate
  	 */
    public double calculateInterestRate() {
      interest = getBalance() * Math.pow( 1.0 + interestRate/12.0, 12.0 * 1.0);
      return interest;

    }

    public void addInterest() throws AccountException {
      deposit(interest);
    }

}
