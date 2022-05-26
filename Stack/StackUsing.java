package stack;

public class StackUsing {

	public static void main(String[] args) throws StackEmptyException {
		
//		StackImpArray stack = new StackImpArray();
		StackImpLinkedList<Integer> stack = new StackImpLinkedList<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack.pop());
//	System.out.println(	stack.top());
//	  System.out.println( stack.pop());
//	  System.out.println(	stack.top());
//	System.out.println(	stack.size());
//	System.out.println( stack.isEmpty());
//	 System.out.println(	stack.top());
//	 System.out.println(	stack.size());

	}

}
