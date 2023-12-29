package SimpleBST;

public class BST {
	private Node root;

	public BST() {
		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public boolean insertNode(int data) {
		Node newNode = new Node(data);
		if (newNode == null) {
			return false;
		}
		if (root == null) {
			root = newNode;
			return true;
		}

		Node temp = root;
		while (true) {
			if (data == temp.getData()) {
				return false;
			}

			if (data < temp.getData()) {
				if (temp.getLeft() == null) {
					temp.setLeft(newNode);
					return true;
				}
				temp = temp.getLeft();
			}

			if (data > temp.getData()) {
				if (temp.getRight() == null) {
					temp.setRight(newNode);
					return true;
				}
				temp = temp.getRight();
			}
		}
	}

	public void preOrder(Node node) {
		if (node == null)
			return;
		System.out.print(node.getData() + " ");
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}

	public void inOrder(Node node) {
		if (node == null)
			return;
		inOrder(node.getLeft());
		System.out.print(node.getData() + " ");
		inOrder(node.getRight());
	}

	public void postOrder(Node node) {
		if (node == null)
			return;
		postOrder(node.getLeft());
		postOrder(node.getRight());
		System.out.print(node.getData() + " ");
	}

	public boolean deleteNode(int data) {
		if (root == null) {
			return false;
		}
		Node del = root;
		Node prev = root;
		while (data != del.getData()) {
			if (data < del.getData()) {
				prev = del;
				del = del.getLeft();
			} else {
				prev = del;
				del = del.getRight();
			}
		}
		while (true) {
			if (del.getLeft() == null && del.getRight() == null) {
				if (prev.getLeft() == del) {
					prev.setLeft(null);
				} else {
					prev.setRight(null);
				}
				return true;
			} else {

				if (del.getLeft() != null) {
					prev = del;
					Node max = del.getLeft();

					while (max.getRight() != null) {
						prev = max;
						max = max.getRight();
					}
					int temp = max.getData();
					max.setData(del.getData());
					del.setData(temp);
					del = max;
				} else {
					prev = del;
					Node max = del.getRight();
					while (max.getLeft() != null) {
						prev = max;
						max = max.getLeft();
					}
					int temp = max.getData();
					max.setData(del.getData());
					del.setData(temp);
					del = max;
				}
			}
		}
	}
}
