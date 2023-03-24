import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class testHashMap {

	public static void main(String[] args) {
	
       Map map=new HashMap();
       map.put("one","harsha");
       map.put("two", "mohan");
       map.put("three","praveen");
       
       Iterator it=map.keySet().iterator();
       
       while(it.hasNext()) {
    	   System.out.println(map.get(it.next()));
       }
	}

}