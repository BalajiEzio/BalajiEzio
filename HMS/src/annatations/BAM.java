package annatations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BAM {
	WebDriver driver; // we are declaring it a global,so we can able to use it in all methods

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void test2() {
		driver.get("https://www.facebook.com/"); // for each and every test the before and after method will execute
													// again and again
	}

	@Test(priority = 2)
	public void test1() {
		driver.get("http://triotend.com/ecom/");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
