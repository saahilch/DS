import java.util.Stack;

public class BST {
	/*
	 * we consider 0 level as root & fyrther root dont perform any operation so we
	 * set value as null
	 */
	private Node root;

	public BST(Node root) {
		super();
		this.root = null;
	}

	/* 1st we check node is present or not & check iif it is null or not */
	public boolean insert(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (root == null) {
			root = newNode;
			return true;
		}
		/*
		 * using 2 var we store valus on left & right fro level 1 these all are store it
		 * into while to check values are true or false
		 */
		Node temp = root;
		while (true) {
			if (data == temp.getData()) {
				return false;
			}
			if (data <= temp.getData()) {
				if (temp.getLeft() == null) {

					return true;
				}
				temp.setLeft(newNode);
			} else {
				if (temp.getRight() == null) {
					return true;
				}
				temp.setRight(newNode);
			}
		}

	}

	/* now selecting left & right nodes & ordering them as pre & post */
	public void preOrder() {
		Node temp = root;
		Stack<Node> st = new Stack<>();
		System.out.println("Pre--");
		while (temp != null || !st.empty()) {
			while (temp != null) {
				System.out.println(temp.getData() + " ");
				st.push(temp);
				temp = temp.getLeft();

			}
			temp = st.pop();
			temp = temp.getRight();

		}
		System.out.println();
	}

	public void inOrder() {
		Node temp = root;
		Stack<Node> st = new Stack<>();
		System.out.println("In--");
		while (temp != null || !st.empty()) {
			while (temp != null) {

				st.push(temp);
				temp = temp.getLeft();

			}
			temp = st.pop();
			System.out.println(temp.getData() + " ");
			temp = temp.getRight();

		}
		System.out.println();
	}

	public void preOrder() {
		Node temp = root;
		Stack<Node> st = new Stack<>();
		System.out.println("Pre--");
		while (temp != null || !st.empty()) {
			while (temp != null) {
				System.out.println(temp.getData() + " ");
				st.push(temp);
				temp = temp.getLeft();

			}
			temp = st.pop();
			temp = temp.getRight();

		}
		System.out.println();
	}
	public void postOrder()
	{
		class pair()
		{
			Node=node;
			char=flag;
		}
		
	}

}
