package bank_app;


public class Savings_Account extends Account
	{
	private double Min_Balance;
	private String Date_of_Opening;
	
	public Savings_Account(double sSaving, int nNum, String date) {
		Acc_No = nNum;
		Balance = sSaving;
		Min_Balance = 0;
		Date_of_Opening = date;
	}
	public void addCustomer()
	{
		
	}
	public void removeCustomer()
	{
		
	}
	public double debitAmount()
	{
		return 0.0;
	}

	public double creditAmount()
	{
		return 0.0;
	}
}
