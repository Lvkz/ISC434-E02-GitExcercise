import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Lvkz
 *
 */
public class MyTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time instanciaTime = new Time();
		ArrayList<Integer> t1 = new ArrayList<Integer>();
		ArrayList<Integer> t2 = new ArrayList<Integer>();
	    
		t1.add(2);
	    t2.add(3);
	    
	    t1.add(4);
	    t2.add(4);
	    
	    t1.add(7);
	    t2.add(3);
		    
		instanciaTime.earlier(t1, t2);
		
	}

}
