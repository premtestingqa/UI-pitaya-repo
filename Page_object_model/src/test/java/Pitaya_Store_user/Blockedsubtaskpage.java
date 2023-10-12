package Pitaya_Store_user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blockedsubtaskpage 
{

	WebDriver driver;

	@FindBy(xpath= ("//*[@id='2']"))
	WebElement Blocked;
	
	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]/div[1]"))
	WebElement all;

	@FindBy(xpath= ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[2]/a[1]"))
	WebElement Blockedretailsubtask;

	@FindBy(xpath= ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[3]/a[1]"))
	WebElement Blockedcustomerdemand;

	@FindBy(xpath= ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[4]/a[1]/div[1]"))
	WebElement Blockedcustomerexperiance;

	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[5]/a[1]/div[1]"))
	WebElement Blockedlossprevention;

	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/ul[1]/li[6]/a[1]/div[1]"))
	WebElement Blockedworkplacesafety;


	public Blockedsubtaskpage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}


	public void clickBlocked()
	{
		Blocked.click();
	}
	public void clickblockedretail()
	{
		Blockedretailsubtask.click();
	}
	public void clickblockedcustomerdemand()
	{
		Blockedcustomerdemand.click();
	}
	public void clickblockedcustomerexperiance()
	{
		Blockedcustomerexperiance.click();	
	}
	public void clickblockedlossprevention()
	{
		Blockedlossprevention.click();
	}

	public void clickblockedworkplacesafety()
	{
		Blockedworkplacesafety.click();
	}


} 



