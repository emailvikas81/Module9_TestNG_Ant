package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	
	@BeforeTest
	public void openConnection(){
		//db connection
		System.out.println("connected to database");
	}
	
	@AfterTest
	public void closeConnection(){
		System.out.println("close db connection");
	}
	
	@BeforeMethod
	public void openBrowser(){
		System.out.println("Opening Browser");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println("Closing Browser");
	}
	@Test
	public void testLogin(){
		System.out.println("Executing Logintest");
		
	}
	
	@Test
	public void testRegister(){
		System.out.println("Testing registration");
		
	}
}
