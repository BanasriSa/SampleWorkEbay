package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
	
	
	public ProductViaSearch enterproduct(String productsearch) {
		// driver.findElement(username).sendKeys(uname);

		driver.findElement(searchMacbook).sendKeys(productsearch);
		driver.findElement(selectElement).click();
		driver.findElement(search).click();
		
		ProductViaSearch psearch = PageFactory.initElements(driver, ProductViaSearch.class);
		return psearch;
		
		
	
	}
}
