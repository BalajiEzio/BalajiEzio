package attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class invocationcount {
  @Test(invocationCount = 3,invocationTimeOut = 20000)     //count = 3 it will run 3 times
  public void f() {     // timeout=10000, it has to execute within that,else it will fail
	  // Invocation timeout will work only after  Invocation count
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
