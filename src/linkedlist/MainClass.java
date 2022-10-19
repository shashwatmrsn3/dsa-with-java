package linkedlist;

public class MainClass {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insert(5);
		linkedList.insert(6);
		linkedList.insert(7);
		linkedList.display();
		linkedList.isInList(9);
	}
}
