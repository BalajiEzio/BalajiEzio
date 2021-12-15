package attributes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class depends {
	WebDriver driver;
	@Parameters
	
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
	   
	  }
  @Test
  public void clickfrntofc() {
	  
	  WebDriverWait wait = new WebDriverWait(driver, 40);
	  
	  
	  WebElement frntofc =  driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-of-type(1)"));
	  
	  wait.until(ExpectedConditions.elementToBeClickable(frntofc));
	  frntofc.click();
	
  }
}
