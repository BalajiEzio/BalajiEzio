package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpectedExpection {
	
  @Test(expectedExceptions = {NoSuchElementException.class})
  
  public void f() { // If there is no such element exception it will pass the test
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement a = driver.findElement(By.cssSelector("[type='subm"
				+ "t']"));
		boolean b = a.isDisplayed();
		System.out.println("is displayed" + b);
		String a1 = a.getText();
		System.out.println(a1);
		driver.quit();
  }
}
