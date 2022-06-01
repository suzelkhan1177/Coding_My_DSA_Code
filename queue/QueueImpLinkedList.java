package queue;



class Node<T>{
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
	}
}

public class QueueImpLinkedList<T> {

	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public QueueImpLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size ==0;
	}
	
	public void enqueue(T elm) {
		
		Node<T> newNode = new Node<T>(elm);
		
		if(size == 0) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		
		size++;
		
	}
	
	public T front() {
		
		if(size == 0) {
			return null;
		}
		
		return front.data;
	}
	
	public T dequeue() {
		if(size == 0) {
			return null;
		}
		T temp = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		return temp;
	}
}
