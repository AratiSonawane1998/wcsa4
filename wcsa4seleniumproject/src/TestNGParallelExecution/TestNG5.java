package TestNGParallelExecution;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG5 {
  @Test
  public void m1() {
	  Reporter.log("m1 method",true);
	  Assert.fail();
  }
  
  @Test(dependsOnMethods = "m1",alwaysRun = true)
  public void m2() {
	  Reporter.log("m2 method",true);
	 
	 
  }
}
