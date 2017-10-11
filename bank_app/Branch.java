package bank_app;

import java.util.ArrayList;

public class Branch 
{
	private String Branch_Code;
	private String City;
	private ArrayList<Customer> CustomerList = new ArrayList<>();
	private Customer c;
	public Branch(String bc, String cCity)
	{
		Branch_Code = bc;
		City = cCity;
		
	}
	public void addAccount(int nNum, String nName, String aAddy, double cChecking, double sSaving, int lLoan)
	{
		 c = new Customer(nNum, nName, aAddy, cChecking, sSaving, lLoan);
	}
	CustomerList.add(c);
	public void removeAccount(Customer a)
	{
		CustomerList.remove(a);
	}
	public void addLoan()
	{
		//add loan
	}
	public void removeLoan()
	{
		//remove loan
	}
	public void getLoan()
	{
		//get loan
	}
}
