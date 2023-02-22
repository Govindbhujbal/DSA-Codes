package learningJava;

public class ReverseLinkedList {
	Node reverse(Node head) {
		Node cur=head;
		Node prev=null;
		while(cur!=null) {
			Node temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		}
		return prev;
	}
	public static void main(String[] args) {
		
	}
}
class Node{
	String cost;
	public Node next;
	
}