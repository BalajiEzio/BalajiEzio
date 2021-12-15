package attributes;

import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;

public class DEPENDSON {
	@Test
	public void signup() {
		System.out.println("signup");
		throw new RuntimeErrorException(null) ;
	}

	@Test(dependsOnMethods = "signup", alwaysRun = true) // it will run after sign up method
	public void searchforproduct() {  // always run=true means it will run irrespective of dependencies
		System.out.println("searchforproduct");
	}

	@Test(dependsOnMethods = "searchforproduct", priority = -1) // If both priority and depends is present, it will run
																// based on depends
	public void choosetheproduct() {
		System.out.println("choosetheproduct");
	}

	@Test(dependsOnMethods = "annatations.DEPENDSON.choosetheproduct" ) // IF it was in another package,then we should
																		// denote packagename.classname.methodname
	public void signout() { // If there is no priority it will take it as 0
		System.out.println("signout");
	}
}
