class Linked{
	
	Node head;
	 void add(int data)
	 {
		 Node toAdd = new Node(data);
		 if(head == null)
		 {
			 head = toAdd;
		 }
		 else {
			 Node temp = head;
			 while(temp.next != null)
				 temp = temp.next;
			 temp.next = toAdd;
			 temp = toAdd;
		 }
	 }
	 
	 void print()
	 {
		 Node temp = head;
		 while(temp != null)
		 {
			 System.out.print(temp.data+" ");
			 temp = temp.next;
		 }
	 }
	 
	
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
}
public class SumOfLinkedListElements{
	public static void main(String[] args)
	{
		Linked ll = new Linked();
		for(int i=1; i<10; i++)
		{
			ll.add(i);
		}
		System.out.println();
		ll.print();
		Linked.Node temp= ll.head;
		int sum = 0;
		while(temp != null)
		{
			sum += temp.data;
			temp =  temp.next;
		}
		System.out.println(sum);
	}
}