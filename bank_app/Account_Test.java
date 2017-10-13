package bank_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class Account_Test extends Account
{
	public double debitAmount()
	{
		return 5.0;
	}
	
	public double creditAmount()
	{
		return 6.0;
	}
	@Test
	public void Account_Test1() 
	{
		double debAmount = debitAmount();
		assertEquals(debAmount, 5.0, .01);	
	}
	@Test
	public void Account_Test2()
	{
		double credAmount = creditAmount();
		assertEquals(credAmount, 6.0, .01);
	}

}
