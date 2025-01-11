package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SendMailTest {
	//to
	//subject
	//mail body
	@Test(dataProvider = "getData")
	public void testMailSending(String to, Integer sub, String msg){
		//number & type of param should be same as the input data
		System.out.println(to + "------" + sub + "------" + msg);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		// read data from xls file & get into array
		//rows - number of times test has to be repeated
		//cols - number of parameters in test data
		Object[][] data = new Object[2][3];
		//1st row
		data[0][0]="sys@gmail.com";
		data[0][1]=444;
		data[0][2]= "howz life";
		
		//2nd row
		data[1][0]="abc@gmail.com";
		data[1][1]=333;
		data[1][2]= "life is good";
				
			return data;
				
				}

}
