package com.bstmexico.cursojava;

public class TiposPrimitivos6 {
	
	/**
	 * @param arg
	 */
	public static void main(String arg[]) {
		float floatA = 0;
		float floatB = 12;
		float floatC = 12.87578979f; //quitar la f y ver que pasa
		float floatD = 3.4028235E38f;
		float floatE = 1.4E-45f;
		
		System.out.println("floatA : " + floatA);
		System.out.println("floatB : " + floatB);
		System.out.println("floatC : " + floatC);
		System.out.println("floatD : " + floatD);
		System.out.println("floatE : " + floatE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
	}
}