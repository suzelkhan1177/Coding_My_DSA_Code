class Remove_All_Occurrences_of_a_Substring{

//Qus Link - https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/

//  Input: s = "daabcbaabcbc", part = "abc"
// Output: "dab"
// Explanation: The following operations are done:
// - s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
// - s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
// - s = "dababc", remove "abc" starting at index 3, so s = "dab".
// Now s has no occurrences of "abc".
 
    public String removeOccurrences(String s, String p) {
        
          int idx = s.indexOf(p);

         while( idx != -1){
             s = s.substring(0, idx).concat(s.substring(idx + p.length()));
             idx = s.indexOf(p);
         }

          return s;
    }
}