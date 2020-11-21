
public class CheckingAccount extends BankAccount {
    private static double transfactionFee = 1.0;
    private double initBalance;
    private double balance;
    private double amount;
    private double total;

    /**
     * default constructor
     */
     // default constructor
    public CheckingAccount(){

    }
    public CheckingAccount(double initBalance){
        super(initBalance);
        total = initBalance;
   }

   /**
    * This method is used to deposit a given amount into the account.
    * @param amount - The amount being deposited.
    */
    public void deposit(double amount){
      balance = total + transfactionFee;
    }

    /** Method to withdraw money from the checking account
     * @param amount - amount to be withdrawn
     */
    public void withdraw(double amount){
        balance = total - amount - transfactionFee;
    }

   public void deductFee() {
     balance = total - transfactionFee;
   }

   /** Method to retrieve the current total balance in the account
    * @return balance - balance in account
    */
   public double getBalance(){
     return balance;
   }

}
