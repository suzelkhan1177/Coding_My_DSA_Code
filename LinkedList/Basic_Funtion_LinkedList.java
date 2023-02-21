public class LinkedList {
	private int size;
	
	//create Node class
	class Node<T>{
		
		T data;
		Node<T> next;
		
		Node(T val){
			this.data = val;
			this.next = null;
			size++;
		}
	}
	
	Node head;
	
	public LinkedList() {
		this.size = 0;
	}
	
	
	//ADD Element first position
	public void addFirst(int val) {
		
		Node<Integer> newHead = new Node<>(val);
		if(head == null) {
			head = newHead;
			return;
		}
		
		newHead.next = head;
		head = newHead;
	}
	
	
	//last Element first position	
public void addLast(int val) {
		
		Node<Integer> newNode = new Node<>(val);
		Node<Integer> temp = head;
		
		if(head == null) {
			head = newNode;
			return;
		}
		
	 while(temp.next != null) {
		 temp = temp.next;
	 }
		
		temp.next = newNode;
		
	}


//Print Linked List
public void print() {
	
	if(head == null) {
		System.out.println("List is Empty");
		return;
	}
	
	Node temp = head;
	
	while(temp != null) {
		System.out.print(temp.data+ " -> ");
		temp = temp.next;
	}
	System.out.println("NULL");
}


//Delete Last Element in LIkedList
public void deleteLast() {
	
		
	if(head == null) {
	   System.out.println("LIst is emapty");
		return;
	}
	 size--;
	if(head.next == null) {
		head = null;
		return;
	}
	
	Node secondLast = head;
	Node last = head.next;
	
 while(last.next != null) {
	 last = last.next;
	 secondLast = secondLast.next; 
 }
	
   
	secondLast.next = null;
}


//Delete First Element in LIkedList
public void deleteFirst() {
	
	
	if(head == null) {
	   System.out.println("LIst is emapty");
		return;
	}
   size--;
	head = head.next ;
	
}


// Find LinkedList Length
public  int getSize() {
	return size;
}


//Delete element in linkedList Any Node
public void delete(int pos) {
	
	if(pos == 0) {
		System.out.println("Not Valid list");
		return;
	}
	
	 if(pos == 1) {
		 Node<Integer> temp = head;
		 
		 head  = temp.next;
	 }else {
	
    Node<Integer> curr = head, prev = null;
    
      int count =1;
      
      while(count < pos) {
    	  prev = curr;
    	  curr = curr.next;
    	  count++;
      }
       
      prev.next = curr.next;

	 }
   
}



	public static void main(String[] args) {
	
		LinkedList  LL = new LinkedList ();
		
		LL.addFirst(1);
		LL.addFirst(2);
		LL.addFirst(3);
		LL.addFirst(4);
		LL.addLast(5);
		LL.print();
		LL.delete(2);
		LL.print();
		
//		LL.deleteFirst();
//		LL.print();

	}

}
