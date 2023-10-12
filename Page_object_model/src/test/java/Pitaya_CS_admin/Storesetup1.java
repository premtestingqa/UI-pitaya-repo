package Pitaya_CS_admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Storesetup1 {

	WebDriver driver;
	@FindBy(xpath = ("//a[@id='store-tab']"))
	WebElement clickonstsetup;
	
	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-configuration[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/app-store-setup[1]/div[1]/div[1]/div[2]/div[1]/app-device[1]/div[1]/select[1]"))
	WebElement sel_org;
	
	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-configuration[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/app-store-setup[1]/div[1]/div[1]/div[2]/div[1]/app-device[1]/div[1]/select[2]"))
	WebElement sel_str;
	
	@FindBy(xpath = ("//button[contains(text(),'+ Add device')]"))
	WebElement addevice;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-device[1]/form[1]/div[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement selorg_name; 
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-device[1]/form[1]/div[2]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement sel_storename;
	
	@FindBy(xpath = ("//input[@id='deviceName']"))
	WebElement E_deviename;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-device[1]/form[1]/div[4]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement s_devicetype;
	
	@FindBy(xpath = ("//input[@id='macAddress']"))
	WebElement macaddress;
	
	@FindBy(xpath = ("//input[@id='deviceIPAddress1']"))
	WebElement deviceIP;
	
	@FindBy(xpath = ("//button[contains(text(),'Submit')]"))
	WebElement sub;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-device[1]/div[1]/button[1]"))
	WebElement closepopup;
	
	public Storesetup1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setupstore() {
		clickonstsetup.click();
	}
	
	public void clicon_selorg() {
		sel_org.click();
		Select sel = new Select(sel_org);
		sel.selectByVisibleText("Centific Admin");
	}
	public void clickonsel_str() {
		sel_str.click();
		Select sel1= new Select(sel_str);
		sel1.selectByVisibleText("Krishna Store new asdf");
	}
	public void clickonadd_device() throws InterruptedException {
		addevice.click();
		Thread.sleep(1000);
		selorg_name.click();
		Thread.sleep(1000);
		selorg_name.findElement(By.xpath("//a[contains(text(),'Centific Admin')]")).click();
		Thread.sleep(1000);
		sel_storename.click();
		sel_storename.findElement(By.xpath("//a[contains(text(),'Krishna Store new asdf')]")).click();
		Thread.sleep(1000);
		E_deviename.sendKeys("DeviceCamera11");
		Thread.sleep(1000);
		s_devicetype.click();
		s_devicetype.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-device[1]/form[1]/div[4]/div[1]/ng-autocomplete[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/a[1]")).click();
		Thread.sleep(1500);
		macaddress.sendKeys("02:A0:C4:57:21:07");
		Thread.sleep(1500);
		deviceIP.sendKeys("54.785.95.1523");
		Thread.sleep(1000);
		sub.click();
		closepopup.click();
		
		
		
		
	}
	
}
