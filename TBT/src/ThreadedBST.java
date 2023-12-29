
public class ThreadedBST {
	public Node root;

	public ThreadedBST() {

		root = null;
	}
/*first we inserting elements in tree
 * create new Node check if it is null or not
 * then check root as null & then  */
	public boolean insert(int data) {
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
				if (temp.getlFlag() == 'T') {
					newNode.setRight(temp);
					newNode.setLeft(temp.getLeft());
					temp.setLeft(newNode);
					temp.setlFlag('L');
					return true;
				}
				temp = temp.getLeft();
			} else {
				if (temp.getrFlag() == 'T') {
					newNode.setLeft(temp);
					newNode.setRight(temp.getRight());
					temp.setRight(newNode);
					temp.setrFlag('L');
					return true;

				}
				temp = temp.getRight();
			}
		}

	}

	public void inOrder(Node node) {
		Node temp = root;
		char flag = 'L';
		System.out.println("Inorder-");
		while (temp != null) 
			{
			
			while (temp.getlFlag() == 'L' && flag == 'L') {
				temp = temp.getLeft();

			}
			System.out.print(temp.getData() + " ");
			flag = temp.rFlag;
			temp = temp.getRight();
		}
		System.out.println();
	}

	public void preOrder() {
		Node temp = root;
		char flag = 'L';
		System.out.println("preOrder");
		while (temp != null) {
			
			while (temp.getData() == 'L' && flag == 'L') {
				System.out.print(temp.getData() + " ");
				temp=temp.getLeft();
			}
			if (flag == 'L') {
				System.out.print(temp.getData() + " ");

			}
			flag = temp.getrFlag();
			temp = temp.getRight();

		}
		System.out.println();
		
		
	}
	public void postOrder()
	{
		Node temp=root;
		char flag='L';
		System.out.println("Post Order-");
		while(temp!=null)
		{
			while(temp.getlFlag()=='L'&& flag=='L')
			{
				temp=temp.getLeft();
				
			}
			flag=temp.getrFlag();
			if(flag=='L')
			{
			temp=temp.getRight();	
			}
			else {
				while(true)
				{
					System.out.print(temp.getData()+" ");
					if(rightchild(temp))
					{
						while(temp.getlFlag()=='L')
						{
							temp=temp.getLeft();
						}
						temp=temp.getLeft();
					}
					else {
						while(temp.getrFlag()=='L')
						{
							temp=temp.getRight();
						}
						temp=temp.getRight();
						break;
					}
				}
			}
		}
	}
	

private boolean rightchild(Node node)
{
	if(node==root)
	{
		return false;
	}
	Node temp=root;
	while(true)
	{
		if(node.getData()<temp.getData())
		{
			temp=temp.getLeft();
			if(temp==node)
			{
				return false;	
			}
			
		}
		else
		{
			temp=temp.getRight();
			if(temp==node)
			{
				return true;
			}
			
		}
		
				
	}
}

}
