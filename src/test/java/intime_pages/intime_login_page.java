package intime_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class intime_login_page 
{
	@FindBy (how = How.NAME, using= "ddUser")
	WebElement select_username;
	
	public WebElement username()
	{
		return select_username;
		
	}
	
	@FindBy (how = How.NAME, using= "txtPassword")
									
	WebElement password;
	
	public WebElement password()
	{
		return password;
		
	}
	
	@FindBy (how = How.NAME, using= "btnSignIn")
	
	WebElement signin;
	
	public WebElement signin()
	{
		return signin;
		
	}
	
	@FindBy (how = How.XPATH, using= "//span[normalize-space()='Details']")
	WebElement Detailsbutton;
	
	public WebElement Detailsbutton()
	{
		return Detailsbutton;
	}
	//span[normalize-space()='Time Sheet']
	
	@FindBy (how = How.XPATH, using= "//span[normalize-space()='Time Sheet']")
	WebElement Timesheet;
	
	public WebElement Timesheet()
	{
		return Timesheet;
	}
	
}
