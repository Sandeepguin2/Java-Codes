package DSA.LinkedListAddingAValue;
class Node{
	int data;
	Node next;   //Reference 
	public Node(int data) {
		this.data=data;
		next=null;
	}
	
	
}
public class LinkedList<T> {
	
	Node head=null;
	public void add(int data) {
		Node newNode=new Node(data);
		Node curent=head;
		if(head==null)
		head=newNode;
		else {
			while(curent.next!=null)
				curent=curent.next;
			curent.next=newNode;
		}
		
		
	}
	public void printValues() {
		// TODO Auto-generated method stub
		Node current=head;
		while(current!=null) {
			System.out.print(current.data+"");
			current=current.next;
		}
		System.out.println();
		
	}
	public void addFirst(int data) {
		// TODO Auto-generated method stub
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		
	}
	public void delete(int data) {
		// TODO Auto-generated method stub
		Node current=head;
		while(current.next!=null && current.next.data!=data) {
			current=current.next;
			
		}
		if(current.next!=null) {
			current.next=current.next.next;
		}
		
	}

}
