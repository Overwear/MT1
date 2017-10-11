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
		CustomerList.add(c);
	}
	public void removeAccount(int CustID)
	{
		for (Customer n: CustomerList)
		{
			int ID = n.getID();
			if (ID == CustID)
			{
				CustomerList.remove(n);
				break;
			}
		}
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
	
	public void printBranchName()
	{
		System.out.println(Branch_Code);
	}
	public void printAllCustomers()
	{
		for (Customer n: CustomerList)
		{
			System.out.println(n.getID() + " " + n.getName() + " " + n.getAddy() + " " + n.getCheckings() + " " + n.getSavings() + " " + n.getLoan());
		}
	}
	public boolean isCustomerInThisBranch(int CustID)
	{
		boolean has_Customer = false;
		for (Customer n: CustomerList)
		{
			int ID = n.getID();
			if (ID == CustID)
			{
				has_Customer = true;
				break;
			}
		}
		return has_Customer;
	}
}
