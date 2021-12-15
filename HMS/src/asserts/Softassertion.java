package asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Softassertion {
	@Test
	public void f() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://triotend.com/tts/site/login");
		driver.findElement(By.cssSelector("#email")).sendKeys("triotend@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("triotend");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		// Title
		String exptitle = "Smat Hospital Management Systm";
		String acttitle = driver.getTitle();
		SoftAssert sftsrt = new SoftAssert(); // although the title is not same it allows to execute the nxt line
		sftsrt.assertEquals(acttitle, exptitle, "Title is not same");
		// url
		String expurl = "http://triotend.com/tts/admin/admin/dashboard"; // the nxt line is executed inspite of before
																			// line failure
		String acturl = driver.getCurrentUrl();

		sftsrt.assertEquals(acturl, expurl, "Url is not same");

		driver.findElement(By.cssSelector("ul.sidebar-menu>li:nth-of-type(1)")).click();
		sftsrt.assertAll(); // To get the failed error in console
	}
}
