package attributes;

import org.testng.annotations.Test;

public class Groups {
  @Test(groups = {"one"}) // If we include one in the xml config only the group named one will execute
  public void Signin() {  // We have to convert it into xml file and to make changes in the config
	  System.out.println("Signin");
  }
  @Test(groups = {"one"}) // If we give both include and exclude only included will run
  public void Login() {   // If we give the same group in include and exclude no test will run
	  System.out.println("login");
  }
  @Test(groups = {"two"})
  public void Searchfortheproduct() {
	  System.out.println("Searchfortheproduct");
  }
  @Test(groups = {"two","one"})
  public void Addtocart() {
	  System.out.println("addtocart");
  }
  @Test(groups = {"three"})
  public void Singout() {
	  System.out.println("Signout");
  }
  
}
