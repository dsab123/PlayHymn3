package app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlayHymnsPage {
	private final WebDriver driver;
	private String siteTitle = "PlayHymns";
	
	By dropdownLocator = By.className("dropdown-toggle");
	By weekLocator = By.className("week");
	By hymn1TextLocator = By.id("hymn1-text");
	By hymn2TextLocator = By.id("hymn2-text");
	By hymn3TextLocator = By.id("hymn3-text");
	By audioBarLocator = By.id("audioBar");
	
	public PlayHymnsPage(WebDriver driverIn) {
		driver = driverIn;
		
		if (!driver.getTitle().equals(siteTitle)) {
			throw new IllegalStateException("this is not the PlayHymns page.");
		}
	}
	
	public PlayHymnsPage clickOnDropdown() {
		driver.findElement(dropdownLocator).click();
		return this;
	}
	
	public PlayHymnsPage selectWeek() {
		driver.findElement(weekLocator).click();
		return this;
	}
	
	public PlayHymnsPage selectHymn1() {
		driver.findElement(hymn1TextLocator).click();
		return this;
	}

	public PlayHymnsPage selectHymn2() {
		driver.findElement(hymn2TextLocator).click();
		return this;
	}
	
	public PlayHymnsPage selectHymn3() {
		driver.findElement(hymn3TextLocator).click();
		return this;
	}
}
