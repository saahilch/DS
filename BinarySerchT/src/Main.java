
public class Main {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(10);
		bst.insert(30);
		bst.insert(40);
		bst.insert(20);
		bst.insert(60);
		bst.insert(70);
		bst.insert(90);
		
		bst.preOrder();
		bst.preOrder(bst.getroot());
		System.out.println();
		
		bst.inOrder();
		bst.inOrder(bst.getroot());
		System.out.println();
		
		bst.postOrder();
		bst.postOrder(bst.getroot());
		System.out.println();
		
		
		System.out.println("60?"+ bst.find(bst.getroot(),60));
		System.out.println("100?"+ bst.find(bst.getroot(),100));
		bst.delete(40);
		bst.postOrder();
		bst.preOrder();
		bst.inOrder();
		System.out.println("del 91"+bst.delete(91));
		

	}

}
