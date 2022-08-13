package Full_Test_1;

import java.util.*;
public class Backspace_Problem {
//	Input: xy#z
//	Output: xz
  public static String backspace(String str){
          
          Stack<Character> st = new Stack<Character>();
           for(int i=0; i<str.length(); i++){
                 
                 if(str.charAt(i)  != '#'){
                     st.push(str.charAt(i));
                     
                 }else if(!st.isEmpty()){
                     st.pop();
                 }
             }
          
        String temp = "";
          
          while(!st.isEmpty()){
              temp  +=  st.pop();

          }
          
           String ans = "";
          for(int i= temp.length()-1; i>=0; i--){
              
              ans += temp.charAt(i);
          }
   
          return  ans;
        }
}
