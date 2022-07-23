package HashMap;

import java.util.*;
public class ExtractUniqueCharater {
//	Sample Input 1 :
//		ababacd
//		Sample Output 1 :
//		abcd
//		Sample Input 2 :
//		abcde
//		Sample Output 2 :
//		abcde
	
	public static String uniqueChar1(String str){
        
	     String ans= "";
			 HashMap<Character, Boolean> map = new HashMap<>();
			    for(int i=0; i<str.length(); i++) {
		    	   if(!map.containsKey(str.charAt(i))) {
		    	        ans += str.charAt(i);
		    	    	 map.put(str.charAt(i),true);
	               }    
		       }
	        return ans;
		}
public static String uniqueChar(String str){
        
		ArrayList<Character> list = new ArrayList<>();
		 HashMap<Character, Boolean> map = new HashMap<>();
		    
	       for(int i=0; i<str.length(); i++) {
	    	   if(map.containsKey(str.charAt(i))) {
	    	    	 continue;
	    	     }else {
	    	    	 list.add(str.charAt(i));
	    	    	 map.put(str.charAt(i),true);
               }    
	       }
        
         String ans = "";
         for(int i=0; i<list.size(); i++){
               ans += list.get(i);
         }
        
        return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
