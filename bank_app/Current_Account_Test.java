package bank_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class Current_Account_Test {

	@Test
	public void CurrentAccountTest_1() 
	{
		Current_Account Test = new Current_Account(1234.56, 9999, 1.99, "11/11/2011");
		double balance = Test.getBalance();
		assertEquals(1234.56, balance, .05);
	}

}
