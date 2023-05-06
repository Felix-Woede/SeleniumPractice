package PackageSwadel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;


public class AllMenu {
	WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException {
		 System.setProperty("WebDriver.Chrome.driver", "/Users/macbookair/eclipse-workspace/SwadelProjet/BrowserFolder/chromedriver");
			
			//Instantiate the driver that perform the operation
			driver = new ChromeDriver();
	        driver.manage().window().maximize();  
	        
			// Launch the application
			driver.get("https://netowsolutions.com/swadel");
			
			//Valid login
			//driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2")).click();

	
	}
	
	

	@Test
	public void CheckAllMenu() throws InterruptedException {
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2")).click();

		driver.findElement(By.cssSelector("#username")).sendKeys("felixwoed@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("Kwessi-San1981");
		driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")).click();


		
		driver.findElement(By.cssSelector("#page_content > div > section > div > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--orders.is-active > a")).click();
		driver.findElement(By.cssSelector("#page_content > div > section > div > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--downloads > a")).click();
		driver.findElement(By.cssSelector("#page_content > div > section > div > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-address > a")).click();
		driver.findElement(By.cssSelector("#page_content > div > section > div > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--payment-methods > a")).click();
		driver.findElement(By.cssSelector("#page_content > div > section > div > div > div > nav > ul > li.woocommerce-MyAccount-navigation-link.woocommerce-MyAccount-navigation-link--edit-account > a")).click();
		Thread.sleep(3000);
	
		//	driver.findElement(By.cssSelector("")).click();
		
	}
	


  @AfterTest
  public void afterTest() {
	  
	//  driver.quit();
  }

 
}
