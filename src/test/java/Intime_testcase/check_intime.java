package Intime_testcase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.devtools.v105.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import intime_pages.intime_login_page;

public class check_intime extends intime_baseclass
{
	@Test
	public void check_office_intime () throws InterruptedException, IOException
	{
		Launchmanager();
		intime_login_page loginpage = PageFactory.initElements(d, intime_login_page.class);
				
		Select S1 = new Select(loginpage.username());
		S1.selectByVisibleText("AJAY KASHMIRCHAND SHARMA");
		
		loginpage.password().sendKeys("ajay@123");
		
		loginpage.signin().click();
		
		Thread.sleep(1000);
		
		Actions actions = new Actions(d);
		
		actions.moveToElement(loginpage.Detailsbutton());
		
		loginpage.Detailsbutton().click();
		//	Thread.sleep(1000);
		actions.moveToElement(loginpage.Timesheet()).click().perform();
		
		TakesScreenshot scrShot =((TakesScreenshot)d);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		
		String Screenshotlocation = System.getProperty("user.dir");
		
		File dest = new File(Screenshotlocation + "\\" + "Intime.png");
		
		//File DestFile=new File(dest);
		
		//Copy file at destination
		FileUtils.copyFile(SrcFile, dest);
		
		d.close();
				
	}
}
