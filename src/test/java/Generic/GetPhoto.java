package Generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetPhoto {
	public static void getScreenShot(WebDriver driver,String folder,String testname)
	{
	Date d=new Date();
	String a = d.toString();
	String datetime = a.replaceAll(":","-");
	String path=folder+testname+datetime+".png";
	TakesScreenshot t=(TakesScreenshot) driver;
	File src=t.getScreenshotAs(OutputType.FILE);

	
	try
	{
		FileUtils.copyFile(src,new File(path));
	}
	catch(Exception e)
	{
		
	}
	  }

}
