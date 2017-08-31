
public class ImplementStackUsingLinkedList {
	Node top;
	class Node{
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementStackUsingLinkedList stack = new ImplementStackUsingLinkedList();
		stack.push(4);
		stack.push(5);
		stack.push(7);
		stack.push(9);
		stack.push(410);
		stack.pop();
		stack.display();
	}
	
	public boolean isEmpty() {
		if (top == null)
			return true;
		else 
			return false;
	}
	
	public void push(int data) {
			Node n = new Node(data);
			n.next = top;
			top = n;
	}
	
	public void pop() {
		int popedData = 0;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			popedData = top.data;
			top = top.next;
			System.out.println("poped ele"+popedData);
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
		Node cur = top;
		while (cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
		}
	}

}
