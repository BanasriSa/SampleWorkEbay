package com.atmosol.pagesCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;

	private By firstNameField = By.name("firstName");
	private By lastNameField = By.name("lastName");
	private By postalCodeField = By.id("postal-code");
	private By continueButton = By.name("continue");
	private By overviewTitleLabel = By.cssSelector(".summary_info_label.summary_total_label");
	private By finishButton = By.id("finish");

	public HomePage(WebDriver driver) {
	    this.driver = driver;
	}

	public HomePage() {
	}

	public void enterFirstName(String firstName) {
	    driver.findElement(firstNameField).sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
	    driver.findElement(lastNameField).sendKeys(lastName);
	}

	public void enterPostalCode(String postalCode) {
	    driver.findElement(postalCodeField).sendKeys(postalCode);
	}

	public void clickContinueButton() {
	    driver.findElement(continueButton).click();
	}

	public String getOverviewTitle() {
	    return driver.findElement(overviewTitleLabel).getText();
	}

	public void clickFinishButton() {
	    driver.findElement(finishButton).click();
	}
}
