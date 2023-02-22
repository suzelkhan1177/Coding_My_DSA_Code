public class DoubliLinkedList {

//create Node class
 class Node<T>{
		
		T data;
		Node<T> next;
		Node<T> prev;
		
		Node(T val){
			this.data = val;
			this.next = null;
			this.prev = null;
		}
	}
	
	 Node head;
	
	//print LinkedList
	public  void print() {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+ " -> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	//insert front Element in LinkedList
	public  void insertHead(int val) {
		
		Node newNode = new Node(val);
		 
	      newNode.next =  head;
	      newNode.prev = null;
	      
	     if( head != null)
	     head.prev = newNode;
	     
	     head = newNode;
	}
	
	//insert Tail Element in LinkedList
	public  void insertTail(int val) {
		
	 Node newNode = new Node(val);
	  if(head == null) {
		   head = newNode;
		  return;
	  }
		 
	  Node temp = head;
	  
	  while(temp.next != null) {
		  temp = temp.next;
	  }
	  
	  temp.next = newNode;
	  newNode.prev = temp;
	  temp = newNode;
	     
	}
	

	public void add(int val  , int pos ) {
	
		
		if(pos == 1) {
			insertHead(val);
			return;
		}
		
		Node temp = head;
		
		int count = 1;
		while(count < pos -1) {
			temp = temp.next;
			count++;
		}
		
		if(temp.next == null) {
			insertTail(val);
			return;
		}
		Node newNode = new Node(val);
		
		newNode.next = temp.next;
		temp.next.prev = newNode;
		temp.next = newNode;
		newNode.prev = temp;
	}
	
	
public void deleteNode(int pos) {
	
	 if(pos == 1) {
		 head = head.next;
		 head.next.prev = null;
		 
	 }else {
	
		    Node curr = head, prev = null;
		    
		      int count =1; 
		      while(count < pos) {
		    	  prev = curr;
		    	  curr = curr.next;
		    	  count++;
		      }
		      
		      if(curr.next != null) {
		      curr.prev = null;
		      prev.next = curr.next;
		      curr.next = null;
		      }
		  
		      
		 if(curr.next == null) {
			 curr.prev.next = null;
		 }    
	 
	 }
}
	

	public static void main(String[] args) {
		
		DoubliLinkedList LL = new DoubliLinkedList();
		
		LL.insertHead(12);
		LL.insertHead(13);
		LL.insertHead(14);
		LL.insertTail(15);
		LL.insertTail(16);
		
		LL.print();
	
		LL.deleteNode(5);
		LL.print();
	}

}
