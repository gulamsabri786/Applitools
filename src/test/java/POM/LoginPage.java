package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(id="log-in")
	private WebElement login;
	
	
	@FindBy(id="username")
	private WebElement unTB;
	
	
	@FindBy(id="password")
	private WebElement pwTB;
	
	@FindBy(id="log-in")
	private WebElement clickbutton;
	
	@FindBy(id="amount")
	private WebElement clickAmount;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginButton() throws InterruptedException
	{
		
		login.click();
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clicklogin()
	{
		clickbutton.click();
	}
	
	public void clickAmount()
	{
		clickAmount.click();
	}
	

}
