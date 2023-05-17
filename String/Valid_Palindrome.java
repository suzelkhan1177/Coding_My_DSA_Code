class Valid_Palindrome
{

// Qus Link - https://leetcode.com/problems/valid-palindrome/

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

    public boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "");
	   str = str.toLowerCase();
	   String s1 = str;
	   String s2 = "";

    for(int i= str.length()-1; i>=0; i--){
			s2 += str.charAt(i);
		}

	   return s1.equals(s2);
    }
}