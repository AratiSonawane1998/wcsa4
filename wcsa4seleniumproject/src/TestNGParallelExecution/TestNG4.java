package TestNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG4 {
  @Test
  public void today() {
	   long threadid = Thread.currentThread().getId();
	   Reporter.log("today metrhod "+threadid+"is the thread",true);
  }
  
  @Test
  public void tomorrow() {
	   long threadid = Thread.currentThread().getId();
	   Reporter.log("tomorrow metrhod "+threadid+"is the thread",true);
  }
}
