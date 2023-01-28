package TestNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void logInMethod() {
	  Reporter.log("log in is done",true);
  }
  
  @Test(dependsOnMethods ="logInMethod")
  public void createUser() {
	  Reporter.log("user is creadted",true);
  }
  
  @Test(dependsOnMethods = "createUser")
  public void logOutMethod() {
	  Reporter.log("log Out done",true);
  }
}
