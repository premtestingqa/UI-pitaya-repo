package Pitaya_CS_admin;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.logging.log4j.Logger;


public class Mainclass { 

	WebDriver driver;
	Logger log= LogManager.getLogger(Mainclass.class);
	Login_CS lng;
	Orgnization org;
	Stores str;
	Users usr;
	Storesetup1 str1;
	
	
	@BeforeTest
	public void pitaya()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://pitayastoragedev.z22.web.core.windows.net/my-tasks");
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		lng =new Login_CS(driver);
		lng.enteruname("manideep.bandla@centific.com");
		log.info("username entered");
		Thread.sleep(1500);
		lng.enterpass("manideep@123");
		log.info("password entered");
		Thread.sleep(1500);
		lng.clicklog();
		Thread.sleep(4000);
				
	}
	
	//Organization
	/*@Test(priority = 2)
	public void add_org() throws InterruptedException {
		org = new Orgnization(driver);
		org.clickon_org();
		Thread.sleep(1500);
		log.info("succussefully clicked on add_org");
		log.info("");
	}*/
	
	//Stores
	@Test(priority = 3)
	public void add_store() throws InterruptedException {
		str = new Stores(driver);
		str.clickon_stores();
		log.info("clicked on stores");
		log.info("Selected organization");
		log.info("clicked on add_store");
		log.info("entered org_name");
		log.info("entered store_name");
		log.info("entered Address");
		log.info("selected country");
		log.info("selected state");
		log.info("selected city");
		log.info("selected zip_code");
		log.info("selected time_zone");
		log.info("entered store_name");
		log.info("entered open_time");
		log.info("entered close_time");
		log.info("selected alert mode as hyperion");
		log.info("entered mobile num");
		log.info("clicked on submit");	
		
	}
	
	//Users
	/*@Test(priority = 4)
	public void User() throws InterruptedException {
		usr = new Users(driver);
		usr.clickonuser();
		log.info("clicked on user Tab");
		Thread.sleep(1500);
		usr.clickonadduser1();
		log.info("clicked on adduser");
		Thread.sleep(1500);
		log.info("adduser pop_up displayed");
		log.info("selected the store");
		log.info("enterd role name");
		log.info("entered first name");
		log.info("entered the last name");
		log.info("entered the user name");
		log.info("entered the busuness email");
		log.info("selected country code and entered phno");
		log.info("clicked on status");
		log.info("clicked on submit");
		
		
	}*/
	
	//Store_setup
	/*@Test(priority = 5)
	public void strsetup() throws InterruptedException {
		str1 = new Storesetup1(driver);
		str1.setupstore();
		log.info("Clicked on Setupstore");
		Thread.sleep(3000);
		str1.clicon_selorg();
		log.info("Selected Organization");
		Thread.sleep(2000);
		str1.clickonsel_str();
		log.info("Selected Store");
		Thread.sleep(2000);
		str1.clickonadd_device();
		log.info("clicked on add_device");
	}
	
	
	/*@AfterTest
	public void logout() {
		lng.clicklogout();
		driver.quit();
	}*/
	
	
	
	
}
