package PackageSwadel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Connecting browser
				System.setProperty("WebDriver.Chrome.driver", "/Users/macbookair/eclipse-workspace/SwadelProjet/BrowserFolder/chromedriver");
				
				//Instantiate the driver that perform the operation
				WebDriver driver = new ChromeDriver();
		       // WebDriverWait wait = new WebDriverWait(driver, 30);

		        driver.manage().window().maximize();  
		      //  WebDriverWait wait = new WebDriverWait();
		        
				// Launch the application
				driver.get("https://netowsolutions.com/swadel");
				
				//Valid Registration
				//Register with wrong email format
				driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2")).click();
				driver.findElement(By.cssSelector("#reg_email")).sendKeys("felix@gmail.");
				driver.findElement(By.cssSelector("#customer_login > div.u-column2.col-2 > form > p:nth-child(4) > button")).click();

				
		

	}

}
