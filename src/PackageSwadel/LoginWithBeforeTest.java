package PackageSwadel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginWithBeforeTest {
	WebDriver driver; 
	
	@BeforeTest
	public void setupBrowser() {
       System.setProperty("WebDriver.Chrome.driver", "/Users/macbookair/eclipse-workspace/SwadelProjet/BrowserFolder/chromedriver");
		
		//Instantiate the driver that perform the operation
		driver = new ChromeDriver();
       // WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.manage().window().maximize();  
      //  WebDriverWait wait = new WebDriverWait();
        
		// Launch the application
		driver.get("https://netowsolutions.com/swadel");
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2")).click();

}
	@Test(priority=0)
	public void invalidLogin() throws InterruptedException {
		driver.findElement(By.cssSelector("#username")).sendKeys("woed@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("Kwessi-San1981");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#username")).clear();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("#password")).clear();
		
	}
	
	@Test(priority=1)
	public void validLogin() throws InterruptedException {
		
				
//Valid Login (Correct username and correct password)
		driver.findElement(By.cssSelector("#username")).sendKeys("felixwoed@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("Kwessi-San1981");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")).click();
		Thread.sleep(3000);
		Thread.sleep(6000);

		
		
	}
	
	@AfterTest
	public void AfterTet() {
		driver.quit();
	}
}