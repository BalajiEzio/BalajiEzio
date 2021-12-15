package annatations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BAC {
	WebDriver driver;

	@Test
	public void f() {
		driver.get("https://www.facebook.com/");

	}

	@Test
	public void a() {
		driver.get("http://triotend.com/ecom/");
	}

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup(); // before and after class will execute only once irrespective of no 0f
													// tests
		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

}
