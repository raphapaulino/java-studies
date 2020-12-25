import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {
		Queue queue = new LinkedList<>();
		
		System.out.println("Push: " + queue.add("a"));
		System.out.println("Push: " + queue.add("b"));
		
		System.out.println("Element: " + queue.element()); // will print the element that has been waiting the longest in the queue 
		
		System.out.println("Poll: " + queue.poll()); // return true or false
		System.out.println("Element: " + queue.element());
		System.out.println("Peek: " + queue.peek()); // is the same as queue.element() but, it return an exception if the queue is empty 
	}
}
