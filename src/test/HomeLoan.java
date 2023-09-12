package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	
	//name Parameters-> we have a previllage to define multiple parameters in the single test
	@Parameters({"URL","Username","Password"})
	@Test
	public void homeLoanWebLogin(String urlName,String name,String pwd)
	{
		System.out.println(" homeLoan WebLogin");
		System.out.println(urlName + "URL Name");
		System.out.println(name + " User Name");
		System.out.println(pwd + "Password");
	}
	
	@Test
	public void homeLoanMobileAppLogin()
	{
		System.out.println(" homeLoan MobileAppLogin");
	}
	
	@Test(groups= {"smoke"})
	public void homeLoanAPILogin()
	{
		System.out.println(" homeLoan ApiLogin");
	}
	
	@DataProvider
	public void getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="First UN";
		data[0][1]="First Pwd";
		
		data[1][0]="Second UN";
		data[1][1]="Second Pwd";
		
		data[2][0]="Third UN";
		data[2][1]="Third Pwd";
		
	}

}
