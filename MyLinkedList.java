package linkedlist;

public class MyLinkedList {
	
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	
	Node head, tail;
	
	void add(int data)
	{
		Node toAdd = new Node(data);
		if(isEmpty())
		{
			head = toAdd;
			tail = toAdd;
		}
		else
		{
			tail.next = toAdd;
			tail = toAdd;
		}
		
	}
	
	boolean isEmpty()
	{
		return head == null;
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
	
	void addAtBegin(int data)
	{
		Node toAdd = new Node(data);
		toAdd.next = head;
		head = toAdd;
		
	}
	
	void addAtLast(int data)
	{
		Node toAdd = new Node(data);
		tail.next = toAdd;
		tail = toAdd;
	}
	
	
}
