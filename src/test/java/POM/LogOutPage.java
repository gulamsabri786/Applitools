package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Generic.BasePage;

public class LogOutPage extends BasePage {
	
	
	@FindBy(xpath="//div[.='My Naukri']") //declaration
	private WebElement element;
	
	@FindBy(xpath="//a[.='Logout']")     //declaration
	private WebElement log;
	
	public LogOutPage(WebDriver driver) //initialization
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void logoutapp(Actions a,WebDriver driver) throws Exception    //logout action(utilization)
	{
	//ElementIsPresent(driver, element);
	a.moveToElement(element).perform();
	log.click();
	Reporter.log("Home page diaplayed",true);
	}
	


}
