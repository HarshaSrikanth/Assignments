import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class testArrayList {

	public static void main(String[] args) {
	
     List list=new ArrayList();
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