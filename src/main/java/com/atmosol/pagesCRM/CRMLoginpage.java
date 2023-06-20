package com.atmosol.pagesCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.atmosol.pagesCRM.CRMLoginpage;

import net.bytebuddy.asm.Advice.This;

public class CRMLoginpage {
	public WebDriver driver;

	public CRMLoginpage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	private By usernameField = By.name("username");
	private By passwordField = By.name("password");
	private By loginButton = By.cssSelector("[value='Login']");
	private By crmlogo = By.xpath("//a[@class='navbar-brand']/img[@class='img-responsive']");

	public CRMLoginpage() {
		PageFactory.initElements(driver, this);
	}

	public CRMLoginpage Login(String usern, String passw) {
		driver.findElement(usernameField).sendKeys(usern);
		driver.findElement(passwordField).sendKeys(passw);
		driver.findElement(loginButton).click();

		return new CRMLoginpage();
	}

	public String validatePageTitle() {
		return driver.getTitle();
	}

	public Boolean velidateLogo() {
		return driver.findElement(crmlogo).isDisplayed();
	}

	public void clicklogin() {
		driver.findElement(loginButton).click();
	}

	

}
