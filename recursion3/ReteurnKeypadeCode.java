package recursion3;

import java.util.*;
public class ReteurnKeypadeCode {

	public static String[] keyValue = {"", "" , "abc","def","ghi",
			                          "jkl","mno", "pqrs","tuv",
			                                               "wxyz"};
	
	public static void printComb(String str, int idx, String combination ) {
		
		if(str.length() == idx) {
			System.out.println(combination);
			return;
		}
		
		char currChar = str.charAt(idx);
		String mapping =  keyValue[currChar - '0'];
	
		 for(int i=0; i<mapping.length(); i++) {
			 
			 printComb(str, idx+1, combination + mapping.charAt(i));
		 }
		
	}
	
	 public static List<String> findPossibleWords(String digit) {
	       
		    List<String> ans =  new ArrayList<>();
		    if(digit.length() == 0)
		    	return ans;
		    
		 HashMap<Character, String> hm = new LinkedHashMap<>();
		 
		    hm.put('2', "abc");  hm.put('3', "def"); hm.put('4', "ghi");
		    hm.put('5', "jkl");  hm.put('6', "mno"); hm.put('7', "pqrs");
		    hm.put('8', "tuv"); hm.put('9', "wxyz");
		    
		    backTrack(digit, 0, hm ,  new StringBuilder(), ans);
		    return ans;
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
		
         System.out.println(findPossibleWords("23"));
	}

}
