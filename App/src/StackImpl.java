import java.util.Random;
import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
//		Stack stack = new Stack<>();
//		Random random = new Random();
//		int i = 5;
//		
//		while (i != 0) {
//			System.out.println(stack.push(random.nextInt(20)));
//			i--;
//		}
//		
//		System.out.println(stack.get(0));
		
		Stack stack2 = new Stack<>();
		Random random2 = new Random();
		int i2 = 5;
		
		while (i2 != 0) {
			System.out.println("Push: " + stack2.push(random2.nextInt(20)));
			i2--;
		}
		
		System.out.println("");
		while (!stack2.isEmpty()) {
//		for (int c = 0; c < 5; c++) {
			System.out.println("Pop: " + stack2.pop());
		}
 		
	}
}
