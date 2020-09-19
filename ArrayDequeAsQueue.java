import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayDeque;
public class ArrayDequeAsQueue {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Queue<String> q = new ArrayDeque<>();
		q.offer(sc.next());
		q.offer(sc.next());
		sc.close();
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
	}
}
