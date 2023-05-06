package PackageSwadel;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassSwadel {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
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
		

		

		
		//Click on my account button
		driver.findElement(By.cssSelector("#layout > div > header > div.header_1.cz_menu_fx_fade_in > div > div > div.elms_right.header_1_right > div.cz_elm.icon_header_1_right_4.inner_icon_header_1_right_2 > a > i")).click();
		
		//Type and clear data from all fields
		driver.findElement(By.cssSelector("#username")).sendKeys("fhfjfhgfghhvhvhv");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#username")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("vfhgjhghjgjhhjghjg");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).clear();
		Thread.sleep(3000);

		//driver.findElement(By.cssSelector("#reg_email")).sendKeys("felix@gmail.com");
		//driver.findElement(By.cssSelector("#reg_email")).clear();
		
		//Click on ToggleEye to reveal password
		driver.findElement(By.cssSelector("#password")).sendKeys("Kwessi-San1981");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(2) > span > span")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(2) > span > span")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).clear();
		Thread.sleep(3000);
		//Check remember me button
		driver.findElement(By.cssSelector("#rememberme")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#rememberme")).click();
		Thread.sleep(3000);


		
		//Valid Registration
		//Register with wrong email format
		driver.findElement(By.cssSelector("#reg_email")).sendKeys("felix@gmail.");
		driver.findElement(By.cssSelector("#customer_login > div.u-column2.col-2 > form > p:nth-child(4) > button")).click();
		driver.findElement(By.cssSelector("#reg_email")).clear();


		//Invalid Login (correct username and wrong password)
		driver.findElement(By.cssSelector("#username")).sendKeys("felixwoed@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("vfhgjhghjgjhhjghjg");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#username")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).clear();
		Thread.sleep(3000);


		//Invalid Login (wrong username and correct password)
		driver.findElement(By.cssSelector("#username")).sendKeys("woed@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("Kwessi-San1981");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#username")).clear();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).clear();
		Thread.sleep(3000);
		//Valid Login (Correct username and correct password)
		driver.findElement(By.cssSelector("#username")).sendKeys("felixwoed@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#password")).sendKeys("Kwessi-San1981");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(2) > span > span")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#customer_login > div.u-column1.col-1 > form > p:nth-child(3) > button")).click();
		Thread.sleep(6000);

	    //driver.close();	
		//egister_msg:nth-child(7)
		
		
		
	}

}
