package bank_app;

public class Customer
{
	private int Cust_ID;
	private String Name;
	private String Address;
	private String Phone;
	private Current_Account A;
	private Savings_Account B;
	private Loan C;
	public Customer(int nNum, String nName, String aAddy, double cChecking, double sSaving, int lLoan)
	{
		Cust_ID = nNum;
		Name = nName;
		Address = aAddy;
		Phone = "612-135-4444"; 	//default number
		A = new Current_Account(cChecking, nNum, 1.0, "1/1/2017");
		B = new Savings_Account(sSaving, nNum, "1/1/2017");
		C = new Loan(lLoan, nNum, "Type");
		
	}
	
	public double getCheckings()
	{
		return A.getBalance();
	}
	
	public double getSavings()
	{
		return B.getBalance();
	}
	
	public String getName()
	{
		return Name;
	}
	
	public String getAddy()
	{
		return Address;
	}
	
	public double getLoan()
	{
		return C.getAmount();
	}
	
	public int getID()
	{
		return Cust_ID;
	}
	
}
