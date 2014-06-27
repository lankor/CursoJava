package com.bstmexico.cursojava;

public class TiposPrimitivos2 {
	
	public static void main(String arg[]) {
		byte byteA = 0;
		byte byteB = -32;
		byte byteC = 127;
		
		Byte byteD = 1;
//		Quitar el comentario de la siguiente linea.
//		Byte byteE1 = new Byte(23);
		Byte byteE = new Byte((byte) 23);
		Byte byteF = new Byte("32");
		Byte byteG = new Byte("-128");
		
		System.out.println("byteA : " + byteA);
		System.out.println("byteB : " + byteB);
		System.out.println("byteC : " + byteC);
		System.out.println("byteD : " + byteD);
		System.out.println("byteE : " + byteE);
		System.out.println("byteF : " + byteF);
		
		byteC++;
		System.out.println("byteC + 1: " + byteC);
		
		byteC--;
		System.out.println("byteC + 1: " + byteC);
		
		if (byteC == Byte.MAX_VALUE) {
			System.out.println("byteC contiene el valor maximo.");
		}
		
		if (byteG == Byte.MIN_VALUE) {
			System.out.println("byteG contiene el valor minimo.");
		}
		
//		Quitar el comentario de la siguiente linea.
//		byteA = byteA + byteC; //La suma de 2 bytes no necesariamente es un byte y Java lo sabe.
	}
}