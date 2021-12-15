package attributes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.apache.hc.core5.reactor.Command.Priority;
import org.testng.annotations.AfterTest;

public class priority { // It will prioritize based on real number system
	@Test(priority = -5)
	public void signup() {
		System.out.println("signup");
	}

	@Test(priority = -2, description = "hi,how are you") // It will displayed after this test passed comment
	public void searchforproduct() {
		System.out.println("searchforproduct");
	}

	@Test(priority = 1)
	public void buytheproduct() {
		System.out.println("buytheproduct");
	}

	@Test(enabled = false) // If we give enabled= false,it will not considered a test, but it will run
	public void selecttheproduct() {
		System.out.println("selecttheproduct");
	}

	@Test(priority = 3)
	public void addtheproduct() {
		System.out.println("addtheproduct"); // If there is two same number then
												// it will prioritize based on ASCII
	}

	@Test(priority = 3)
	public void choosetheproduct() {
		System.out.println("choosetheproduct");
	}

	@Test(priority = 5)
	public void signout() { // If there is no priority it will take it as 0
		System.out.println("signout");
	}

}
