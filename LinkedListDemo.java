import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListDemo {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll1 = new LinkedList<>(Arrays.asList(4,5));
		LinkedList<Integer> ll = new LinkedList<>();
		Integer[] arr =  new Integer[ll1.size()];
		for(int i=0; i<5; i++)
		{
			ll.add(sc.nextInt());
		}
		sc.close();
		System.out.println(ll);
		System.out.println(ll.get(1));
		ll.set(1, 500);
		System.out.println(ll);
		ll.remove(new Integer(500));
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
		System.out.println(ll.indexOf(5));
		System.out.println(ll.size());
		ll.addAll(ll.size(), ll1);
		System.out.println(ll);
		ll.removeAll(ll1);
		System.out.println(ll);
		arr = ll1.toArray(arr);
		for(Integer a : arr)
		System.out.println(a);
		
		
		
	}
}
