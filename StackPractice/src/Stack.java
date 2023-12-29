
public class Stack<ST> {
	/*
	 * 1 create array Container To Store Stack Value On it set declare size & thier
	 * top
	 */
	private ST[] arr;
	private int size, top;

	public Stack(int size) {

		this.size = size;
		this.top = -1;
		arr = (ST[]) new Object[size - 1];
	}

	/*
	 * now 1st we check is stack is empty & to check if full or not
	 */
	public boolean isEmpty() {
		return top == -1;

	}

	public boolean isFull() {
		return top == size - 1;
	}

	/* now using above function we push values on empty stack */
	public boolean push(ST data) {
		if (isFull()) {
			return false;
		}
		arr[++top] = data;
		return true;

	}

	/* after that we perform peek & pop operation */
	public ST pop() {
		if (isEmpty()) {
			return null;
		}
		return arr[top--];

	}

	public ST peek() {
		if (isEmpty()) {
			return null;
		}
		return arr[top];

	}

}
