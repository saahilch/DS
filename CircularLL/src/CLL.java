
public class CLL {
	Node head;

	public CLL() {
		head = null;
	}

	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (head == null) {
			head = newNode;
			newNode.setNext(head);
			return true;
		}
		Node last = head;
		while (last.getNext() != head) {
			last = last.getNext();
		}
		last.setNext(newNode);
		newNode.setNext(head);

		return true;
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
			if (head == null) {
				head = newNode;
				newNode.setNext(newNode);
				return true;
			}
			newNode.setNext(head);
			Node last = head;
			while (last.getNext() != head) {
				last = last.getNext();

			}
			last.setNext(newNode);
			head = newNode;
			return true;
		}
		Node prev = head;
		for (int i = 0; i <= pos - 1; i++) {
			prev = prev.getNext();
			if (prev == head) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);

		return true;
	}

	public void disp() {
		if (head == null) {
			return;
		}
		Node tem = head;
		do {
			System.out.println(tem.getData() + " ");
			tem = tem.getNext();
		} while (tem != head);
		System.out.println();
	}

	public boolean delete(int data) {
		if (head == null) {
			return false;
		}
		if (head.getNext() == head) {
			head = null;
			return true;
		}
		Node last = head;
		while (last.getNext() != head) {
			last = last.getNext();
		}
		last.setNext(head.getNext());
		head = head.getNext();

		return true;

	}
	//lie no112
	
}

