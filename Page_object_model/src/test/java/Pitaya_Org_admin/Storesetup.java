package Pitaya_Org_admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Storesetup {

	WebDriver driver;
	@FindBy(xpath = ("//a[@id='store-tab']"))
	WebElement clickonstsetup;
	
	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-configuration[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/app-store-setup[1]/div[1]/div[1]/div[2]/div[1]/app-device[1]/div[1]/select[1]"))
	WebElement storesel;
	
	@FindBy(xpath = ("//*[@id=\"device\"]/app-device/div[1]/select"))
	WebElement drop;
	
	@FindBy(xpath = ("//button[contains(text(),'+ Add device')]"))
	WebElement addevice;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-device[1]/form[1]/div[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement store_name;
	
	@FindBy(xpath = ("//input[@id='deviceName']"))
	WebElement E_deviename;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-device[1]/form[1]/div[3]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement s_devicetype;
	
	@FindBy(xpath = ("//input[@id='macAddress']"))
	WebElement macaddress;
	
	@FindBy(xpath = ("//input[@id='deviceIPAddress1']"))
	WebElement deviceIP;
	
	@FindBy(xpath = ("//button[contains(text(),'Submit')]"))
	WebElement sub;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-device[1]/div[1]/button[1]"))
	WebElement closepopup;
	
	public Storesetup(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setupstore() {
		clickonstsetup.click();
	}
	public void selstoredrpdwn() throws InterruptedException {
		storesel.click();
		Thread.sleep(1500);
		Select sel = new Select(drop);
		sel.selectByVisibleText("Test Store-290");
		Thread.sleep(1500);
	}
	public void clickonaddevice() throws InterruptedException
	{
		addevice.click();
		Thread.sleep(1500);
		store_name.sendKeys("kandela solutions");
		Thread.sleep(1000);
		store_name.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-device[1]/form[1]/div[1]/div[1]/ng-autocomplete[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		E_deviename.sendKeys("QA");
		Thread.sleep(1000);
		s_devicetype.sendKeys("jetson");
		s_devicetype.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-device[1]/form[1]/div[3]/div[1]/ng-autocomplete[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/a[1]")).click();
		Thread.sleep(1500);
		macaddress.sendKeys("02:A0:C4:57:21:07");
		Thread.sleep(1500);
		deviceIP.sendKeys("54.785.95.1523");
		Thread.sleep(1000);
		//sub.click();
		closepopup.click();
		
	}
}