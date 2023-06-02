public static boolean detectCycle(Node<Integer> head) {
       
       if(head == null || head.next == null){
           return false;
       }
       
        // Write your code here.
         Node<Integer> slow = head;
         Node<Integer> fast = head.next;

          while(slow != fast){

               if(fast == null  || fast.next == null){
                  return false;
              }

              fast = fast.next.next;
              slow = slow.next;

          }

          return true;
    }
