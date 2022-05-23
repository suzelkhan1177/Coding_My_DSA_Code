import java.io.*;


class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    
    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class LinkedListRecursion{
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while(i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }
    
 public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
      
     if (head == null || head.next == null) 
         return head;
       
    LinkedListNode<Integer> temp = rev(head.next);
    head.next.next = head;
    head.next = null;
    return temp;

	}
    
    public static void printRec(LinkedListNode<Integer> head){
    	
  	  if(head == null)
  		  return;
  	  
  	  System.out.print(head.data+ " ");
  	  printRec(head.next);
  }

  public static LinkedListNode<Integer> InsertRec(LinkedListNode<Integer> head, int elm, int pos){
  	
  	  if(head == null && pos >0)
  		  return head;
  	  
  	  if(pos == 0) {
  		  LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(elm);
  		  newNode.next = head;
  		  return newNode;
  	  }else {
  		  
  		  head.next = InsertRec(head.next, elm, pos-1);
  		  return head;
  	  }
  	
  }
  
  public static int len(LinkedListNode<Integer>  head){
      
      int count =0;
   LinkedListNode<Integer>  temp = head;
   
   while(temp != null){
       count++;
       temp = temp.next;
   }
   
   return count;
}

public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
	
   int lenth = len(head);
   
   if(head == null && pos >= lenth)
         return head;
   
   if(pos == 0){
   return head.next;
   
   }else{
       
        head.next = deleteNodeRec(head.next, pos-1);
		  return head;
   }
    
   
}

public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
	//Your code goes here
    if(head == null)
        return null;
    
    reverseLinkedListRec(head.next);
    System.out.print(head.data + " ");

    return null;
}
	
	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
  
           if(head == null){
               return -1;
           }
        
        
           if(head.data == n)
               return 0;

        
           int count = findNodeRec(head.next, n);
     
       
       if(count!=-1)
         return 1+count;
        else
        return -1;
	}
  
    
    public static void main(String[] args) throws NumberFormatException, IOException {
   

        
            System.out.println("Enter number");
            LinkedListNode<Integer> head = takeInput();  
            InsertRec(head,20,2);
               printRec(head);
           

    }
}
