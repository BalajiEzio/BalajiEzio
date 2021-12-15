package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Threadpool {
  @Test(invocationCount = 4,threadPoolSize = 4) // Thread pool size executes parallel
  public void f() {                // It will work only if there is invocation count
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement a = driver.findElement(By.cssSelector("[type='submit']"));
		boolean b = a.isDisplayed();
		System.out.println("is displayed" + b);
		String a1 = a.getText();
		System.out.println(a1);
		driver.quit();
  }
}
