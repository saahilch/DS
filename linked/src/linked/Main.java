package linked;

public class Main {
	public static void main(String args[]) {
		Linked l = new Linked();
		l.display(l.getHead());
		l.disp(l.getHead());
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		l.insert(60);
		l.insert(70);
		l.insert(80);
		l.display();
		l.insert(90,1);
		l.insert(101,5);
		l.display();
		
	l.display();
		System.out.println("----------");
		//l.disp(l.getHead());
		l.display(l.getHead());//reverse print
		

	}
}
