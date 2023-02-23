

//
//Sample Input 1:
//3 5
//1 1 3
//1 2 4
//1 1 5
//2 1
//2 2
//Sample Output 1:
//5
//4




public class TwoStack {
	
	// Initialize TwoStack.

 public  int arr[];
 public  int size;
 public  int top1;
 public  int top2;

	public TwoStack(int s) {
		// Write your code here
		this.size = s;
	  arr  = new int[s];
		top1 = -1;
		top2 = s;

	}

	// Push in stack 1.
	public void push1(int num) {
	      if(top2 - top1 > 1){
           top1++;
		   arr[top1] = num;  
		  }
	}

	// Push in stack 2.
	public void push2(int num) {
		// Write your code here
	      if(top2 - top1 > 1){
           top2--;
		   arr[top2] = num;  
		  }
	}

	// Pop from stack 1 and return popped element.
	public int pop1() {
		
		 if(top1 >= 0){
			 int ans = arr[top1];
			 top1--;
			 return ans;
		 }else {
			 return -1;
		 }

	}

	// Pop from stack 2 and return popped element.
	public int pop2() {
		// Write your code here
			 if(top2 < size){
			 int ans = arr[top2];
			 top2++;
			 return ans;
		 }else {
			return -1;
			
		 }

	}


}
