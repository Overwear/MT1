package bank_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class Branch_Test {

	@Test
	public void BranchTest_1() 
	{
		Branch b = new Branch("branch code", "city");
		b.addAccount(123, "Name", "123 Fake St", 1234.52, 54321.12, 9999);
		boolean x = b.isCustomerInThisBranch(123);
		assertEquals(true, x);
	}

}
