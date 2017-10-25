package bank_app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Account_Test.class, Bank_Test.class, Branch_Test.class,
		Current_Account_Test.class, Customer_Test.class, Loan_Test.class, Savings_Account_Test.class })
public class AllTests {

}
