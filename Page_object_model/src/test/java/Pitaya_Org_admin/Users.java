package Pitaya_Org_admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Users {
	
	WebDriver driver;
	
	@FindBy(xpath = ("//a[@id='completed-tab']"))
	WebElement user;
	
	@FindBy(xpath = ("//button[contains(text(),'+ Add Users')]"))
	WebElement adduser;
	
	@FindBy(xpath = ("/html/body/ngb-modal-window/div/div/app-add-user/div[2]/form/div[1]/div/ng-select/div/div/div[2]/input"))
	WebElement selectstore;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-user[1]/div[2]/form[1]/div[2]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement rolename;
	
	@FindBy(xpath = ("//input[@id='firstName1']"))
	WebElement fname;
	
	@FindBy(xpath = ("//input[@id='lastName1']"))
	WebElement lname;
	
	@FindBy(xpath = ("//input[@id='userName1']"))
	WebElement uname;
	
	@FindBy(xpath = ("//input[@id='email1']"))
	WebElement B_email;
	
	@FindBy(xpath = ("//select[@id='countryCodeId1']"))
	WebElement c_code;
	
	@FindBy(xpath = ("//input[@id='contact1']"))
	WebElement B_phno;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[14]/label[1]/div[1]"))
	WebElement Status;
	
	@FindBy(xpath = ("//button[contains(text(),'Submit')]"))
	WebElement sub;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-user[1]/div[1]/button[1]"))
	WebElement closepopup;
	
	public Users(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonuser()
	{
		user.click();
	}
	public void clickonadduser() throws InterruptedException
	{
		adduser.click();
		Thread.sleep(1500);
		selectstore.sendKeys("kandela solutions");
		Thread.sleep(1500);
		selectstore.findElement(By.xpath("//span[contains(text(),'kandela solutions')]")).click();
		Thread.sleep(1500);
		rolename.click();
		Thread.sleep(1500);
		rolename.findElement(By.xpath("//a[contains(text(),'Org Admin')]")).click();
		Thread.sleep(1500);
		fname.sendKeys("prem");
		Thread.sleep(1500);
		lname.sendKeys("kandela");
		Thread.sleep(1500);
		uname.sendKeys("premkandela1");
		Thread.sleep(1500);
		B_email.sendKeys("premkk@gmail.com");
		Thread.sleep(1500);
		c_code.click();
		Thread.sleep(1500);
		c_code.findElement(By.xpath("//option[contains(text(),'(India) +91')]")).click();
		Thread.sleep(1500);
		B_phno.sendKeys("9876044310");
		Thread.sleep(1500);
		//Status.click();
		Thread.sleep(1500);
		//sub.click();
	    closepopup.click();	
	
		
		
	}
	
}
