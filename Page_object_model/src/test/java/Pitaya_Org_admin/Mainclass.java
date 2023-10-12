package Pitaya_Org_admin;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mainclass {
	
	WebDriver driver;
	Logger log= LogManager.getLogger(Mainclass.class);
	Login_Org lgn;
	Stores str;
	Users usr;
	Storesetup setup;
	Usecase ucs;
	Camera cmr;
	
	
	@BeforeTest
	public void pitaya()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://pitayastoragedev.z22.web.core.windows.net/my-tasks");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	//Login_Org_admin
	@Test(priority = 0)
	public void login() throws InterruptedException
	{
		lgn = new Login_Org(driver);
		lgn.enteruname("TestTenantUser1@centfic.com");
		Thread.sleep(1500);
		log.info("User name passed successfully");
		lgn.enterpass("TestTenantUser@123");
		Thread.sleep(1500);
		log.info("Password passed successfully");
		lgn.clicklog();
		Thread.sleep(3000);
		log.info("Login successful");
		
		
	}
	
	//Add_store
	/*@Test(priority = 1)
	public void store() throws InterruptedException {
		str= new Stores(driver);
		str.store();
		Thread.sleep(3000);
		log.info("clicked on addstore and pop-up displayed");
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)");
		str.Oname();
		Thread.sleep(3000);
		log.info("orginazation selected");
		log.info("store name entered");
		log.info("adrees entered");
		log.info("country selected");
		log.info("state selected");
		log.info("city selected");
		log.info("zipcode selected");
		log.info("time zone selected");
		log.info("selected open_time");
		log.info("selected close_time");
		log.info("succesfully entered business phno");
		log.info("sucssefully clicked on login button");
		
	}*/
	
	//Add_Users
	@Test(priority = 2)
	public void User() throws InterruptedException {
		usr = new Users(driver);
		usr.clickonuser();
		log.info("clicked on user Tab");
		Thread.sleep(1500);
		usr.clickonadduser();
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
		
		
	}
	
	//store_setup
	/*@Test(priority = 3)
	public void set_store() throws InterruptedException {
		setup = new Storesetup(driver);
		setup.setupstore();
		log.info("clicked on setup_store");
		Thread.sleep(1500);
		setup.selstoredrpdwn();
		log.info("selected the store");
		Thread.sleep(1500);
		setup.clickonaddevice();
		log.info("clicked on add_device");
		log.info("entered store name");
		log.info("entered device name");
		log.info("selected the device type");
		log.info("entered device description");
		log.info("entered MAC address");
		log.info("entered device IP address");
		log.info("clicked on submit");
	}
	
	//Use_case
	@Test(priority = 4)
	public void Use_case() throws InterruptedException {
		ucs = new Usecase(driver);
		ucs.clickon_stosetup();
		log.info("clicked on store_setup");
		Thread.sleep(1500);
		ucs.clickon_selectstore();
		log.info("selected the store");
		ucs.clickonmapusecase();
		log.info("clicked on mapusecase");
		
		
	}

	//Camera
	@Test(priority = 5)
	public void createcamera() throws InterruptedException {
		cmr = new Camera(driver);
		cmr.clickoncamera();
		log.info("clicked on camera");
		cmr.clickonaddcamera();
		log.info("selected the store");
		log.info("entered camera name");
		log.info("selected the usecase");
		log.info("entered location");
		log.info("entered RTSP");
		log.info("clicked on submit");
	}*/
	
	
	@AfterTest
	public void logout()
	 {
		lgn.clicklogout();
		log.info("logout successful");
		driver.quit();	
	 }
}
	
