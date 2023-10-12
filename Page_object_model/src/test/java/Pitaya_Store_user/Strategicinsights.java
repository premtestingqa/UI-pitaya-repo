package Pitaya_Store_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Strategicinsights 
{	
	WebDriver driver;

	@FindBy(xpath="//a[@routerlink='/strategic-insights'] " )
	WebElement strategicinsights;
	
	@FindBy(xpath= "(//select[@class='store-search'])[1]" )
	WebElement store1;
	
	@FindBy(xpath= "(//select[@class='store-search'])[2]" )
	WebElement zipcode1;
	
	@FindBy(xpath= "(//select[@class='store-search'])[3]" )
	WebElement state1;
	
	
	@FindBy(xpath= "(//select[@class='store-search'])[4]" )
	WebElement country1;
	
	public Strategicinsights(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickonstrategicinsights()
	{
		strategicinsights.click();
	}
	public void clickonstrategicstore() throws InterruptedException
	{
		store1.click();
		Thread.sleep(3000);
		store1.findElement(By.xpath("//option[.='NRF store']")).click();
	}
	public void clickonstrategiczipcode() throws InterruptedException
	{
		zipcode1.click();
		Thread.sleep(3000);
		zipcode1.findElement(By.xpath("//option[.='76051']")).click();
	}	
	public void clickonstrategicstate() throws InterruptedException
	{
		state1.click();
		Thread.sleep(3000);
		state1.findElement(By.xpath("//option[.='TX']")).click();
	}	
	public void clickonstrategiccountry() throws InterruptedException
	{
		country1.click();
		Thread.sleep(3000);
		country1.findElement(By.xpath("//option[.='USA']")).click();
	}
}
