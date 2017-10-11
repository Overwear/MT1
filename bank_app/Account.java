package bank_app;

abstract public class Account
{
	protected int Acc_No;
	protected double Balance;
	
	abstract public double debitAmount();

	abstract public double creditAmount();

	public double getBalance()
	{
		return Balance;
	}
}
