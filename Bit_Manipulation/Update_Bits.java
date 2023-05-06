package Bit_Manipulation;

import java.util.Scanner;

public class Update_Bits {

	public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
		 
		 int n = 5;// 0101
		 int pos =2 ;
		 System.out.println("Enter Update bit value 0 else 1");
		 //oper  = 1 : set Bits  or  oper = 0 : clear Bits
		  int oper = sc.nextInt();
		 
		 int bitMask = 1<< pos;
		 
		 if(oper == 1) {
			 
			 //set Bit 
			 int newNumber = n | bitMask;
			 System.out.println(newNumber);
			 
		 }else if( oper == 0) {
			 
			 // clear Bit
			 int newBitMask = ~bitMask; 
			 int newNumber = n & newBitMask;
			 
			 System.out.println(newNumber);
			 
		 }else {
			 System.out.println("Invalid Operator only use 0 or 1");
		 }
	}

}
