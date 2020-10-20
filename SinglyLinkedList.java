import java.util.*;

public class SinglyLinkedList{

	public class Node{
		int data;
		Node next;

		public Node(int data){
			this.data = data;
			this.next = null;
		}

		public Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
	}

	private static Node head;
	private int size = 0;

	public SinglyLinkedList(){
		head = null;
		size = 0;
	}

	/**
	* Normal Insertion
	*/
	public void add(int data){
		Node addNode = new Node(data);
		if(head == null){
			head = addNode;
			return;
		}
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}

		temp.next = addNode;
	}

	/**
	* Inserting at the front of list.
	*/

	public void addBeforeHead(int data){
		Node addNode = new Node(data);
		if(head == null){
			head = addNode;
			return;
		}
		addNode.next = head;
		head = addNode;
	}

	public void printNodes(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + "-");
			temp=temp.next;
		}
	}

	public static void main(String args[]){
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(10); //head = null
		list.add(20); //head = 10
		list.add(30); //head = 10
		list.printNodes();
		System.out.println("\naddBeforeHead");
		list.addBeforeHead(40); // 40-10-20-30-
		list.printNodes();
	}
}