package com.bstmexico.cursojava;

public class TiposPrimitivos8 {
	
	/**
	 * @param arg
	 */
	public static void main(String arg[]) {
		boolean booleanA = true;
		boolean booleanB = Boolean.FALSE;
		boolean booleanC = new Boolean(true);
		boolean booleanD = new Boolean("TruE");
		boolean booleanE = new Boolean("algo");
		boolean booleanF = new Boolean("1");
		
		System.out.println("booleanA : " + booleanA);
		System.out.println("booleanB : " + booleanB);
		System.out.println("booleanC : " + booleanC);
		System.out.println("booleanD : " + booleanD);
		System.out.println("booleanE : " + booleanE);
		System.out.println("booleanF : " + booleanF);
		
		char charA = 'a';
		char charB = '\u1302';
		Character charC = new Character('&');
		char charD = 1302;
		char charE = 0x1302;
		char charF = 0127;
		char charG = 0127;
		int charSize = Character.SIZE;
		
		System.out.println("charA : " + charA);
		System.out.println("charB : " + charB);
		System.out.println("charC : " + charC);
		System.out.println("isUpperCase : " + Character.isUpperCase(charG));
		System.out.println("charD : " + charD);
		System.out.println("charE : " + charE);
		System.out.println("charF : " + charF);
		System.out.println("charSize : " + charSize);
	}
}