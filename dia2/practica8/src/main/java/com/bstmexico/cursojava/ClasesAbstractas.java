package com.bstmexico.cursojava;

import com.bstmexico.cursojava.model.Cuadrado;
import com.bstmexico.cursojava.model.Figura;
import com.bstmexico.cursojava.model.Figura2D;

public class ClasesAbstractas {
	
	public static void main(String arg[]) {
		Figura figura = new Cuadrado();
		Figura2D figura2d = new Cuadrado();
		Cuadrado cuadrado = new Cuadrado();
		
		System.out.println(figura);
		System.out.println(figura2d);
		System.out.println(cuadrado);
	}
}