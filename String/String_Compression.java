class Solution {

// Qus link - https://leetcode.com/problems/string-compression/description/

// Input: chars = ["a","a","b","b","c","c","c"]
// Output: Return 6, and the first 6 characters of the input
//  array should be: ["a","2","b","2","c","3"]
// Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".



    public int compress(char[] arr) {
        int i =0;
        int arrIndex =0;
        int n = arr.length;

        while(i < n){

            int j = i+1;
            //search in main Array element  count
            while(j < n && arr[i] == arr[j]){
                j++;
            }

            // store character in main array after count
            arr[arrIndex++] = arr[i];

            int count = j -i;

        //   count int to char and store main Array
            if(count > 1){
                String ct = String.valueOf(count);
                    for (char c : ct.toCharArray()) {
                          arr[arrIndex++]  = c;
                    }
            }

            i=j;

        }

    return arrIndex;

    }
}