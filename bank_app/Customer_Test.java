package bank_app;

import static org.junit.Assert.*;

import org.junit.Test;

public class Customer_Test {

	@Test
	public void CustomerTest_1() 
	{
		Customer test = new Customer(1, "Yee", "123 Fake St", 1000.99, 5000.50, 8000);
		String name = test.getName();
		assertEquals("Yee", name);
	}

}
