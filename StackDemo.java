import java.util.Scanner;
import java.util.Stack;
public class StackDemo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<5; i++)
		{
			st.push(sc.nextInt());
		}
		sc.close();
		for(Integer i : st)
			System.out.println(i);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.search(3));
		System.out.println(st.empty());
		int popped = st.pop();
		System.out.println(popped);
	}
}
