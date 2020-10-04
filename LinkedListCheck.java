package linkedlist;
public class LinkedListCheck{
	public static void main(String[]  args)
	{
		LinkedListFull ll = new LinkedListFull();
		for(int i=5; i<10; i++)
		{
			ll.insertAtBegin(i);
		}
		ll.print();
		ll.insertAtLast(555);
		System.out.println();
		ll.insertAtLast(5000);
		ll.print();
		System.out.println();
		System.out.println(ll.remove());
		ll.print();
		System.out.println();
		System.out.println(ll.count);
		System.out.println();
		System.out.println(ll.removeLast());
		ll.print();
		System.out.println();
		System.out.println(ll.count);
	}
	
}