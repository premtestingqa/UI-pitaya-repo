package Pitaya_Store_user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewSubtaskPage 
{

	WebDriver driver ;
	@FindBy(xpath="//*[@id=\"1\"]")
	WebElement newsub;

	@FindBy(xpath=("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/a[1]/div[1]"))
	WebElement newretailexecution;

	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/a[1]/div[1]"))
	WebElement newcustomerdemand;

	@FindBy(xpath =( "//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/a[1]/div[1]"))
	WebElement newcustomerexperiance;

	@FindBy(xpath=("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/a[1]/div[1]"))
	WebElement newlossprevention;

	@FindBy(xpath=("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-my-tasks[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/a[1]/div[1]"))
	WebElement newworkplacesafety;
	
	@FindBy(xpath = ("//input[@id='search']"))
	WebElement search;
	
	@FindBy(xpath = ("//header/nav[1]/div[1]/div[1]/div[1]/button[1]/i[1]"))
	WebElement srchicon;

	public NewSubtaskPage(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
	}

	public void clicknewsub() {
		newsub.click();
	}

	public void clicknewretailexecution()
	{
		newretailexecution.click();
	}

	public void clicknewcustomerdemand() 
	{
		newcustomerdemand.click();
	}

	public void clicknewcustomerexperiance()
	{
		newcustomerexperiance.click();
	}

	public void clicknewlossprevention()
	{
		newlossprevention.click();
	}

	public void clicknewworkplacesafety()
	{
		newworkplacesafety.click();
	}
	public void searchfor() throws InterruptedException {
		search.sendKeys("Shrinkage");
		Thread.sleep(1000);
		srchicon.click();
	}
}

