import java.util.Scanner;
import java.util.ArrayDeque;
public class DequeDemo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayDeque<String> s = new ArrayDeque<>();
		s.addFirst(sc.next());
		s.addFirst(sc.next());
		System.out.println(s);
		s.addLast(sc.next());
		s.addLast(sc.next());
		System.out.println(s);
		s.offerFirst(sc.next());
		System.out.println(s);
		sc.close();
	}

}
