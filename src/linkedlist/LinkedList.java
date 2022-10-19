package linkedlist;


public class LinkedList {
	
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
		}
	}
	
	public void display() {
		Node node = head;
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public void isInList(int data) {
		Node node = head;
		boolean isInList = false;
		while(node != null) {
			if(node.data == data) {
				isInList = true;
			}
			node = node.next;
		}
		System.out.println(isInList);
	}
}
