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
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			//System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}
}
