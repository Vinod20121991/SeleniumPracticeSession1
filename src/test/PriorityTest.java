package test;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=0)
	public void vinod()
	{
		System.out.println("vinod executed");
	}
	@Test(priority=-1)
	public void paramesh()
	{
		System.out.println("paramesh executed");
	}
	@Test(priority=3)
	public void santhosh()
	{
		System.out.println("santhosh executed");
	}
	@Test(priority=-2)
	public void yashwant()
	{
		System.out.println("yashwant executed");
	}
	@Test(priority=2)
	public void aditya()
	{
		System.out.println("aditya executed");
	}

}
