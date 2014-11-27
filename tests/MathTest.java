import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.junit.Test;


public class MathTest extends TestCase {
  protected int n;
  protected double d;
  
  // assigning the values
  protected void setUp(){
   n = 10;
   d = 3.14;
  }

  @Test
  public void testperimeterOfSquare(){  
    //Invalid case
    assertEquals(n,d);    
  }
  
  @Test
  public void testevenDivide() {
	  //Valid Case
	  assertTrue(n%4 == 0);
	  
	  n = 5;
	  
	  //Invalid Case
	  assertTrue(n%4 == 0);
  }
  
 @Test
 public void test() {	
  fail("Not yet implemented");
 }
}
