package stack;

import java.util.*;
public class StatckQuestion {
	
//	Question 1
	 public static boolean isBalanced(String str) {
	
//		    Sample Input 1 :
//			 (()()())
//			 Sample Output 1 :
//			 true
		 
//			 Sample Input 2 :
//			 ()()(()
//			 Sample Output 2 :
//			 false
		 
	        Stack<Character> s = new Stack<Character>();
	        
	           for(int i=0; i<str.length(); i++){
	        
	               if(str.charAt(i) == '('){
	                   
	                   s.push(str.charAt(i));
	               }else{
	                   
	                   if( !s.isEmpty() && s.peek() != ')'){
	                       
	                       s.pop();
	                   }
	               }
	               
	         }
	        
	        if(s.isEmpty()){
	            return true;
	        }else{
	            return false;
	        }
	        
	    }
	 
	 //Question 2
	 public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
			
//		    Sample Input 1:
//			 6
//			 1 2 3 4 5 10
//			 Note:
//			 Here, 10 is at the top of the stack.
//			 Sample Output 1:
//			 1 2 3 4 5 10
	        
	        while(! s1.isEmpty()){
	            
	            s2.push(s1.pop());

	        }
	        
	         while(! s2.isEmpty()){
	            System.out.print(s2.pop() +" ");

	        }
	   
		}
	 
	 // Question 3
	 public static boolean checkRedundantBrackets(String str) {
			
//		    Sample Input 1:
//			 a+(b)+c 
//			 Sample Output 1:
//			 true
//			 Explanation:
//			 The expression can be reduced to a+b+c. Hence, the brackets are redundant.
//			 
//			 Sample Input 2:
//			 (a+b)
//			 Sample Output 2:
//			 false
		 
		 
	        Stack<Character> s = new Stack<Character>();
	        
	        boolean ans = false;
	        
	        for(int i=0; i<str.length(); i++){
	            
	              if(str.charAt(i) == '(' || str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' ){
	                  
	                   s.push(str.charAt(i));
	                  
	              }else if(str.charAt(i) == ')'){
	                  if(s.peek() == '('){
	                     ans = true;
	                      return ans;
	                  }
	                  
	                   while(s.peek() == '+' || s.peek() == '-' || s.peek() == '*' || s.peek() == '/' ){
	                  
	                        s.pop();
	                  
	                     }
	                  s.pop();
	              }
	        }
	        
	        return ans;
		}
	 
	 //Question 4
	 public static int[] stockSpan(int[] arr) {
			
//		    Sample Input 1:
//			 4
//			 10 10 10 10
//			 Sample Output 1:
//			 1 1 1 1 
//			 Sample Input 2:
//			 8
//			 60 70 80 100 90 75 80 120
//			 Sample Output 2:
//			 1 2 3 4 1 1 2 8 
		 
	        int n = arr.length;
	        Stack<Integer> s = new Stack<Integer>();
	        int ans[] = new int[n];
	        ans[0] = 1;
	        
	        s.push(0);
	        
	        for(int i=1; i<n; i++){
	            
	            while(!s.isEmpty() && arr[s.peek()] < arr[i]){
	                
	                s.pop();
	            }
	            
	            if(s.isEmpty()){
	                
	                ans[i] = i+1;
	            }else{
	                
	                ans[i] = i- s.peek();
	            }
	            
	            s.push(i);
	            
	        }
	        
	        return ans;
	        
		}
	
//	 Question 5
	 public static int countBracketReversals(String str) {
			
//		 Sample Input 1:
//		 {{{
//		 Sample Output 1:
//		 -1
//		 
//		 Sample Input 2:
//		 {{{{}}
//		 Sample Output 2:
//		 1
	        
	        int n = str.length();
	        
	        if(n%2 == 1){
	            return -1;
	        }
	        
	        Stack<Character> s = new Stack<Character>();
	        
	           for(int i=0; i<str.length(); i++){
	               
	               char ch = str.charAt(i);
	        
	               if (ch == '}' && !s.empty()) {
	                   
	                if (s.peek() == '{') {
	                    s.pop();
	                }else{
	                    s.push(ch);
	                }
	            } else {
	                s.push(ch);
	             }
	               
	         }
	        
	        int a =0 , b=0;
	        while(!s.isEmpty()){
	            
	             if(s.peek() == '{'){
	                 b++;
	             }else{
	                 a++;
	             }
	            
	            s.pop();
	        }
	        
	        int ans = (a+1)/2 + (b+1)/2;
	        
	        return ans;
	        
	    }

	public static void main(String[] args) {
	
	}

}
