  package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.applitools.eyes.*;
import com.applitools.eyes.selenium.Eyes;


public class BaseTest implements AutoConst {
	
	
	public WebDriver driver;
	public static Eyes eyes;

	@BeforeMethod
	public void openAppication()
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		
		driver=new ChromeDriver();//Launching the browser
		
		initiateEyes();//calling initiateEyes method
		
		//V1 application for Base line
		//driver.get("https://demo.applitools.com/hackathon.html");
		
		//V2 application for checkpoints
		driver.get("https://demo.applitools.com/hackathonV2.html");
		
		driver.manage().window().maximize();//maximizing the window
	}
	
	@AfterMethod
	public  void closeApplication(ITestResult r)
	{
		int status=r.getStatus();
		String testname=r.getName();
	    if(status==2)
	    {
	    	GetPhoto.getScreenShot(driver, PHOTO_PATH, testname);
	    }
	   driver.quit();
	   eyes.abortIfNotClosed();
	    
	}
	
	//initiating Eyes
 private static void initiateEyes() {
	 eyes=new Eyes();
	 eyes.setApiKey(API_KEY);
	 
 }
 
 public void validateWindow()
 {
	// eyes.open(driver,"Hacka V1 application",Thread.currentThread().getStackTrace()[2].getMethodName());
	 eyes.open(driver,"Hacka V1 application",Thread.currentThread().getStackTrace()[2].getMethodName());
	 eyes.setForceFullPageScreenshot(true);
	 eyes.checkWindow();
	 eyes.close();
 }
}
