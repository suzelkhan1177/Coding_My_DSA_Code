public class CirculerLinkedList {
	
	//create Node class
	class Node<T>{
		
		T data;
		Node<T> next;
		
		Node(T val){
			this.data = val;
			this.next = null;
			
		}
	}

	Node head , tail;
	
	
	//Print Linked List
	public void print() {
		
		Node temp = head;
        if (head != null) {
            do {
                System.out.printf("%d ", temp.data);
                temp = temp.next;
            } while (temp != head);
        }
 
        System.out.printf("\n");
	}
	
public void add(int  data) {
	
    Node ptr1 = new Node(data);
    ptr1.next = head;


    if (head != null) {
    	
        Node temp = head;
        
        while (temp.next != head)
            temp = temp.next;
        
        temp.next = ptr1;
    }
    else
        ptr1.next = ptr1; /*For the first node */

    
    head = ptr1;
	
}

	

	public static void main(String[] args) {
	
		  CirculerLinkedList LL = new CirculerLinkedList();
		   LL.add(10);
		   LL.add(11);
		   LL.add(12);
		   LL.add(13);
		 
		   LL.print();
		   

		  
	}

}
