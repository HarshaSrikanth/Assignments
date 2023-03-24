import java.util.Hashtable;
import java.util.Iterator;


public class testHashtable {

	public static void main(String[] args) {
		
      Hashtable htable=new Hashtable();
      htable.put("one", "harsha");
      htable.put("two", "mohan");
      htable.put("three","praveen");
      
      Iterator it=htable.keySet().iterator();
      
      while(it.hasNext()) {
    	  Object s=it.next();
    	  System.out.println(s+" --> "+htable.get(s));
      }
	}

}