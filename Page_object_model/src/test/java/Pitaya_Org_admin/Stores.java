package Pitaya_Org_admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stores {
	
	WebDriver driver;
	@FindBy(xpath = ("//button[contains(text(),'+ Add Store')]"))
	WebElement addstore;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[1]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement orgname;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[5]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement country;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[6]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement state;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[7]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement city;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[8]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement zipcode;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[9]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]"))
	WebElement timezone;
	
	@FindBy(xpath = ("//select[@id='openTime']"))
	WebElement opentime;
	
	@FindBy(xpath = ("//select[@id='closeTime']"))
	WebElement close_at;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[11]/div[1]/div[1]/input[1]"))
	WebElement alert_email;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[11]/div[1]/div[2]/input[1]"))
	WebElement alert_sms;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[11]/div[1]/div[3]/input[1]"))
	WebElement alert_hyperion;
	
	@FindBy(xpath = ("//input[@id='textBox']"))
	WebElement auth_token;
	
	@FindBy(xpath = ("//select[@id='countryCodeId1']"))
	WebElement phone1;
	
	@FindBy(xpath = ("//input[@id='contact1']"))
	WebElement phone_num;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[14]/label[1]"))
	WebElement status;
	
	@FindBy(xpath = ("//button[contains(text(),'Submit')]"))
	WebElement submit;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[1]/button[1]"))
	WebElement closepopup;
	
	public Stores(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void store() {
		addstore.click();
	}
	public void Oname() throws InterruptedException {
		orgname.click();
		Thread.sleep(1500);
		orgname.findElement(By.xpath("//a[contains(text(),'test')]")).click();
		Thread.sleep(1500);
		orgname.findElement(By.xpath("//input[@id='storeName1']")).sendKeys("Prem solutions1");
		Thread.sleep(1500);
		orgname.findElement(By.xpath("//input[@id='address1']")).sendKeys("Hyderabad");
		Thread.sleep(1500);
		country.click();
		Thread.sleep(1500);
		country.findElement(By.xpath("//a[contains(text(),'INDIA')]")).click();
		Thread.sleep(1500);
		state.click();
		state.findElement(By.xpath("//a[contains(text(),'Telangana')]")).click();
		Thread.sleep(1500);
		city.click();
		city.findElement(By.xpath("//a[contains(text(),'Hyderabad')]")).click();
		Thread.sleep(1500);
		zipcode.click();
		zipcode.findElement(By.xpath("//a[contains(text(),'500018')]")).click();
		Thread.sleep(1500);
		timezone.click();
		Thread.sleep(1500);
		timezone.sendKeys("India Standard Time");
		timezone.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[9]/div[1]/ng-autocomplete[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/a[1]")).click();
		Thread.sleep(1500);
		opentime.click();
		Thread.sleep(1500);
		opentime.findElement(By.xpath("//*[@id=\"openTime\"]/option[15]")).click();
		Thread.sleep(3000);
		close_at.click();
		Thread.sleep(1500);
		close_at.findElement(By.xpath("//*[@id=\"closeTime\"]/option[23]")).click();
		Thread.sleep(3000);
		alert_email.click();
		Thread.sleep(3000);
		alert_sms.click();
		Thread.sleep(3000);
		alert_hyperion.click();
		Thread.sleep(1500);
		auth_token.sendKeys("857af95e-ad94-48f9-9a39-a73708116f84");
		Thread.sleep(3000);
		phone1.click();
		Thread.sleep(1500);
		phone1.findElement(By.xpath("//option[contains(text(),'(India) +91')]")).click();
		Thread.sleep(1500);
		phone_num.sendKeys("8971001890");
		Thread.sleep(1500);
		//status.findElement(By.xpath("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-stores[1]/div[2]/form[1]/div[14]/label[1]/span[1]")).click();
		Thread.sleep(1500);
		//submit.click();
		closepopup.click();
		
		
		
		}
}
