class LinkedListt{
	static int count=0;
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}		
		
		
	}
	
	
	Node head;
	public void add(int data)
	{
		count++;
		Node toAdd = new Node(data);
		if(head == null)
		{
			head = toAdd;
		}
		else {
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = toAdd;
			temp = toAdd;
		}
	}
	
	void traversal()
	{
		if(head == null)
		{
			System.out.println("Empty");
		}
		else {
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	
	void display(Node n)
	{
		Node temp = n; 
		if(temp != null)
		{
			display(temp.next);
			System.out.println(temp.data);
		}
	}
	
}
public class LinkedListTraversal{
	public static void main(String[] args)
	{
		LinkedListt ll = new LinkedListt();
		for(int i=1; i<=10; i++)
		{
		ll.add(i);
		}
	ll.display(ll.head);
	System.out.println(ll.count);
	}
}