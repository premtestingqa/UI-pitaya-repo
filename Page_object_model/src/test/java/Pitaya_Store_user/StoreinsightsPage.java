package Pitaya_Store_user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreinsightsPage 
{
	WebDriver driver;

	@FindBy(xpath=(" //a[@routerlink='/store-insights']" ))
	WebElement storeinsightspage;
	
	@FindBy(xpath= "(//div[@class='search-selector'])[1]" )
	WebElement country;
	
	@FindBy(xpath= "(//select[@class='store-search ng-untouched ng-pristine ng-valid'])[1]")
	WebElement state;
	
	@FindBy(xpath= "(//select[@class='store-search ng-untouched ng-pristine ng-valid'])[1]")
	WebElement zipcode;
	
	@FindBy(xpath= "//select[@class='store-search ng-untouched ng-pristine ng-valid']")
	WebElement store;
	
	public StoreinsightsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickonstoreinsights()
	{
		storeinsightspage.click();
	}

	public void clickoncountry() throws InterruptedException
	{
		country.click();
		Thread.sleep(3000);
		country.findElement(By.xpath("(//option[@value='1'])[1]")).click();
	}	

	public void clickonstate() throws InterruptedException 
	{
		state.click();
		Thread.sleep(3000);
		state.findElement(By.xpath("(//option[@value='1'])[2]")).click();
	}
	
	public void clickonzipcode() throws InterruptedException
	{
		zipcode.click();
		Thread.sleep(3000);
		zipcode.findElement(By.xpath("//option[.='500018 ']")).click();
	}
	
	public void clickonstore() throws InterruptedException 
	{
		store.click();
		Thread.sleep(3000);
		store.findElement(By.xpath("//option[.=' APITEST-10 ']")).click();
	}	
} 