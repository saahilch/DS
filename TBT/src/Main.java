
public class Main {

	public static void main(String[] args) {
		ThreadedBST bt=new ThreadedBST();
		bt.insert(50);
		bt.insert(20);
		bt.insert(10);
		bt.insert(40);
		bt.insert(30);
		bt.insert(25);
		bt.inOrder(bt.root);
		bt.preOrder();
		bt.postOrder();
		

       
			
	}

}
