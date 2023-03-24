import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class testVector {

	public static void main(String[] args) {
		
		List list=new Vector();
	     list.add("harsha");
	     list.add("mohan");
	     list.add("praveen");
	     list.add("srikanth");
	     list.add("abhi");
	     
	     for(int i=0;i<list.size();i++) {
	     System.out.println(list.get(i));
	     }
	}

}