

// Sample Input 2:
// 3
// {}}{}}
// {{{{
// {{{}}
// Sample Output 2:
// 1
// 2
-1


public static int findMinimumCost(String str) {
		  
      int n = str.length();
        if(n % 2 == 1){
          return -1;
        }

         Stack<Character> st = new Stack<Character>();


//  remove valid bracket
          for(int i=0; i<n; i++){

              char ch = str.charAt(i);

              if(ch == '{'){

                st.push(ch);

              }else{
                 
                if(!st.isEmpty() && st.peek() == '{'){

                      st.pop();
                  }else{
                    st.push(ch);
                  }
              }
          }

//  stack  contains invalid expression
          int a =0, b = 0;
          while(!st.isEmpty()){

               if(st.peek() == '{'){
                 a++;

               }else {

                 b++;
               }
             st.pop();
          }

          int ans = (a +1)/ 2 + (b+1)/2;

          return ans;

    }
