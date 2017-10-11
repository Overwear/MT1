package bank_app;



public class Bank 
{
	private String name;//name variable
	private int Code;//branch variable
	private Branch[] BranchList;
	public Bank(String nName, int cCode)
	{
		BranchList = new Branch[4];
		BranchList[0] = new Branch("Brooklyn Branch", "Area1");
		BranchList[1] = new Branch("Spring Valley Branch", "Area2");
		BranchList[2] = new Branch("Bronx Branch", "Area3");
		BranchList[3] = new Branch("New Your Branch", "Area4");
		
		BranchList[0].addAccount(1, "Waylon Dalton", "351 Surrey Circle Brooklyn, NY 11209", 1356.00, 599.00, 0);
		BranchList[0].addAccount(2, "Justine Henderson", "9858 Glen Eagles Ave. Brooklyn, NY 11237", 156.00, 3599.00, 0);
		BranchList[0].addAccount(3, "Abdullah Lang", "9927 Woodside Lane Brooklyn, NY 11213", 1156.00, 399.00, 1000);
		BranchList[0].addAccount(4, "Marcus Cruz", "71 Depot Lane Brooklyn, NY 11212", 1156.00, 99.00, 200);
		BranchList[0].addAccount(5, "Thalia Cobb", "7233 NE. Summer St. Brooklyn, NY 11235", 2016.00, 35099.00, 0);
		
		BranchList[1].addAccount(6, "Mathias Little", "87 Deerfield Ave. Spring Valley, NY 10977", 156.00, 3599.00, 0);
		BranchList[1].addAccount(7, "Eddie randolph", "718 East Howard Rd. Spring Valley, NY 10977", 7146.00, 9499.00, 0);
		
		BranchList[2].addAccount(8,"Angela Walker", "9768 Fieldstone Rd. Bronx, NY 10456", 156.00, 3599.00, 0);
		BranchList[2].addAccount(9, "Lia Shelton" , "226 High Noon Ave, Bronx, NY 10463", 31356.00, 353399.00, 0);
		
		BranchList[3].addAccount(10, "Hadassah Hartman", "642 Windfall Drive new York, NY 11370", 21256.00, 359922.00, 0);
		BranchList[3].addAccount(11, "Joanna Shaffer", "99 Heritage St. New York, NY 10040", 16.00, 0.00, 3000);
		BranchList[3].addAccount(12, "Jonathon Shppard", "7 Cactus Ave. New York, NY 12550", 56.00, 99.00, 1200);
		name = nName;
		Code = cCode;
	}
	
	public void addBranch(Branch i)
	{
		//BranchList.add(i);
	}
	
	public void removeBranch()
	{
		
	}
	
	public void getBranch()
	{
		
	}
	
	public void getAllBranches()
	{
		
	}
	public void print()
	{
		for (int i = 0; i > 4; i++)
		{
			
		}
	}
}
