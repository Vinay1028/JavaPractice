import java.util.Queue;
import java.util.LinkedList;
public class QueueDemo {
	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.remove());
		
	}
}
