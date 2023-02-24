public static boolean findRedundantBrackets(String str) 
    {
       
          Stack<Character> st = new Stack<Character>();

         
         for(int i=0; i<str.length(); i++){

             char ch = str.charAt(i);

            if(ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/' ){
               
                st.push(ch);

             } else{
  
               if(ch == ')'){

                   boolean isRedent = true;

                    while(st.peek() != '('){

                        char top = st.peek();
                        if(top == '+' || top == '-' || top == '*' || top == '/' ){

                            isRedent = false;
                        }
                        //remove all operater  
                        st.pop();
                    }
              
              //  remove closeing baracket
                    st.pop();

                  if(isRedent)
                   return true;

               }
             
           }
                    
      }

      return false;
    }
