package annatations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataproviderdataonotherclass {
	@Test(dataProvider = "Getdata",dataProviderClass = Data.class)  // the data provider is in different class,so we have to use data provider class
	public void f(String email, String pass) {  
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElementById("email").sendKeys(email);
		driver.findElementById("pass").sendKeys(pass);
		driver.findElementByXPath("//button[@name='login']").click();
	}
}
