package com.bstmexico.cursojava;

public class TiposPrimitivos7 {
	
	/**
	 * @param arg
	 */
	public static void main(String arg[]) {
		double doubleA = 0;
		double doubleB = 12;
		double doubleC = 12.87578979; //quitar la f y ver que pasa
		double doubleD = 3.4028235E38;
		double doubleE = 1.4E-45;
		
		System.out.println("doubleA : " + doubleA);
		System.out.println("doubleB : " + doubleB);
		System.out.println("doubleC : " + doubleC);
		System.out.println("doubleD : " + doubleD);
		System.out.println("doubleE : " + doubleE);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
	}
}