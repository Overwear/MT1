package bank_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class Loan_Test 
{

	@Test
	public void LoanTest_1()
	{
		Loan Test = new Loan(6000, 1, "Loan_Type");
		int amount = Test.getAmount();
		assertEquals(6000, amount);
	}

}
