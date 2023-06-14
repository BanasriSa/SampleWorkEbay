package WorkSample.WorkSample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SEIT1 {
	@Test
	
	private void LoginTest() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\ChromeDriver\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ebay.com/");
		System.out.println(driver.getCurrentUrl());
		Assert.assertTrue(driver.getCurrentUrl().contains("ebay"), "Page not loaded");

		
		//navigate to Category
		driver.findElement(By.xpath("//button[text()=' Shop by category']")).click();
		
		
		//click on Cell phones & accessories
		driver.findElement(By.xpath("//a[text()='Cell phones & accessories']")).click();
		
		//click on Cell Phones & Smartphones in left hand side navigation menu		
		driver.findElement(By.xpath("//a[contains(text(),'Cell Phones & Smartphones')]")).click();
		Assert.assertTrue(driver.getCurrentUrl().contains("Cell-Phones-Smartphones"), "Cell-Phones-Smartphones not selected");
				
		//click on See All for Shop by Brand
		 WebElement apple= driver.findElement(By.xpath("//span[text()='- Shop by Brand']/preceding-sibling::span"));
		 apple.click();
		
		//click on See All for Shop by Storage Capacity
		//driver.findElement(By.xpath("//span[text()='- Shop by Storage Capacity']/preceding-sibling::span")).click();
		
		//screenSize
		driver.findElement(By.xpath("//div[@id='c3-mainPanel-Screen%20Size']")).click();
        // Select screen size filter as 5.0 to 5.4 in, 4.5 to 4.9 in, 4.0 to 4.4 in
		WebElement screenSize1= driver.findElement(By.xpath("//div[@class='x-overlay__sub-panel']/descendant::div[3]"));
		screenSize1.click();
		WebElement screenSize2= driver.findElement(By.xpath("//div[@class='x-overlay__sub-panel']/descendant::div[4]"));
		screenSize2.click();
		WebElement screenSize3=driver.findElement(By.xpath("//div[@class='x-overlay__sub-panel']/descendant::div[5]"));
		screenSize3.click();
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(1000));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(null));
			
		
		//price
		driver.findElement(By.xpath("//div[@class=\"x-overlay__wrapper--left\"]/descendant::div[@id='c3-mainPanel-price']/span")).click();
        // Select Price filter from 0 to 2000 dollar
		WebElement minP= driver.findElement(By.xpath("//div[@class='x-textrange']/descendant::input[1]"));
		minP.sendKeys("100");
		WebElement maxP= driver.findElement(By.xpath("//div[@class='x-textrange']/descendant::input[2]"));
		maxP.sendKeys("200");
		
		//location
		driver.findElement(By.xpath("//div[@class=\"x-overlay__wrapper--left\"]/descendant::div[@id='c3-mainPanel-location']/span")).click();
        // Select Item location filter as US only
		WebElement selectLocation= driver.findElement(By.xpath("//div[@class='x-overlay__sub-panel']/descendant::input[@value='US Only']"));
		selectLocation.click();
		
		//Apply
		driver.findElement(By.xpath("//div[@class='x-overlay-footer__apply']/child::button")).click();
		
       
		//verify price based on filter
     List<WebElement> list;
	try {
		list = driver.findElements(By.xpath("//div[@class='s-item__detail s-item__detail--primary']/child::span[@class='s-item__price']"));
		System.out.println("Element located");		
		
		for(int i=0; i<list.size();i++) {
	    	String price= list.get(i).getText();
	    	System.out.println(price);
	    }
	    
	} catch (Exception e) {
		System.out.println(e.getMessage());
		System.out.println("not found");
	}
	
	
    
      
      try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		System.out.println(e.getMessage());
	}
      
 
        
        
        


        
        
//        //Verify that the filter tags are applied.
//        if (screenSizeTag.isDisplayed() && priceTag.isDisplayed() && itemLocationTag.isDisplayed()) {
//            System.out.println("Filter tags are applied successfully.");
//        } else {
//            System.out.println("Filter tags are not applied.");
//        }	

        // Close the browser
        driver.quit();
	}
}
