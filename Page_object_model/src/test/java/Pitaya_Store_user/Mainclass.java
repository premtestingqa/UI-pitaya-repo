package Pitaya_Store_user;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mainclass
{ 	
	WebDriver driver;
	Logger logger = LogManager.getLogger(Mainclass.class);
	Loginpage lgn ;
	NewSubtaskPage nst ;
	Completedsubtaskpage cst;
	Blockedsubtaskpage bst ;
	StoreinsightsPage sip;
	
	@BeforeTest
	public void pitaya() throws InterruptedException
	{		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kandela.premkumar\\eclipse-workspace\\Page_object_model\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://pitayastoragedev.z22.web.core.windows.net/my-tasks");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
		
	}
		
		@Test (priority=0)    
		public void login() throws InterruptedException {
		lgn = new Loginpage(driver);
		lgn.enterusername("varun.anant@centific.com");
		logger.info("User name passed successfully");
		lgn.enterpassword("storeuser@123");
		logger.info("Password passed successfully");
		lgn.clicklogin();
		Thread.sleep(3000);
		logger.info("Login successful");
		}
		
		
		//New sub tasks
		@Test(priority=1)
		public void newtasks() throws InterruptedException
		{
	    nst = new NewSubtaskPage(driver);
		nst.clicknewsub();
		Thread.sleep(3000);
		logger.info("clicked on new ");
		nst.clicknewretailexecution();
		Thread.sleep(3000);
		nst.searchfor();
		Thread.sleep(3000);
		logger.info("click action on new-retail execution successful");
		nst.clicknewcustomerdemand();
		Thread.sleep(3000);
		logger.info("click action on new-customer demand successful");
		nst.clicknewcustomerexperiance();
		Thread.sleep(3000);
		logger.info("click action on new-customer experiance successful");
		nst.clicknewlossprevention();
		Thread.sleep(3000);
		logger.info("click action on new-loss prevention successful");
		nst.clicknewworkplacesafety();
		logger.info("click action on new-work place safety successful");
		
		}
	
		//closed sub task
		
		@Test(priority=2)
		public void completesubtask() throws InterruptedException
		{
		Completedsubtaskpage cst = new Completedsubtaskpage(driver);
		cst.clickcomplete();
		Thread.sleep(3000);
		logger.info("clicked on completed");
		cst.clickcompletedretail();
		Thread.sleep(3000);
		logger.info("click action on completed-retail execution successful");
		cst.clickcompletedcustomerdemand();
		Thread.sleep(3000);	
		logger.info("click action on completed-customer demand successful");
		cst.clickcompletecustomerexperiance();
		Thread.sleep(3000);
		logger.info("click action on completed-customer experiance successful");
		cst.clickCompletelossprevention();
		Thread.sleep(3000);
		logger.info("click action on completed-loss prevention successful");
		cst.clickCompleteworkplacesafety();
		Thread.sleep(3000);
		logger.info("click action on completed-work place safety successful");
		}
	
		//Blocked sub task
		
		@Test(priority=3)
		
		public void blockedsubtask() throws InterruptedException {
	
		 bst = new Blockedsubtaskpage(driver);
		bst.clickBlocked();
		Thread.sleep(3000);
		logger.info("clicked on blocked");
		bst.clickblockedretail();
		Thread.sleep(3000);
		logger.info("click action on blocked-retail execution successful");
		bst.clickblockedcustomerdemand();
		Thread.sleep(3000);
		logger.info("click action on blocked-customer demand successful");
		bst.clickblockedcustomerexperiance();
		Thread.sleep(3000);
		logger.info("click action on blocked-customer experiance successful");
		bst.clickblockedlossprevention();
		Thread.sleep(3000); 
		logger.info("click action on blocked-loss prevention successful");
		bst.clickblockedworkplacesafety();
		Thread.sleep(3000);		
		logger.info("click action on blocked-work place safety successful");
		}
			
		//store insights page
		
	 @Test(priority=4)
	 public void storeinsights() throws InterruptedException
	 {
		StoreinsightsPage sip = new StoreinsightsPage(driver);		
		sip.clickonstoreinsights();
		Thread.sleep(3000);
		logger.info("clicked on store insights sub task");
		sip.clickoncountry();
		Thread.sleep(3000);
		logger.info("Country selected successfully");
		sip.clickonstate();
		Thread.sleep(3000);
		logger.info("State selected successfully");
		sip.clickonzipcode();
		Thread.sleep(3000);
		logger.info("Zip-code selected successfully");
		sip.clickonstore();
		Thread.sleep(3000);	
		logger.info("Store selected successfully");
	 }
		
				
		//Logout
	 @AfterTest
	 public void logout()
	 {
		lgn.clicklogout();
		logger.info("logout successful");
		driver.quit();	
	}
}