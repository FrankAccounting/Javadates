package chapter4;

import java.util.Scanner;

public class number {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Fav num?");
		int  ival = keyboard.nextInt();
		
		 byte bVal = 0;
		 short sVal =  32767;
		 int iVal = 2345;
		 
		 
		 if ((iVal <= Byte.MAX_VALUE) && (iVal >= Byte.MIN_VALUE)) {
		     bVal = (byte)ival;
				System.out.println("byte");

		 }
		 else if ((iVal <= Short.MAX_VALUE) && (iVal >= Short.MIN_VALUE)) {
		     sVal = (short)ival;
				System.out.println("short");

		 }
			 
		 else {
		     bVal = 0;
			 System.out.println(bVal);
    
		 }



}
}
