package annatations;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Learndataprovider { // indices is to choose which data we want to run,we can also use multiple datas
	@DataProvider( indices = {0,1},parallel = true) // We have to give the dataprovider a name and we have to call it by this name
										// wherever we want, // parallel = true, it will run parallely
	public String[][] Getdata() {
		String Data[][] = new String[2][2]; // We have to declare data provider as string of arrays
		Data[0][0] = "9629848589"; // Email 1
		Data[0][1] = "qwerty";  // pass 1
		Data[1][0] = "8778172853"; // email 2
		Data[1][1] = "9092047883"; //Pass 2
		return Data; // We have to return the data type as string of Arrays
	}
	@Test(dataProvider = "Getdata")  // We have to call the data provider by its method name if it is in a same class 
	public void f(String email, String pass) {  // We have to declare it in arguments
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElementById("email").sendKeys(email);
		driver.findElementById("pass").sendKeys(pass);
		driver.findElementByXPath("//button[@name='login']").click();
	}
}
