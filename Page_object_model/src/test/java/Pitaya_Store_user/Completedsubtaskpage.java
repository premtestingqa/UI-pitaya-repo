package Pitaya_Store_user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Completedsubtaskpage 
{

	WebDriver driver;

	@FindBy(xpath= ("//a[@id='3']"))
	WebElement Completed;
	
	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/a[1]/div[1]"))
	WebElement all;


	@FindBy(xpath= ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[2]/a[1]/div[1]"))
	WebElement Completedretailsubtask;

	@FindBy(xpath= ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[3]/a[1]/div[2]"))
	WebElement Completedcustomerdemand;

	@FindBy(xpath= ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[4]/a[1]/div[1]"))
	WebElement Completecustomerexperiance;

	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[5]/a[1]/div[1]"))
	WebElement Completelossprevention;

	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[6]/a[1]/div[1]"))
	WebElement Completeworkplacesafety;


	public Completedsubtaskpage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}

	
	public void clickcomplete()
	{
		Completed.click();
	}
	public void clickcompletedretail() throws InterruptedException
	{
		all.click();
		Thread.sleep(2000);
		Completedretailsubtask.click();
	}
	public void clickcompletedcustomerdemand()
	{
		Completedcustomerdemand.click();
	}
	public void clickcompletecustomerexperiance()
	{
		Completecustomerexperiance.click();	
	}
	public void clickCompletelossprevention()
	{
		Completelossprevention.click();
	}

	public void clickCompleteworkplacesafety()
	{
		Completeworkplacesafety.click();
	}


} 
