package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingAssertions {
	
	@Test
	public void testGoogleSearch() {
		
		String expected_title = "Google";
		String actual_title = "Google1";
		try{
		Assert.assertEquals(expected_title,actual_title);
		}
		catch (Throwable t){
			//test don't show fail as they are recovered here
			//java code to fail the test - to report - listener 
			System.out.println("after insertion");
			Assert.assertTrue(4>13,"This is custom error msg");
		}
	}

}
