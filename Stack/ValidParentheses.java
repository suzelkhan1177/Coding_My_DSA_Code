import java.util.*;
public class Solution {


     public static boolean match(char a, char b) {
      
          if(a == '{' &&  b == '}'){

              return true;

          } else   if(a == '(' &&  b == ')'){

              return true;

          }else   if(a == '[' &&  b == ']'){

              return true;
          }

          return false;
     }

    public static boolean isValidParenthesis(String str) {
        // Write your code here.

         Stack<Character> st = new Stack<Character>();
         
         for(int i=0; i<str.length(); i++ ){

               char ch = str.charAt(i);

               if(ch == '[' || ch =='{' || ch == '('){
                   
                   st.push(ch);

               }else{

                  if(!st.isEmpty()){
                   char top = st.peek();

                  if(match(top, ch) ){
                      st.pop();


                  }else{
                     
                      return false;
                  }

              }else{
                  return false;
              }
                     
      }
  }
    
    return st.isEmpty();

        
    }
}
