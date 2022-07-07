package recursion3;

import java.util.*;


public class KeypadCodingNinja {

	
	 public static void findPossibleWords(int n) {
	       
		String digit = String.valueOf(n);
		 
		    List<String> ans =  new ArrayList<>();
		    if(digit.length() == 0) {
		    	return;
		    }
		    
		 HashMap<Character, String> hm = new LinkedHashMap<>();
		 
		    hm.put('2', "abc");  hm.put('3', "def"); hm.put('4', "ghi");
		    hm.put('5', "jkl");  hm.put('6', "mno"); hm.put('7', "pqrs");
		    hm.put('8', "tuv"); hm.put('9', "wxyz");
		    
		    backTrack(digit, 0, hm ,  new StringBuilder(), ans);
		    
		    for(String i : ans) {
           System.out.println(i);
		    }
	   }
	
public static void backTrack(String digit, int idx , HashMap<Character, String> hm,
		    StringBuilder sb, List<String> ans) {
	
	  if(idx == digit.length()) {
		  ans.add(sb.toString());
		  return;
	  }
	  
	  String curr = hm.get(digit.charAt(idx));
	  for(int i=0; i<curr.length(); i++) {
		  
		  sb.append(curr.charAt(i));
		  backTrack(digit, idx+1, hm, sb ,ans);
		  sb.deleteCharAt(sb.length() -1);
	  }
	  
	
}
public static void main(String[] args) {
		
         findPossibleWords(23);
        		 
	}

}
