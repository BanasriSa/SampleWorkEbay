package com.ebay.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMy_Trip {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium webdriver\\ChromeDriver\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElements(By.tagName("iframe")).size());

		// navigate to iframe
		driver.switchTo().frame(driver.findElement(By.name("notification-frame-173061b02")));

		// close the popup
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();

		// click on From label
		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']//span[text()='From']"))
				.click();

		// enter from as bengalore
		driver.findElement(By.xpath("//div[@role='combobox']/input[@placeholder='From']")).sendKeys("bengaluru");

		// select bengalore
		driver.findElement(By.xpath("//ul[@class='react-autosuggest__suggestions-list']//p[text()='Bengaluru, India']"))
				.click();

		// click on To label
		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchToCity inactiveWidget ']//span[text()='To']"))
				.click();

		// enter from as Mysore
		driver.findElement(By.xpath("//div[@role='combobox']/input[@placeholder='To']")).sendKeys("Hyd");

		// select Mysore
		driver.findElement(By.xpath("//ul[@role='listbox']//p[text()='Rajiv Gandhi International Airport']")).click();
		
		
		driver.findElement(By.xpath("//div[text()='July 2023']/parent::div/following-sibling::div[@class='DayPicker-Body']//p[text()='2']")).click();
		
		driver.findElement(By.xpath("//span[text()='Return']")).click();
		
		driver.findElement(By.xpath("//div[text()='July']/parent::div/following-sibling::div[@class='DayPicker-Body']//p[text()='12']")).click();
		driver.findElement(By.xpath("//p[@data-cy='submit']/a[text()='Search']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='commonOverlay ']/span")).click();

	}

}
