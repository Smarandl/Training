package Adhoc;

import org.testng.annotations.Test;

import com.amazon.shabnam.Practice1;
import com.beust.jcommander.Parameters;

import site.pages.Forgotofpsswd;
import site.pages.Home;
import site.pages.practice1;
import site.pages.practice2;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Home_Regression {
	public WebDriver driver;	
 
  public void login() {
	  Home home=new Home(driver);
	  home.Emailidfield();
	  home.psswordfield();
	  home.loginbt();
	  driver.navigate().back();
	   
	 // when we want to use diff userid and pass , we use this way
	  // public void login() {
	  //Home home=new Home(driver);
	  //home.Emailidfield("shabnam@gmail.com");
	 // home.psswordfield('zk");
	  //home.loginbt();
  }
  @Test
  public void testingsearchpassword() throws InterruptedException {
	  practice2 gg = new practice2(driver);
	  practice1 bb = new practice1(driver);
	  bb.Emailidfield();
	  Thread.sleep(2000);
	  bb.psswordfield();
	  Thread.sleep(2000);
	  bb.loginbt();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  bb.forgotpsswd();
	  Thread.sleep(2000);
	  gg.searchfield();
	  Thread.sleep(2000);
	  gg.hh();
	  Thread.sleep(2000);
	  
	  
	  
  }
  
  @BeforeClass
 @org.testng.annotations.Parameters({"url", "browser"})
  public void beforeClass(String wbsite, String br) {
	  if(br.equalsIgnoreCase("chrome")) {
		  System.setProperty ("webdriver.chrome.driver", "C:\\Users\\Shabnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver ();
			 driver.navigate ().to(wbsite);
			 driver.manage().window().maximize();
	  
	  }else if (br.equalsIgnoreCase("firefox")) {
	   System.setProperty ("webdriver.gecko.driver", "C:\\Users\\Shabnam\\Documents\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 driver = new FirefoxDriver ();
		 driver.navigate ().to(wbsite);
		 driver.manage().window().maximize();
  }else{ 
	  System.out.println("please check the name");
  }
	
  }

  @AfterClass
  public void afterClass() {
  }

}
