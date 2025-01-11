package tests;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SellItemsTest {
	
	@BeforeTest
	public void shouldWeSkip(){
		//check whether user has logged in or not
		if(! isLoggedIn()){
			throw new SkipException("skipping because user not logged in");
		}
	}
	
	public boolean isLoggedIn(){
		return false;
	}
	@Test
	public void testSellingBooks(){
		System.out.println("testing sale of books");
		
	}

}
