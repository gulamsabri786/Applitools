package TestScripts;

import org.testng.annotations.Test;

import Generic.AutoConst;
import Generic.BaseTest;
import Generic.Excel;
import POM.LoginPage;

public class DataDrivenTest extends BaseTest implements AutoConst {
	
	@Test
	public void userName() throws Exception
	{
		LoginPage l=new LoginPage(driver);
		
		String un=Excel.getdata(XL_PATH, "sheet1",0, 0);
		l.setUserName(un);
		
		l.clicklogin();
		
		validateWindow();
	}
	
	@Test
	public void password() throws Exception
	{
		LoginPage l=new LoginPage(driver);
		
		String pw=Excel.getdata(XL_PATH, "sheet1", 0, 1);
		l.setPassword(pw);
		
		l.clicklogin();
		
		validateWindow();
	}
	
	@Test
	public void userNameAndPassword() throws Exception
	{
		LoginPage l=new LoginPage(driver);
		
		String un=Excel.getdata(XL_PATH, "sheet1",0, 0);
		l.setUserName(un);
		
		String pw=Excel.getdata(XL_PATH, "sheet1", 0, 1);
		l.setPassword(pw);
		
		l.clicklogin();
		
		validateWindow();
	}

}
