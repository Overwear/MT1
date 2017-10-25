package bank_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class Bank_Test {

	@Test
	public void Bank_test_1() 
	{
		Bank Test_Bank = new Bank("Test Bank", 1234);
		String name = Test_Bank.getBankName();
		assertEquals(name, "Test Bank");
	}

}
