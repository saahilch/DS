package linked;

public class LinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}

	public LinkedList(Node head) {
		// super();
		this.head = head;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		// cheking here if node is present or not
		if (newNode == null) {
			return false;
		}
		// if node is present then check their head is 0 or not f S then assign hed to
		// newNode
		if (head == null) {
			head = newNode;
			return true;
		}
		/*
		 * same for finding last value
		 */
		Node last = head;
		// travercing from head upto null node & adding new node on it
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);

		return true;

	}
	/* incerting node inbetween  
	 1- first create new node & check it if null then break from condition
	 & it false then set head ie null & store new node on head */	
	public boolean ins(int d) {
		Node newNode = new Node(d);
		if (newNode == null) {
			return false;
		}
		if(head==null)
		{
			head=newNode;
			return true;
		}
		Node last=head;
		while(last.getNext()!=null)
		{
			last=last.getNext();
		}
		last.setNext(newNode);

		return true;
	}
	
	
}
