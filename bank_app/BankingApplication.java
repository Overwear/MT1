package bank_app;

public class BankingApplication 
{
	public static void main(String[] args)
	{
		Bank TellsWells = new Bank("TellsWells Bank", 1234);
		TellsWells.print();
		TellsWells.removeCustomer(10);
		TellsWells.print();

	}
}
