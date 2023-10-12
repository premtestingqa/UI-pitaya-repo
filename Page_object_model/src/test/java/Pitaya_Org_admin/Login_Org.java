package Pitaya_Org_admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Org 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@id='username']")
	WebElement uname;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pword;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/div[1]/div[1]/app-sidenav[1]/div[1]/nav[2]/ul[1]/li[3]/a[1]/img[1]")
	WebElement logout;
	 	
	public Login_Org(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void enteruname(String usname)
	{
		uname.sendKeys(usname);
	}
	
	public void enterpass(String psword)
	{
		pword.sendKeys(psword);
	}
    public void clicklog()
    {
    	login.click();
    }
    
    public void clicklogout()
    {
    	logout.click();
    }


}
