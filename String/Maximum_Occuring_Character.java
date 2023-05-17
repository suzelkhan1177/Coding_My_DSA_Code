class Maximum_Occuring_Character
{
   
// Qus Link - https://practice.geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1
    
// Input: str = testsample
// Output: e
// Explanation: e is the character which
// is having the highest frequency.
    
    
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String str)
    {
       int arr[] = new int[26];
       
       //store character
       for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);
           
           int number = 0;
           number = ch - 'a';
           
           arr[number]++;
       }
       
       //find max element ouccur
       int max = -1;
       char ans = ' ';
       
       for(int i =0; i<26; i++){
           if(max < arr[i]){
               ans = (char)(i+'a');
               max = arr[i];
           }
       }
       
       return ans;
    }
    
}