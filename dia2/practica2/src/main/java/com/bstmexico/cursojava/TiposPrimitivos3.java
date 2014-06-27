package com.bstmexico.cursojava;

public class TiposPrimitivos3 {
	
	/**
	 * @param arg
	 */
	public static void main(String arg[]) {
		int intA = 0;
		int intB = -23;
		int intC = 14232;
		int intD = 2147483647;
		int intE = -2147483648;
		
		
		System.out.println("intA : " + intA);
		System.out.println("intB : " + intB);
		System.out.println("intC : " + intC);
		
		System.out.println("intD : " + ++intD);
		System.out.println("intE : " + --intE);
		
		intA = intD + intC;
		System.out.println("intD : " + intA);
	}
}