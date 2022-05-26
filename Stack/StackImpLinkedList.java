package stack;

class Node<T>{
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
	}
}

public class StackImpLinkedList<T> {

	private Node<T> head;
	private int size;
	
	public StackImpLinkedList() {
		
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		
		return size == 0;
	}
	
	public void push(T elem) {
		
		Node<T> newNode = new Node<T>(elem);
		if(head == null) {
			head = newNode;
		}else {
		
		newNode.next = head;
		head = newNode;
		}
		size++;
	}
	
	public T top() throws StackEmptyException{
		if(head == null) {
//		throw new StackEmptyException();
			return null;
		}
		return head.data;
	}
	
	public T pop() {
		if(head == null) {
//			throw new StackEmptyException();
				return null;
			}
		
		T temp = head.data;
	  head =  head.next;
	    size--;
		return temp;
	}
}
