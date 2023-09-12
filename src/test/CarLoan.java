package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarLoan {
	
	@Test(groups= {"smoke","regression"})
	public void wcarLoanWebLogin()
	{
		System.out.println(" w carLoan WebLogin");
	}
	
	@Test(groups="regression")
	public void carLoanMobileAppLogin()
	{
		System.out.println(" carLoan MobileAppLogin");
	}
	
	@Test(dependsOnMethods= {"wcarLoanWebLogin"})
	public void acarLoanAPILogin()
	{
		System.out.println(" a carLoan ApiLogin");
	}

	@BeforeMethod
	public void executeBeforeMethod()
	{
		System.out.println("execute before each of the Test Methods");
	}
	
	@AfterMethod
	public void executeAfterMethod()
	{
		System.out.println("execute after each and every Test Methods");
	}

}
