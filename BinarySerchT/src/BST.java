import java.util.Stack;

public class BST {
	/*
	 * we consider 0 level as root & further root dont perform any operation so we
	 * set value as null
	 */
	private Node root;

	public BST() {
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
				System.out.print(temp.getData() + " ");
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
			System.out.print(temp.getData() + " ");
			temp = temp.getRight();

		}
		System.out.println();
	}

//	public void preOrder() {
//		Node temp = root;
//		Stack<Node> st = new Stack<>();
//		System.out.println("Pre--");
//		while (temp != null || !st.empty()) {
//			while (temp != null) {
//				System.out.println(temp.getData() + " ");
//				st.push(temp);
//				temp = temp.getLeft();
//
//			}
//			temp = st.pop();
//			temp = temp.getRight();
//
//		}
//		System.out.println();
//	}
	public void postOrder() {
		class Pair {
			Node node;
			char flag;

			public Pair(Node node, char flag) {
				this.node = node;
				this.flag = flag;
			}
		}
		Node temp = root;
		Stack<Pair> str = new Stack();
		System.out.println("Post-");
		while (temp != null || !str.empty()) {
			while (temp != null)
				str.push(new Pair(temp, 'L'));
			temp = temp.getLeft();
		}
		Pair pair = str.pop();
		if (pair.flag == 'L') {
			temp = pair.node.getRight();
			pair.flag = 'R';
			str.push(pair);
		} else {
			System.out.print(pair.node.getData() + "");

		}
		System.out.println();
	}

	/* Now getting values as per we store values on operations */
	public void preOrder(Node data) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + " ");
		System.out.print(root.getLeft());
		System.out.print(root.getRight());
	}

	public void inOrder(Node data) {
		if (root == null) {
			return;
		}
		System.out.print(root.getLeft());
		System.out.print(root.getData() + "");
		System.out.print(root.getRight());
	}

	public void postOrder(Node data) {
		if (root == null) {
			return;
		}
		System.out.print(root.getLeft());
		System.out.print(root.getRight());
		System.out.print(root.getData() + "");
	}

	public int getCount(Node root) {
		if (root == null) {

			return 0;
		}
		return 1 + getCount(root.getLeft()) + getCount(root.getRight());

	}

	/*
	 * Now We Have to find elements in Tree for that operations we declare () store
	 * root & data root==null ret false if true then check for data is exact macthes
	 * or not if these is true then check for data is greter or not if these true
	 * then find element
	 */
	public boolean find(Node root, int data) {
		if (root == null) {
			return false;
		}
		if (root.getData() == data) {
			return true;
		}
		if (data < root.getData()) {
			return find(root.getLeft(), data);
		}
		return find(root.getRight(), data);
	}

	public Node getroot() {
		return root;
	}

	/* for deleting elements in tree finding root first */
	public boolean delete(int data) {
		if (root == null) {
			return false;
		}

		/*
		 * for deleting elements we took two varibales traverse them up to node then
		 * checking data is not equals to data or not if true then del left or del right
		 */
		Node present = root, del = root;
		while (del.getData() != data) {
			if (data < del.getData()) {
				present = del;
				del = del.getLeft();
			} else {
				present = del;
			}
			del = del.getRight();
		}
		/* for deletig elements we need to check is root prsent or not */
		if (del == null) {
			return false;
		}
		while (true) {
			if (del.getLeft() == null && del.getRight() == null) {
				if (del == root) {
					root = null;
					return false;
				}
				if (present.getLeft() == del) {
					present.setLeft(null);
				} else {
					present.setRight(null);

				}
				return true;
			} else {
				/* now going down for deleting nodes we get min & max from that node & then perform 
				 * operatioms on it */
				if (del.getLeft() != null) {
					present = del;
					Node max = del.getLeft();
					while (max.getRight() != null) {
						present = max;
						max = max.getRight();
					}
					int temp = max.getData();
					max.setData(del.getData());
					del.setData(temp);
					del = max;
				} else {
					present = del;
					Node min = del.getRight();
					while (min.getLeft() != null) {
						present = min;
						min = min.getLeft();
					}
					int temp = min.getData();
					min.setData(del.getData());
					del.setData(temp);
					del = min;

				}
			}

		}
	}
}
