package bank_app;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.*;
import java.lang.System;
public class BankingApplicationTest {
	ByteArrayOutputStream output = new ByteArrayOutputStream();
	PrintStream stream = new PrintStream(output);
	PrintStream old = System.out;
	System.setOut(stream);
	@Test
	public void Bank_App_test() 
	{
		Bank TellsWells = new Bank("TellsWells Bank", 1234);
		TellsWells.removeCustomer(10);
		
	}
/* https://www.tutorialspoint.com/java/lang/java_lang_system.htm
 * https://stackoverflow.com/questions/8708342/redirect-console-output-to-string-in-java
 */
}
