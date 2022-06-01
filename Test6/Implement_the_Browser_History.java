package Test6;

class Node{
    
    Node prev , next;
    String url;
    
    Node(String url){
         this.url = url;
        prev = null;
        next = null;
       
    }
}
public class Implement_the_Browser_History{
  
	     Node curr;
	    Node head;
	    
	    public Implement_the_Browser_History(String homepage) {
	       head = new Node(homepage);
	        curr = head;
	     }

	    public void visit(String url) {

	           Node temp = new Node(url);
	         
	             if(temp.next != null){
	                 
	                 temp.next = null;
	             }
	         
	            curr.next = temp;
	            temp.prev = curr;
	            curr = curr.next;
	    }

	    public String back(int steps) {

	        while(curr.prev != null && steps > 0){
	            curr = curr.prev;
	            steps--;
	        }
	             
	        return curr.url;
	    }

	    public String forward(int steps) {
	        
	        while(curr.next != null && steps >0){
	            curr = curr.next;
	            steps--;
	        }
	        
	        return curr.url;
	        
	    }
}
