import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {
////		int[] arr = new int[10];
////
////		arr[0] = 5;
////		arr[1] = "Abc";
//		
//		Vector v = new Vector<>();
//		
////		v.add(e); // return a boolean if we desire work with 'if' statement for example
////		v.addElement(obj); // is most used
//		
//		v.addElement(1);
//		v.addElement("a");
//		
//		System.out.println(v.size());
//		v.remove(0);
//		System.out.println(v.size());
//		
////		// iteration example
////		while (v.elements().hasMoreElements()) {
////			System.out.println(v.elements().nextElement());
////		}
//		
//		// iteration example
//		while (v.iterator().hasNext()) {
//			System.out.println(v.iterator().next());
//		}
		
////		Vector v2 = new Vector<>(int size);
//		Vector v2 = new Vector<>(2, 1);
//		
//		System.out.println(v2.capacity());
//		
//		v2.addElement(1);
//		v2.addElement("a");
//		
//		System.out.println(v2.size());
//		v2.addElement("bc");
//		System.out.println(v2.capacity());
		
		Vector v3 = new Vector<>(2, 3);
		
		System.out.println(v3.capacity());
		
		v3.addElement(1);
		v3.addElement("a");
		
		System.out.println(v3.size());
		v3.addElement("bc");
		System.out.println(v3.capacity());
	}
}
