package Adhoc;

import org.testng.annotations.Test;

import site.pages.Homepageamazon;
import site.pages.Signin;
import site.pages.Tryprime;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Assignment {
	WebDriver driver;
  @Test
  public void f() {
	  
	  Homepageamazon cc=new Homepageamazon(driver);
	  cc.Tryprimefield();
	  Tryprime gg=new Tryprime(driver);
	  gg.Tryprimebutton();
	  Signin hh=new Signin (driver);
	  hh.EmailField();
	  
	
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty ("webdriver.chrome.driver", "C:\\Users\\Shabnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver ();
		 driver.navigate ().to("https://amazon.com");
		 driver.manage().window().maximize();
		 
  }

  @AfterClass
  public void afterClass() {
  }

}
