package Bit_Manipulation;

public class FindNumOdBitAtob {
	
	
	public static int counter(int n) {
		
		int count =0;
		
		while(n > 0) {
			count += n & 1;
			n >>= 1;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 13;
		
		System.out.println(counter(n));

	}

}
