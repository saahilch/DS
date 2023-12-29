
public class Main {

	public static void main(String[] args) {
		Stack<Integer>stk=new Stack<>(10);
		//pushing elements on stack initially size is 10 so it will store only 10 elements
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		stk.push(60);
		stk.push(70);
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
		System.out.println(stk.peek());
		
		

	}

}
