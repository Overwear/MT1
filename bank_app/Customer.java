package bank_app;

public class Customer
{
	private int Cust_ID;
	private String Name;
	private String Address;
	private String Phone;
	private Current_Account A;
	private Savings_Account B;
	public Customer(int nNum, String nName, String aAddy, double cChecking, double sSaving, int lLoan)
	{
		Cust_ID = nNum;
		Name = nName;
		Address = aAddy;
		Phone = "612-135-4444"; 	//default number
		A = new Current_Account(cChecking, nNum, 1.0, "1/1/2017");
		B = new Savings_Account(sSaving, nNum, "1/1/2017");
		
	}
	
	public Account getCheckings()
	{
		return A;
	}
	
	public Account getSavings()
	{
		return B;
	}
	
	
}
