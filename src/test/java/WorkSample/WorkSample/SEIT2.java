package WorkSample.WorkSample;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SEIT2 {

	@Test
	
	private void Test2() {
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\ChromeDriver\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(driver.getCurrentUrl().contains("ebay"), "Page not loaded");

		
		
		//enter MacBook
		driver.findElement(By.xpath("//div[@id='gh-ac-box2']/input[@placeholder='Search for anything']")).sendKeys("MacBook");
		
		//select computer/tablets and network
		WebElement ele= driver.findElement(By.xpath("//table[@class='gh-tbl2']/descendant::select[@name='_sacat']"));
		Select select=new Select(ele);
		select.selectByVisibleText("Computers/Tablets & Networking");
		driver.findElement(By.xpath("//td[@class='gh-td gh-sch-btn']/input[@value='Search']")).click();
		
		// Wait for the page to load completely
        // can be use explicit or implicit wait here to ensure page load completion		
       
		// Verify that the page has loaded completely
		String pageTitle = driver.getTitle();		
        if (pageTitle.contains("MacBook") && pageTitle.contains("Computers/Tablets & Networking")) {
            System.out.println("Page loaded successfully.");
        } else {
            System.out.println("Page load failed.");
        }
        
    
		
     // Verify that the first result name matches with the search string
        WebElement firstResult = driver.findElement(By.xpath("//li[@id='item5e205ce3a7']/child::div[@class='s-item__wrapper clearfix']/child::div[@class='s-item__info clearfix']/a/div/span/child::span"));
        String firstResultName = firstResult.getText();
		Assert.assertTrue(firstResultName.contains("MacBook"), "Page not loaded");

        
        if (firstResultName.toLowerCase().contains("macbook") || firstResultName.toLowerCase().contains("apple"))
        {
        	System.out.println("First result name matches the search string.");
        }
        else 
        {
            System.out.println("First result name does not match the search string.");
        }

        // Close the browser
        driver.quit();
		
		
	}
}
