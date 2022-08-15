package Full_Test_3;

//Sample Input 2:
//(1+(4+5+2)-3)+(6+8)
//Sample Output 2:
//23
import java.util.*;
public class CalCulator {
	
	
	public static int  evaluate(Stack<Object> st) {
		int res =0;
		
		if(!st.isEmpty()) {
			res = (int)st.pop();
		}
		
		while(!st.isEmpty() && !((char)st.peek() == ')')) {
			
			char symbol = (char)st.pop();
			
			if(symbol == '+')
			  res += (int)st.pop();
			else
			  res -= (int)st.pop();
		}
		
		return res;
	}
	
	public static int calculater(String str) {
		int operand = 0;
		int n =0;
		Stack<Object> stack = new Stack<Object>();
		
		for(int i = str.length() -1; i >=0; i--) {
			
			 char ch = str.charAt(i);
			 
			 if(Character.isDigit(ch)) {
				 
				 operand = (int)Math.pow(10, n) * (int)(ch - '0') + operand;
				  n += 1;
				 
			 }else if(ch != ' ') {
				 
				 if(n != 0) {
					 stack.push(operand);
					 n =0;
					 operand =0;
				 }
				 
				 if(ch == '(') {
					 
					 int res = evaluate(stack);
					 stack.pop();
					 
					 stack.push(res);
					 
				 }else {
					 stack.push(ch);
				 }
			 }
		}
		
		if(n != 0) {
			stack.push(operand);
		}
		
		return evaluate(stack);
	}

	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 String st = sc.next();
		 
		 System.out.println(calculater(st));
		 
	}
}
