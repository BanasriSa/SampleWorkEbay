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

	//click on filter dropdown
	By filterDropdown = By.xpath("//span[text()='5 filters applied']");

	//get the size of filter dropdown
	   By filterList = By.xpath("//div[@class='x-flyout brm__flyout brm__flyout--selected'][1]/descendant::ul[@class='brm__aspect-list']/child::li/a/span[@class='brm__item-label']");


	public ProductViaCategory SelectProduct(String minimupPrice, String maximunPrice) {
		// driver.findElement(username).sendKeys(uname);	
		driver.findElement(minP).sendKeys(minimupPrice);
		driver.findElement(maxP).sendKeys(maximunPrice);
		// with pagefactory
		ProductViaCategory psearch = PageFactory.initElements(driver, ProductViaCategory.class);
		return psearch;
	}
	
	public void selectshopByCategory() {
		driver.findElement(shopByCategory).click();
	}
	
	public void clickCellPhone() {
		driver.findElement(cellPhonenAcc).click();
	}
	
	public void clickcellpNSmartp() {
	driver.findElement(cellpNSmartp).click();
	}
	
	public void clickSeeAllBrand() {
	driver.findElement(SeeAllBrand).click();
	}
	
	public void selectscreenSize() {
	driver.findElement(screenSize).click();
	}
	
	public void entersize50to54() {
	driver.findElement(size50to54).click();
	}
	
	public void entersize45to49() {
	driver.findElement(size45to49).click();
	}
	
	public void entersize40to44() {
	driver.findElement(size40to44).click();
	}
	
	
	public void selectPrice() {
		driver.findElement(price).click();
		}
	
	public void minPrice() {
		driver.findElement(minP).click();
		}
		
		public void maxPrice() {
			driver.findElement(maxP).click();
			}
	public void selectLocationfilter() {
	driver.findElement(location).click();
	}
	
	public void selectspecificLocation() {
	driver.findElement(selectLocation).click();
	}
	
	public void clickApply() {
	driver.findElement(apply).click();
	}

	public void verifyFilter() {
		driver.findElement(filterDropdown).click();
		}

	
	
	
//count filter tags
   public int getFilterTagsCount() {
        return driver.findElements(filterList).size();
    }

    public String getFilterTagText(int index) {
        WebElement filterElement = driver.findElements(filterList).get(index);
        return filterElement.getText();

	
    }
}