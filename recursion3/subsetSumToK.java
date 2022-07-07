package recursion3;

public class subsetSumToK {
   
//	Sample Input:
//		9 
//		5 12 3 17 1 18 15 3 17 
//		6
//		Sample Output:
//		3 3
//		5 1
	public static void printSubsetsSumTok(int input[], int k) {
		int output[] = new int[0];
		
//		sumSet(input , 0, k, output);
		printSet(input,0,"",0,k);
	}
	
	//Approch 1
	public static void printSet(int arr[], int idx , String set, int startIndex ,int k) {
		
		if(idx == arr.length) {
			if(startIndex == k) {
				System.out.println(set + " ");
			}
			return;
		}
		
		printSet(arr, idx+1, set + arr[idx] + " ", startIndex+arr[idx], k);
		printSet(arr, idx +1, set, startIndex, k);
	}
	
	
	//Approch 2
	public static void sumSet(int input[], int idx , int k, int output[]) {
		
		if(idx == input.length) {
			if(k==0) {
				
				for(int i=0; i<output.length; i++) {
					System.out.print(output[i]+ " ");
				}
				System.out.println();
				return;
				
			}else {
				return;
			}
		}
		
		sumSet(input, idx +1 , k, output );
		int newOutput[] = new  int[output.length +1];
		
		int i=0;
		while(i < output.length) {
			
			newOutput[i] = output[i];
			i++;
		}
		
		newOutput[i] = input[idx];
		
		sumSet(input, idx +1, k-input[idx], newOutput );
	}
	
	
	 public static void main(String[] args) {
		
		int arr[] = {5, 12, 3 ,17, 1, 18, 15, 3, 17 };
		
		printSubsetsSumTok(arr, 6);
	}
}
