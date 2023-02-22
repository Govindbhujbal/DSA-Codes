package learningJava;
public class LinkedList {
	static Node head;
	static class Node {
		Node next;
		int data;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void addFirst(LinkedList list, int data) {
		Node temp = new Node(data);
		if(head==null) {
			head=temp;
		}else {
			temp.next=head;
			head=temp;
		}
//		retrurn list;
	}
	public void add(LinkedList list, int data) {
		Node new_Node = new Node(data);
//		new_Node.next=null; 
		if(head==null) {
			head = new_Node;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new_Node;
		}
//		return list;
	}
	public void printList(LinkedList list) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("null");
	}
	LinkedList delete(LinkedList list, int data) {
		Node temp = head;
		while(temp.next!=null && temp.next.data!=data) {
			temp=temp.next;
		}
		temp=temp.next.next;
		return list;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
//		list=
				list.add(list,5);
//		list=
				list.add(list, 6);
//		list=
				list.add(list, 7);
//		list=
				list.add(list, 8);
//		list=
				list.add(list, 9);
//		list =
				list.addFirst(list, 4);
				list.delete(list,7);
				list.delete(list,7);
				list.delete(list,7);
				list.delete(list,7);
				list.addFirst(list,3);
		list.printList(list);
	}
}
