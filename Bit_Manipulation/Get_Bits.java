package Bit_Manipulation;

public class Get_Bits {

	public static void main(String[] args) {
		int n = 5;
		int pos = 2;
		
		int bitMask =  1<<pos;
		
		if((bitMask & n) != 0) {
			System.out.println("Position " + pos+ " is  1");
		}else {
			System.out.println("Position "+ pos + " is  0");
		}

	}

}
