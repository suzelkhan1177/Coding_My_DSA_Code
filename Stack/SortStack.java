public static void sort(Stack<Integer> st, int num) {
  
      if(st.isEmpty() || (!st.isEmpty() && st.peek() <= num )){
		  st.push(num);
		  return;
	    }
          
		int top = st.pop();
		sort(st, num);
    st.push(top);

}

	public static void sortStack(Stack<Integer> st) {
      if(st.isEmpty()){
				return;
			}

      int num = st.pop();
			sortStack(st);
      sort(st, num);
	}
