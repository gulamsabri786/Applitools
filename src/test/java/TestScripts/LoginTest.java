package TestScripts;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic.AutoConst;
import Generic.BasePage;
import Generic.BaseTest;
import Generic.Excel;
import POM.LoginPage;


public class LoginTest extends BaseTest implements AutoConst {
	@Test
	public void Login() throws Exception
	{
		LoginPage l=new LoginPage(driver);
		l.loginButton();
		
		String un=Excel.getdata(XL_PATH, "sheet1",0, 0);
		l.setUserName(un);
		
		String pw=Excel.getdata(XL_PATH, "sheet1", 0, 1);
		l.setPassword(pw);
		
		validateWindow();
		/*l.clicklogin();
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		
		LogOutPage m=new LogOutPage(driver);
		
		m.logoutapp(a,driver);
		
        String expected=driver.getTitle();
        
		BasePage.VerifypageisDisplay(driver,expected);*/
	}
	

}
