package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductViaCategory {

	WebDriver driver;

	public ProductViaCategory(WebDriver driver) {
		this.driver = driver;
	}

	// navigate to Category
	By shopByCategory = By.xpath("//button[text()=' Shop by category']");

	// click on Cell phones & accessories
	By cellPhonenAcc = By.xpath("//a[text()='Cell phones & accessories']");

	// click on Cell Phones & Smartphones in left hand side navigation menu
	By cellpNSmartp = By.xpath("//a[contains(text(),'Cell Phones & Smartphones')]");

	// click on See All for Shop by Brand
	By SeeAllBrand = By.xpath("//span[text()='- Shop by Brand']/preceding-sibling::span");

	// click on See All for Shop by Storage Capacity
	// By SeeAllCapacity= By.xpath("//span[text()='- Shop by Storage
	// Capacity']/preceding-sibling::span");

	// screenSize
	By screenSize = By.xpath("//div[@id='c3-mainPanel-Screen%20Size']");

	// Select screen size filter as 5.0 to 5.4 in,
	By size50to54 = By.xpath("//div[@class='x-overlay__sub-panel']/descendant::div[3]");

	// Select screen size filter as 4.5 to 4.9 in,
	By size45to49 = By.xpath("//div[@class='x-overlay__sub-panel']/descendant::div[4]");

	// Select screen size filter as 4.0 to 4.4 in
	By size40to44 = By.xpath("//div[@class='x-overlay__sub-panel']/descendant::div[5]");

//			WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(1000));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(null));

	// price
	By price = By.xpath("//div[@class=\"x-overlay__wrapper--left\"]/descendant::div[@id='c3-mainPanel-price']/span");
	// Select Price filter from 100 dollar
	By minP = By.xpath("//div[@class='x-textrange']/descendant::input[1]");
	// Select Price filter to 500 dollar
	By maxP = By.xpath("//div[@class='x-textrange']/descendant::input[2]");

	// location
	By location = By.xpath("//div[@class=\"x-overlay__wrapper--left\"]/descendant::div[@id='c3-mainPanel-location']/span");
	// Select Item location filter as US only
	By selectLocation = By.xpath("//div[@class='x-overlay__sub-panel']/descendant::input[@value='US Only']");

	// Apply
	By apply = By.xpath("//div[@class='x-overlay-footer__apply']/child::button");


	public ProductViaSearch SelectProduct(String minimupPrice, String maximunPrice) {
		// driver.findElement(username).sendKeys(uname);

		driver.findElement(shopByCategory).click();
		driver.findElement(cellPhonenAcc).click();
		driver.findElement(cellpNSmartp).click();
		driver.findElement(SeeAllBrand).click();
		driver.findElement(screenSize).click();
		driver.findElement(size50to54).click();
		driver.findElement(size45to49).click();
		driver.findElement(size40to44).click();
		driver.findElement(price).click();
		driver.findElement(minP).sendKeys(minimupPrice);
		driver.findElement(maxP).sendKeys(maximunPrice);
		driver.findElement(location).click();
		driver.findElement(selectLocation).click();
		driver.findElement(apply).click();

		// Without PageFactory
		// Dashboard dash=new Dashboard(driver);

		
		// with pagefactory
		ProductViaSearch psearch = PageFactory.initElements(driver, ProductViaSearch.class);
		return psearch;

	}

}
