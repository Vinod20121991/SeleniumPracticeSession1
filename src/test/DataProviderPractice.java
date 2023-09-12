package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	
	@Test(dataProvider="getData")
	public void loginPage(String Username,String Password)
	{
		System.out.println(Username);
		System.out.println(Password);
	}
	
	//Test the loginPage testcase mentioned above with multiple sets of data
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2]; 
		
		data[0][0]="First UN";
		data[0][1]="First Pwd";
		
		data[1][0]="Second UN";
		data[1][1]="Second Pwd";
		
		data[2][0]="Third UN";
		data[2][1]="Third Pwd";
		
		return data;
	}

}
