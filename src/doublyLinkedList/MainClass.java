package doublyLinkedList;

public class MainClass {

	public static void main(String[] args) {
		DoublyLinkedList linkedList = new DoublyLinkedList();
		linkedList.insert(5);
		linkedList.insert(6);
		linkedList.insert(7);
		linkedList.display();
		linkedList.isInList(9);
	}
}
