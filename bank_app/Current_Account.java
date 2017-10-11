package bank_app;

public class Current_Account extends Account
{
	private double Interest_Rate;
	private String Date_of_Opening;
	
	public Current_Account(double acct_value, int acct_num, double apr, String date)
	{
		Acc_No = acct_num;
		Balance = acct_value;
		Interest_Rate = apr;
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
