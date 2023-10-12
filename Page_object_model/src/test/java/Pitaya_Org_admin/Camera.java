package Pitaya_Org_admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Camera {
	
	WebDriver driver;
	@FindBy(xpath = ("//a[@id='camera-tab']"))
	WebElement cmera;
	
	@FindBy(xpath = ("//*[@id=\"camera\"]/app-camera/div[1]/select"))
	WebElement selectstore;
	
	@FindBy(xpath = ("//*[@id=\"camera\"]/app-camera/div[1]/button"))
	WebElement addcamera;
	
	@FindBy(xpath = ("/html/body/ngb-modal-window/div/div/app-add-camera/form/div[1]/div/ng-autocomplete/div[1]/div[1]/input"))
	WebElement selstr;
	
	@FindBy(xpath = ("//input[@id='cameraName']"))
	WebElement cmrname;
	
	@FindBy(xpath = ("/html/body/ngb-modal-window/div/div/app-add-camera/form/div[4]/div/ng-autocomplete/div/div[1]/input"))
	WebElement ucsname;
	
	@FindBy(xpath = ("//*[@id=\"camLocation\"]"))
	WebElement location;
	
	@FindBy(xpath = ("//input[@id='rtsp']"))
	WebElement RTSPNO;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-camera[1]/form[1]/div[7]/label[1]/div[1]"))
	WebElement status;
	
	@FindBy(xpath = ("//button[contains(text(),'Submit')]"))
	WebElement sub;
	
	@FindBy(xpath = ("//body/ngb-modal-window[1]/div[1]/div[1]/app-add-camera[1]/div[1]/button[1]"))
	WebElement clsbtn;
	
	public Camera(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickoncamera() {
		cmera.click();
	}
	public void clickonselectdrp() throws InterruptedException {
		selectstore.click();
		Thread.sleep(1500);
		Select sel=new Select(selectstore);
		sel.selectByVisibleText("kandela solutions");
	}
	public void clickonaddcamera() throws InterruptedException {
		addcamera.click();
		Thread.sleep(1000);
		selstr.click();
		selstr.findElement(By.xpath("//a[contains(text(),'kandela solutions')]")).click();
		cmrname.sendKeys("LG");
		Thread.sleep(1000);
		//ucsname.sendKeys("face identifier");
		//Thread.sleep(1000);
		location.sendKeys("Benagaluru");
		Thread.sleep(1000);
		RTSPNO.sendKeys("8090");
		Thread.sleep(1000);
		//status.click();
		//Thread.sleep(1000);
		//sub.click();
		//clsbtn.click();
	}
	
}
