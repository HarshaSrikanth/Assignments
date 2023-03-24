import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class testEnumeration {
	
	public static void main(String[] args) {
	
		   Map map=new HashMap();
	       map.put("one","harsha");
	       map.put("two", "mohan");
	       map.put("three","praveen");
	       map.put("four", "srikanth");
	       map.put("five","abhi");
	       
	       Enumeration e=Collections.enumeration(map.keySet()); 
	       
	       while(e.hasMoreElements()) {
	    	   Object key=e.nextElement();
	    	   Object value=map.get(key);
	    	   System.out.println(key+" "+value);
	       }
	}

}