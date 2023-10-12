package Pitaya_CS_admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orgnization {

	WebDriver driver;
	
	@FindBy(xpath = ("//button[contains(text(),'+ Add Organization')]"))
	WebElement addorg;
	
	@FindBy(xpath = ("//input[@id='orgName']"))
	WebElement org_name;
	
	@FindBy(xpath = ("//input[@id='address1']"))
	WebElement addrs;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-organisation[1]/div[2]/form[1]/div[4]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement cntry;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-organisation[1]/div[2]/form[1]/div[5]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement state;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-organisation[1]/div[2]/form[1]/div[6]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement city;
	
	@FindBy(xpath = ("//input[@id='email']"))
	WebElement Bemail;
	
	@FindBy(xpath = ("//select[@id='countryCodeId2']"))
	WebElement cntrydrp;
	
	@FindBy(xpath = ("//input[@id='contact1']"))
	WebElement Bphno;
	
	@FindBy(xpath = ("//button[contains(text(),'Submit')]"))
	WebElement sub;
	
	@FindBy(xpath = ("//button[contains(text(),'OK')]"))
	WebElement ok;
	
	public Orgnization (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void clickon_org() throws InterruptedException {
		addorg.click();
		Thread.sleep(1000);
		org_name.sendKeys("QA1");
		Thread.sleep(1000);
		addrs.sendKeys("Hyderabad");
		Thread.sleep(2000);
		cntry.click();
		Thread.sleep(1000);
		cntry.findElement(By.xpath("//a[contains(text(),'INDIA')]")).click();
		Thread.sleep(1000);
		state.click();
		Thread.sleep(1000);
		state.findElement(By.xpath("//a[contains(text(),'Telangana')]")).click();
		Thread.sleep(1000);
		city.click();
		city.findElement(By.xpath("//a[contains(text(),'Hyderabad')]")).click();
		Thread.sleep(1000);
		Bemail.sendKeys("premkandelakumar@gmail.com");
		Thread.sleep(1000);
		cntrydrp.findElement(By.xpath("//option[contains(text(),'(India) +91')]")).click();
		Thread.sleep(1000);
		Bphno.sendKeys("9807678978");
		Thread.sleep(1000);
		sub.click();
		Thread.sleep(3000);
		ok.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
		
		
	}
}
