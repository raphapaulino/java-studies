import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrSync {

	public static void main(String[] args) {
//		List<String> list = Collections.synchronizedList(new ArrayList<String>());
//		
//		list.add("Raphael");
//		list.add("Victor");
//		list.add("Mr. Stark");
//		
//		synchronized (list) {
//			Iterator<String> iterator = list.iterator();
//			
//			while(iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
//		}
		
		List<String> list2 = new CopyOnWriteArrayList<String>();
		
		list2.add("Kate");
		list2.add("Joe");
		list2.add("Marta");
	}
}
