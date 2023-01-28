package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Add {
  @Test
  public void add() {
	  Reporter.log("adiition of two no",true);
  }
  
  @Test
  public void add2()
  {
	  Reporter.log("addition of add1 method ");
  }
  @Test
  
  public void add1()
  {
	  Reporter.log("addition is not done",true);
	  int a[]= {1,2,3,4};
	  int res=a[4];
	  
  }
}
