public class SavingsAccount {

    public static double annuallInterestRate=0.5;
    private double accountBalance;
    private int accountId;

    public SavingsAccount(int accountId)
    {
        this.accountId=accountId;
        accountBalance = 0;
    }

    public double getAccountBalance()
    {
        return this.accountBalance;
    }

    public void payment(double pay)
    {
        this.accountBalance += pay;
    }
    
    public void paycheck(double pay)
    {
	    if (pay>this.accountBalance)
	    	{
	        System.out.printf("You've " + "%.2f\n", this.accountBalance);
	    	}
	    else
	    	{
	        this.accountBalance -= pay;
	    	}
    }

    public void calculateMonthlyInterest(){
        this.accountBalance+=((annuallInterestRate*this.accountBalance)/12);
    }
    public static void setAnnuallInterestRate(double newAnnuallInterestRate){
        annuallInterestRate = newAnnuallInterestRate;
    }
}
