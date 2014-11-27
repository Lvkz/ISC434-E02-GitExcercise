import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;


public class TimeTest extends TestCase {
  protected ArrayList<Integer> t1, t2;
  
  protected void setUp(){
    t1.add(2);
    t2.add(3);
    
    t1.add(4);
    t2.add(4);
  }

  @Test
  public void testearlier(){
	//True case
	boolean result = t1.get(0) < t2.get(0) ? true : false;
    assertTrue(result);
    
    //False case
    result = t1.get(1) < t2.get(1) ? true : false;
    assertTrue(result);    
  }
  
  @Test
  public void testnextSecond() {
	Date date = new Date();
	ArrayList<Integer> currentTime = new ArrayList<Integer>();
	//Segundo
	currentTime.add(date.getSeconds());
	//Minuto
	currentTime.add(date.getMinutes());
	//Hora
	currentTime.add(date.getHours());
	
	//Segundo + 1
	currentTime.add(currentTime.get(0) + 1);
	
	//True case
	assertTrue(currentTime.get(3) == currentTime.get(0) + 1);
	
	//Segundo <> Segundo + 1
	currentTime.set(3, currentTime.get(0) + 2);
	
	//False case
	assertTrue(currentTime.get(3) == currentTime.get(0) + 1);
  }
  
  @Test
  public void test() {	
	fail("Not yet implemented");
  }
}
