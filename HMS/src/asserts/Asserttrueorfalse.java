package asserts;


import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asserttrueorfalse {
  @Test
  public void login() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	  driver.get("http://triotend.com/tts/site/login");
	 WebElement img= driver.findElement(By.tagName("img"));
	assertTrue(img.isDisplayed()); // If it is true then nxt line will execute else wont
	assertFalse(img.isDisplayed());  // If it is false then nxt line will execute else wont
	 driver.findElement(By.cssSelector("#email")).sendKeys("triotend@gmail.com");
  }
}
