  //Function to find the next greater element for each element of the array.
// For Input: 
//  4
// 1 3 2 4
// Your Output: 
//  3 4 4 -1
    
    
    
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long temp[] = new long[n];
        Stack<Long> st = new Stack<>();
        
        for(int i=n-1; i>=0; i--){
            
            if(st.isEmpty()){
                temp[i] =  -1;
                
            } else if(!st.isEmpty() && arr[i] < st.peek()){
                temp[i] = st.peek();
                
            } else if (!st.isEmpty() && st.peek() <= arr[i]){
                
                while(!st.isEmpty()   && st.peek() <= arr[i]){
                    st.pop();
                }
                
                if(st.size() == 0 ){
                      temp[i] =  -1;
                }else{
                      temp[i] =  st.peek();
                }
            }
        
            
            st.push(arr[i]);
        }
        
        
        
        return temp;
    } 
