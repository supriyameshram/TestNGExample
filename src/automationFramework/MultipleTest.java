package automationFramework;

import org.testng.annotations.Test;

public class MultipleTest {
  @Test(priority = 0)
  public void One() {
	  System.out.println("This is the Test Case Number One");
  }
  
  @Test(priority = 1)
  public void Two()
  {
	  System.out.println("This is the Test Case Number Two");
  }
  
  @Test(priority = 2, enabled = false)
  public void Three()
  {
	  System.out.println("This is the Test Case Number Three");
  }
  
  @Test(priority = 3)
  public void Four()
  {
	  System.out.println("This is the Test Case Number Four");
  }
}
