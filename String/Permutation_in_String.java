class Permutation_in_String
{

// Ques Link = https://leetcode.com/problems/permutation-in-string/description/

 // Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
//  Explanation: s2 contains one permutation of s1 ("ba").

//Approach -1 

    public boolean checkInclusion(String s1, String s2) {
        
        int n1 = s1.length();
         int n2 = s2.length();


        if(n2 < n1){
            return false;
        }

        int a[] = new int[26];
        int b[] = new int[26];
   
        for(int i=0; i<n1; i++){
            a[s1.charAt(i) - 'a']++;
            b[s2.charAt(i) - 'a']++;
        }

        for(int i=0; i<n2 - n1; i++){
              if(match(a, b)){
                  return true;
              }

                b[s2.charAt(i + n1) - 'a']++;
                b[s2.charAt(i) - 'a']--;
        }
    
      return match(a, b);
    }

    public boolean match(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


// Approach -2 
    public boolean checkInclusion(String s1, String s2) {
        
        int n1 = s1.length();
         int n2 = s2.length();
        if(n2 < n1){
            return false;
        }

        for(int i=0; i<= n2 - n1; i++){
               s1 = sort(s1);
            if(s1.equals(sort(s2.substring(i, i + n1)))){
                   return true;
            }
         }

        return false;
    }


    public String sort(String str){
        char temp[]=  str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}