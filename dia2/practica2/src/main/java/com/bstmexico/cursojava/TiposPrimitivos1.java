package com.bstmexico.cursojava;

public class TiposPrimitivos1 {
	
	public static void main(String arg[]) {
		short shortA = 32;
		short shortB = 0;
		short shortC = -762;
		short shortD = 32767;
		short shortE = -32768;
		
		shortD++;
		shortE--;
		
		System.out.println("shortA : " + shortA);
		System.out.println("shortB : " + shortB);
		System.out.println("shortC : " + shortC);
		System.out.println("shortD : " + shortD);
		System.out.println("shortE : " + shortE);
		
//		Quitar el comentario de la siguiente linea.
//		shortA = shortA + shortC; //La suma de 2 shorts no necesariamente es un byte y Java lo sabe.
	}
}