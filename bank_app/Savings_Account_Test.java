package bank_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class Savings_Account_Test {

	@Test
	public void SavingsAccountTest_1() 
	{
		Savings_Account Test = new Savings_Account(5000.00, 1, "11/11/2011");
		double amount = Test.getBalance();
		assertEquals(5000.00, amount, .05);
	}

}
