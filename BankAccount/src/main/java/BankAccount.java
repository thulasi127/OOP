
/**
 * The BankAccount Class is used to represent BankAccount objects.
 */
public class BankAccount {
//put instance variables and instance methods here
	private double amount;
	private double balance;
	private double initBalance;
	private BankAccount theAccount;
//	private double bankAmount;

	//default constructor
	public BankAccount(){

	}

/* class methods that don't use instance data can be static.  You don't have to use these methods but you may*/
	public BankAccount(double initBalance){
		this.balance = initBalance;
	}

    /**
     * This method is used to validate the amount with the balance
     * to ensure sufficient fund.
     * @param amount - The amount to be validated.
     */
       	public static void validateAmount(final double amount, final double balance) throws AccountException{
		if (amount < 0) {
			throw new  AccountException("Invalid amount value: an amount cannot be negative");
		}
		if (amount > balance) {
			throw new  AccountException("Insufficient Funds");
		}
	}

    /**
     * This method is used to validate the account.
     * @param theAccount - The account to be validated.
     */
	public static void validateAccount(final BankAccount theAccount) throws AccountException{
		if (theAccount == null) {
			throw new AccountException("The bank account does not exist!");
		}
	}


    /**
     * This method is used to deposit a given amount into the account.
     * @param amount - The amount being deposited.
     */
       	public void deposit(double amount){
					try {
						validateAmount(amount, balance);
						balance += amount;
					} catch (AccountException e) {
						e.getStackTrace();
					}
	}

    /**
     * This method is used to withdraw an amount from the bank account.
     * @param amount - The amount to be withdrawe (removed from the current bank balance).
     */
	public void withdraw(double amount) throws AccountException{
	//	try {
			//validateAmount(amount, balance);
			//balance -= amount;
		//} catch (AccountException e) {
		//	e.getStackTrace();
		//}

		if (amount > balance){
			validateAmount(amount, balance);
		} else{
		    balance -= amount;
	    }
	}

    /**
     * This method is used to transfer and account into another account.
     * @param theAccount - The account to be validated.
     */
	public void transfer(double amount, BankAccount theAccount){
		try {
			validateAccount(theAccount);
			withdraw(amount);
			theAccount.deposit(amount);
		} catch (AccountException e) {
			e.getStackTrace();
		}

	}

	/** Method to retrieve the current total balance in the account
	 * @return balance - balance in account
	 */
	public double getBalance(){
		return balance;
	}


}
