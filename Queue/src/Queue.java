
public class Queue {
	int arr[];
	int front, rare, size;

	public boolean isEmpty() {

		return (front == -1 && rare == -1 || (front > rare));
		}
	public boolean isFull()
	{
		return rare==size-1;
	}
	public boolean insert(int data)
	{
		if(isFull())
		{
			return false;	
		}
		arr[++rare]=data;
		return true;
	}
	public int delete()
	{
		if(isEmpty())
		{
			return -999;
		}
		return arr[front++];
	}
	
	
}
