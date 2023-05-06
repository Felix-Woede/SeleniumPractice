package PackageSwadel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

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
				
				
				
				

	}

}
