package bank_app;

public class Loan 
{
	private int Loan_No;
	private int Amount;
	private String Type;
	
	public Loan(int Loan_Value, int ID, String tType)
	{
		Loan_No = ID;
		Amount = Loan_Value;
		Type = tType;
	}
	
	public void addCustomer()
	{
		
	}
	public void prepayment()
	{
		
	}
	public void getEMI()
	{
		
	}
	
	public int getAmount()
	{
		return Amount;
	}
}
