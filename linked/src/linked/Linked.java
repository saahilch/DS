package linked;

public class Linked {

	private Node head;

	public Node getHead() {
		return head;
	}

	public Linked() {

		head = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (head == null) {
			head = newNode;
			return true;
		}
		Node last = head;
		while (last.getNext() != null) {
			last = last.getNext();

		}
		last.setNext(newNode);

		return true;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println();

	}

	public boolean insert(int data, int pos) {

		if (pos <= 0) {
			return false;
		}
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (pos == 1) {
			newNode.setNext(head);
			head = newNode;
			return true;
		}
		Node pre = head;
		for (int i = 1; i < pos - 1; i++) {
			pre = pre.getNext();
			if (pre == null) {
				return false;
			}

		}
		newNode.setNext(pre.getNext());
		pre.setNext(newNode);

		return true;
	}

	public void disp(Node firstNode) {
//		if (firstNode == null) {
//			System.out.println();
//
//			return;
//		}

		System.out.print(firstNode.getData() + " ");
		disp(firstNode.getNext());
	}

	public void display(Node fistNode) {
		if (fistNode == null) {
			System.out.println(" ");
			return;
		}

		display(fistNode.getNext());
		System.out.print(fistNode.getData() + " ");
	}

}
