package assignment;

public class Account {

	static final double totalFee = 0.0;

	/*
	 * ppublic double loan() { System.out.println("The loan value is " +
	 * this.loan_value); return loan_value; }
	 * 
	 * ublic double getRate() { System.out.println("The rate is "+rate); return
	 * this.rate; }
	 * 
	 * //must have method - the lead has requested it in all classes public double
	 * getMonthlyRate() { return loan_value*rate; }
	 * 
	 * public void setValue(double value) throws Exception { if(value<0) throw new
	 * Exception(); else { loan_value = value; } }
	 * 
	 * public String to_string() { return
	 * "Loan: "+this.loan_value+"; rate: "+this.rate+"; days active:"
	 * +daysActive+"; Type: "+account_Type+";"; }
	 * 
	 * public void print() { System.out.println("This is an account"); }
	 */
	public static double totalfee(Account[]accounts, AccountType accountType, double loan, double rate, int daysActive)
	{

	
	for	(int i=0;i<accounts.length;i++)	
	{
	Account account = accounts[i];
	
	
	
	
	
	
	if(accountType==AccountType.PREMIUM||accountType==AccountType.SUPER_PREMIUM)	
		
	totalFee+=.0125	*	(account.loan_value*(Math.pow(account.rate,(account.daysActive/365)-1) ;
	}
	return	totalFee;
	}

	public Account(double value, double rate, int account_Type) throws Exception {
		if (value < 0)
			throw new Exception();
		else {
			loan_value = value;
		}
		this.rate = rate;
		this.account_Type = account_Type;
	}
}
