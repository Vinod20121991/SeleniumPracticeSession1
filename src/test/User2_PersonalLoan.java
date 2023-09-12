package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class User2_PersonalLoan {
	
	@Test
	public void userTwoPersonalLoan()
	{
		System.out.println("User-2 Personal Loan");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Execute after the Personal Loan Test");
	}

}
