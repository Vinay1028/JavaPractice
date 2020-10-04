package linkedlist;

public class LinkedList {
	
	Node head;
	
	void add(int data)
	{
		Node toAdd = new Node(data);
		if(isEmpty())
		{
			head = toAdd;
			return;
		}
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = toAdd;
	}
	
	boolean isEmpty()
	{
		if(head == null)
			return true;
		return false;
	}
	
	void print()
	{
		Node temp;
		temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	Integer remove()
	{
		if(isEmpty())
			return null;
		Node temp = head;
		head = head.next;
		return temp.data;
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
