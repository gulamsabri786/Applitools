package TestScripts;

import org.testng.annotations.Test;

import Generic.AutoConst;
import Generic.BaseTest;



public class LoginPageTest extends BaseTest implements AutoConst  {
	
	@Test
	public void loginPage() throws Exception
	{
			validateWindow();
	}

}
