class Solution
{ 
    
    boolean knows(int arr[][] ,int a, int b){
        
        if(arr[a][b] == 1){
            return true;
        }else{
            return false;
        }
    }
    
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
    	// code here 
    	Stack<Integer> st = new Stack<Integer>();
    	
      //step1: push all element in stack
    	for(int i=0; i<n; i++){
    	    st.push(i);
    	}
    	
        //step2: get 2 elements and copare them
    	while(st.size() > 1){
    	    
    	    int a = st.pop();
    	    int b = st.pop();
    	    
    	    if( knows( arr, a, b)){
    	        st.push(b);
    	    }else{
    	         st.push(a);
    	    }
    	}
    	
    	if(st.isEmpty()){
    	    return -1;
    	}
    	
    	
      //step3: single element in stack is potential celeb
        //so verify it
    	
    	
    	// Check All Zero in
    	int ans = st.pop();
    	
    	int zeroCount =0;
    	
    	for(int i=0; i<n; i++){
    	    
    	    if(arr[ans][i] == 0)
    	       zeroCount++;
    	}
    	
    	if(zeroCount != n){
    	    return -1;
    	}
    	
    	
    	 	
    	// Check 1 in Column
    	
    	int oneCount =0;
    	
    	for(int i=0; i<n; i++){
    	    
    	    if(arr[i][ans] == 1)
    	       oneCount++;
    	}
    	
    	if(oneCount != n-1){
    	    return -1;
    	}
    	
    	
    	return ans;
    	
    }
}
