package TestScripts;

import org.testng.annotations.Test;

import Generic.AutoConst;
import Generic.BaseTest;
import Generic.Excel;
import POM.LoginPage;

public class SortTableTest extends BaseTest implements AutoConst {

	
	@Test
	public void sortTable() throws Exception
	{
		LoginPage l=new LoginPage(driver);
		
		String un=Excel.getdata(XL_PATH, "sheet1",0, 0); //Extracting user name data from excel(Data Driven)
		l.setUserName(un); // Enter user name
		
		String pw=Excel.getdata(XL_PATH, "sheet1", 0, 1); //Extracting password data from excel(Data Driven)
		l.setPassword(pw); // Enter Password
		
		l.clicklogin(); // Clicking login button
		
		l.clickAmount(); // clicking amount button
		
		validateWindow(); //validation
		
		
	 }
		 
}
