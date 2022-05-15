import java.util.*;
public class takeInputLL {
	
	class Node<T>{
		
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
//		     next = null;
		}
	}
	
   // O(n*n)
    public static Node<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
       
        int data = s.nextInt();
        Node<Integer> head = null;
        while(data != -1) {
        	Node<Integer> currNode = new Node<Integer>(data);
        	if(head == null) {
        		
        		head = currNode;
        	}else {
        		Node<Integer> tail = head;
        		while(tail.next != null) {
        			tail = tail.next;
        		}
        		tail.next = currNode; 
        		
        	}
        	
        	data = s.nextInt(); 
        }
     return head;
    }
    
    
    public static void print(Node head) {
    	
    	Node<Integer> temp = head;
    	while(temp != null) {
    		System.out.print(temp.data + " ");
    	}
    	System.out.println();
    }

  // O(n)
	public static Node<Integer> TakeInput2(){
		
		Scanner s= new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null, tail =null;
        while(data != -1){
          Node<Integer> currentNode= new Node<integer>(data);
          if(head==null){
            head=currentNode;
            tail=currentNode;
          }else{
          
            tail.next = currentNode;
            tail=currentNode;    //tail=tail.next;
        }
       data= s.nextInt();
       
	}
        return head;
	}

	public static void main(String[] args) {
	
		Node<Integer> head = takeInput();
       print(head);	
	}

}

