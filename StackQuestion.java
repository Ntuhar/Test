import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class StackQuestion {
	public void array(String A) {

		String[] parts = A.split(" ");
		for (int i = parts.length - 1; i >= 0; i--) {
			System.out.print(parts[i] + " ");

		}

		System.out.println("");
	}

	public void stack(String A) {
		Stack<String> stack = new Stack<String>();
		String[] parts = A.split(" ");
		for (int i = parts.length - 1; i >= 0; i--) {
			stack.push(parts[i]);

		}
		System.out.println("By stack : " + stack.toString());

	}

	public void withoutSplit(String A) {
		int j = 0;
		int i = 0;
		String Result = "";
		Stack<String> stack = new Stack<String>();
		for (i = A.indexOf(" "); i != -1; i = A.indexOf(" ", i + 1)) {
			stack.push(A.substring(j, i+1));
			j = i;

		}
		stack.push(A.substring(j, A.length()));
		//System.out.println(stack);

		for (i = stack.size() - 1; i >= 0; i--) {
			Result = Result + stack.get(i).toString();

		}
		System.out.println("By Not using Split : " + Result);
	}

	public static void main(String[] args) {
		String A = "My Name Is Nikhil";
		StackQuestion s = new StackQuestion();
		 s.array(A);
		 s.stack(A);
		s.withoutSplit(A);
	}
}
