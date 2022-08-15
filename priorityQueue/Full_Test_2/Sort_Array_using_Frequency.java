package Full_Test_2;

import java.util.*;
//
//Example:
//Input:
//6
//1 2 2 2 3 3
//Output:
//2 2 2 3 3 1

class SortComaparator implements Comparator<Integer>{

	final Map<Integer, Integer> freqMap;
	
	public SortComaparator(Map<Integer, Integer> freqMap) {
		this.freqMap = freqMap;
	}
	
	@Override
	public int compare(Integer k1, Integer k2) {
		
		int freq = freqMap.get(k2).compareTo(freqMap.get(k1));
		
		int value = k1.compareTo(k2);
		
		if(freq == 0) {
			return value;
		}else {
			return freq;
		}
	}
	
}
public class Sort_Array_using_Frequency {

	public static void main(String[] args) 
	{ 
		
          Scanner sc = new Scanner(System.in);
          int s = sc .nextInt();
        
         int arr[] = new int[s];
         int n = arr.length;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int curr : arr) {
        	int count = map.getOrDefault(curr, 0);
        	
        	map.put(curr, count +1);
        	ans.add(curr);
        }
        
        //compare map by value
        SortComaparator comp = new SortComaparator(map);
        
        Collections.sort(ans, comp);
        
        for(Integer i: ans) {
        	System.out.print(i + " ");
        }
        
	}
        
}
