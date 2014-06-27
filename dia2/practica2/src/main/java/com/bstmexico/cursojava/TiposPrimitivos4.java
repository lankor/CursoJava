package com.bstmexico.cursojava;

public class TiposPrimitivos4 {
	
	/**
	 * @param arg
	 */
	public static void main(String arg[]) {
		long longA = 0;
		long longB = 87237;
		long longC = -986467;
		long longD = 9223372036854775807L;
		long longE = -9223372036854775808L;
//		Quitar el comentario de la siguiente linea
//		long longF = 2938496512;
		
		System.out.println("longA : " + longA);
		System.out.println("longB : " + longB);
		System.out.println("longC : " + longC);
		
		System.out.println("longD : " + ++longD);
		System.out.println("longE : " + --longE);
		
		longA = longD + longB;
		System.out.println("longA : " + longA);
	}
}