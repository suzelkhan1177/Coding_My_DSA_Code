package Bit_Manipulation;

public class Set_Bits {

	public static void main(String[] args) {
		
		int n = 5;
		int pos = 1;
		
		int bitMask =  1<<pos;
		
		int newNumber = n | bitMask;
		
		System.out.println(newNumber);
	}

}
