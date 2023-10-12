package Pitaya_Org_admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Usecase {

	WebDriver driver;
	@FindBy(xpath = ("//a[@id='store-tab']"))
	WebElement str_setup;
	
	@FindBy(xpath = ("//a[@id='usecase-tab']"))
	WebElement ucase_tab;
	
	@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-configuration[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/app-store-setup[1]/div[1]/div[1]/div[2]/div[2]/app-usecase[1]/div[1]/select[1]"))
	WebElement sel_store;
	
	@FindBy(xpath = ("//button[contains(text(),'Map Usecase')]"))
	WebElement map_usecase;
	
	/*@FindBy(xpath = ("//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-configuration[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/app-store-setup[1]/div[1]/div[1]/div[2]/div[2]/app-usecase[1]/div[2]/app-add-usecase[1]/form[1]/div[1]/div[4]/div[1]/ng-autocomplete[1]/div[2]"))
	WebElement storename;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/div[1]/div[3]/app-configuration[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/app-store-setup[1]/div[1]/div[1]/div[2]/div[2]/app-usecase[1]/div[2]/app-add-usecase[1]/form[1]/div[1]/div[2]/div[1]/ng-autocomplete[1]/div[1]/div[1]/input[1]")
	WebElement devicename;*/
	
	@FindBy(xpath = ("//*[@id=\"usecase\"]/app-usecase/div[2]/div/button"))
	WebElement clsbtn;
	

	public Usecase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickon_stosetup() throws InterruptedException {
		str_setup.click();
		Thread.sleep(1000);
		ucase_tab.click();
	}
	public void clickon_selectstore() throws InterruptedException {
		sel_store.click();
		Thread.sleep(1500);
		Select sel = new Select(sel_store);
		sel.selectByVisibleText("kandela solutions");
	}
	
	public void clickonmapusecase() throws InterruptedException {
		map_usecase.click();
		Thread.sleep(1000);
		clsbtn.click();
		
	}
	
		
}
