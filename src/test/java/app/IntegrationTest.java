package app;

import org.mockito.Matchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.core.IsEqual.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IntegrationTest {

	WebDriver driver;
	//String siteName = "https://playhymns.herokuapp.com";
	String siteName = "http://localhost:5000";
	String siteTitle = "PlayHymns";
	PlayHymnsPage playHymnsPage;
	
	@Before
	public void setUp() {
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get(siteName);
		playHymnsPage = new PlayHymnsPage(driver);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void verifyPageOpens() {
		assertThat(driver.getTitle(), is(equalTo(siteTitle)));
	}
	
	@Test
	public void selectWeek_verifyWeekAndHymnListingsAppear() {
		playHymnsPage.clickOnDropdown();
		
		playHymnsPage.selectFirstWeek();
		
		playHymnsPage.selectHymn1();
		
		
	}
	
	@Test
	public void selectGithubIcon_verifyLink() {
		playHymnsPage.clickOnGithubIcon();
		
		
	}
	
}
