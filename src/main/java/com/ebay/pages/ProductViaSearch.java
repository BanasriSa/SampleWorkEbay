package com.ebay.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProductViaSearch {

	WebDriver driver;

	public ProductViaSearch(WebDriver driver) {
		this.driver = driver;
	}

	// enter MacBook
	By searchMacbook=By.xpath("//div[@id='gh-ac-box2']/input[@placeholder='Search for anything']");

	// select Books
	By selectElement = By.xpath("//table[@class='gh-tbl2']/descendant::select[@name='_sacat']");
	public void selectCategory(String Books) {
        WebElement element = driver.findElement(selectElement);
        Select select = new Select(element);
        select.selectByVisibleText(Books);
    }
	
	//Click on serach button
	By search= By.xpath("//td[@class='gh-td gh-sch-btn']/input[@value='Search']");
		
	//click first element
    By firstResult = By.xpath("//span[contains(text(),'13\" Apple MacBook Air 512gb SSD 8gb 3.2Ghz i7 TURBO - Big Sur - 3 Year WARRANTY')]");

    
    
	//creating a method to pass parameter	
	public ProductViaSearch enterProduct(String productsearch) throws InterruptedException {
		driver.findElement(searchMacbook).sendKeys(productsearch);
		driver.findElement(selectElement).click();
		driver.findElement(search).click();
		Thread.sleep(4000);
		driver.findElement(firstResult).click();
		ProductViaSearch pcateg = PageFactory.initElements(driver, ProductViaSearch.class);
		return pcateg;	
	}
	
}
