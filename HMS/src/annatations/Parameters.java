package annatations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {
	@Test
	
	public void f() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElementById("email").sendKeys("9629848589");
		driver.findElementById("pass").sendKeys("qwerty");
		driver.findElementByXPath("//button[@name='login']").click();
	}
}