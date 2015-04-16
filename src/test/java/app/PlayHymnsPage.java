package app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlayHymnsPage {
	private final WebDriver driver;
	private String siteTitle = "PlayHymns";
	
	By dropdownLocator = By.className("dropdown-toggle");
	By weekLocator = By.className("week");
	By hymn1TextLocator = By.className("hymn1-text");
	
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
	
	public PlayHymnsPage clickOnWeek() {
		driver.findElement(weekLocator).click();
		return this;
	}
	
}
