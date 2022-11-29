package doublyLinkedList;


public class DoublyLinkedList {
	
	Node head;
	
	public void insert(int data) {  
		Node node = new Node();
		node.data = data;
		if(head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
			node.previous = n;
		}
    }  

}
