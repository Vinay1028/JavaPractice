package linkedlist;
public class LinkedListFull{
	Node head;
	//Variable to take count of nodes created 
	static int  count = 0;
	
	//Insertion at beginning
	void insertAtBegin(int data)
	{
		count++;
		Node toAdd = new Node(data);
		if(isEmpty())
		{
			head = toAdd;
		}
		else {
			toAdd.next = head;
			head = toAdd;
		}
	}
	
	//Insertion At End
	void insertAtLast(int data)
	{
		count++;
		Node toAdd = new Node(data);
		Node temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = toAdd;
		temp = toAdd;
	}
	
	//remove from Beginning
	Integer remove()
	{
		if(isEmpty())
		{
			return null;
		}
		else
		{
			count--;
			Node temp = head;
			head = head.next;
			return temp.data;
		}
	}
	
	Integer removeLast()
	{
		if(isEmpty())
			return null;
		else {
			count--;
			Node temp = head;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			
			int d = temp.next.data;
			temp.next = null;
			return d;
			
		}
	}
	
	//Display the list
	void print()
	{
		if(isEmpty())
			System.out.println("Empty");
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	
	//Checking whether the list is empty
	boolean isEmpty()
	{
		return head == null;
	}
	
	//Node 
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