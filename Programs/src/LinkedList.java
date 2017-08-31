
public class LinkedList {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.head = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		head.next = two;
		two.next = three;
		display();
		System.out.println("reverse print");
		displayReverseIterative();

	}
	
	public static void display() {
		Node cur = head;
		while (cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
	
	public static void displayReverseIterative() {
		Node cur = head;
		Node prev = null;
		Node temp;
		while (cur != null) {
			temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		head = prev;
		display();
		}
	}

