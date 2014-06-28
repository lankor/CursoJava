package com.bstmexico.cursojava;

import com.bstmexico.cursojava.figuras.Cuadrado;
import com.bstmexico.cursojava.figuras.Figura2D;

public class Promocion {
	
	public static void main(String arg[]) {
		byte byteA = 23;
		int intA = byteA;
		
		System.out.println("byteA : " + byteA);
		System.out.println("intA : " + intA);
		
		Cuadrado cuadrado = new Cuadrado(32d);
		Figura2D figura = cuadrado;
		System.out.println(figura);
	}
}