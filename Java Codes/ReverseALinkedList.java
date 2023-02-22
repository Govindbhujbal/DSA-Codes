package learningJava;

public class ReverseALinkedList {
	public static void main(String[] args) {
		
	}
	public Node reverse(Node head) {
		Node cur=head;
		Node prev=null;
		while(cur!=null) {
			Node temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
	}
	public Node reverseByRecursion(Node head) {
		if(head==null || head.next==null) {
			return null;
		}
		Node newHead = reverseByRecursion(head.next);
		Node headNext = head.next;
		headNext.next = head;
		head.next = null;
		return newHead;
	}
}
class Node{
	Node next;
	int data;
	public Node(int data) {
		this.data = data;
	}
}