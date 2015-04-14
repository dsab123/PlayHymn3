package app;

import org.mockito.Matchers.*;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class IntegrationTest {

	WebDriver driver;
	
	
	@Before
	public void setup() {
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("https://mysterious-mesa-5118.herokuapp.com");
		
		System.out.println("driver set up.");
	}
	
	@Test
	public void verifyPageOpens() {
		
		driver = new FirefoxDriver();
		driver.get("https://mysterious-mesa-5118.herokuapp.com");
		
		System.out.println("driver set up.");
		
		assertThat(driver.getTitle(), is(equalTo("PlayHymns")));
	}
	
	
}
