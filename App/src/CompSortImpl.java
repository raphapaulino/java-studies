import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSortImpl {
	public static void main(String[] args) {
		List<Person> arr = new ArrayList<Person>();
		
		arr.add(new Person("Michael", 21));
		arr.add(new Person("Jhonatan", 30));
		arr.add(new Person("Ramirez", 31));
		arr.add(new Person("Monique", 32));
		
		for (Person p : arr) {
			System.out.println(p.getName() + " " + p.getAge());
		}
		
		System.out.println("");
		
		Collections.sort((List) arr);
//		Collections.sort((List) arr, new Person());
		
		for (Person p : arr) {
			System.out.println(p.getName() + " " + p.getAge());
		}
	}
}
