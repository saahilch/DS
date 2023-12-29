package SimpleBST;

public class Test {

	public static void main(String[] args) {
		BST bst= new BST();
		
		bst.insertNode(50);
		bst.insertNode(30);
		bst.insertNode(90);
		bst.insertNode(70);
		bst.insertNode(40);
		
		bst.preOrder(bst.getRoot());
		System.out.println();
		bst.inOrder(bst.getRoot());
		System.out.println();
		bst.postOrder(bst.getRoot());
		bst.deleteNode(70);
		System.out.println();
		bst.inOrder(bst.getRoot());
	}

}
