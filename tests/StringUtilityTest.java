import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;


public class StringUtilityTest extends TestCase {
	  protected ArrayList<String> bag;
	  protected String sep;
	  protected String cadena = null;
	  
	  // assigning the values
	  protected void setUp(){
		  bag.add("Klk");
		  bag.add("Siii!!!");
		  sep = "manin";
		  
		  for (int i = 0; i < bag.size(); i++) {
			if (!(i % 2 == 0) || i == 1) {
				cadena += sep;
			} else {
				cadena += bag.get(i);
			}
		  }	
	  }

	  @Test
	  public void testconcat(){
		//Valid case	  
		
		  
	    //Invalid case
		
	  }
  
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
