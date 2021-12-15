package asserts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assetrsequal {
	WebDriver driver;

	@BeforeClass
	public void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void login() {
		driver.get("http://triotend.com/tts/site/login");
		driver.findElement(By.cssSelector("#email")).sendKeys("triotend@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("triotend");
		driver.findElement(By.cssSelector("[type='submit']")).click();	 
		String exptitle = "Smat Hospital Management System";
   String acttitle = driver.getTitle();
 //Assert.assertEquals(exptitle, acttitle); // If it is equal then nxt line will execute
 Assert.assertEquals(acttitle, exptitle,"Title is mismatched");
  
		
		driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-of-type(1)")).click();

	}
}
