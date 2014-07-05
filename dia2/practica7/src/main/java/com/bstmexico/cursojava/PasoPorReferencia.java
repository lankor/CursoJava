package com.bstmexico.cursojava;

import com.bstmexico.cursojava.model.Cuadrado;


public class PasoPorReferencia {

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setNombre("Cuadrado Original");
		
		System.out.println(cuadrado.toString());
		
		System.out.println("Cambiando los valores");
		cambiarValores(cuadrado);
		
		System.out.println(cuadrado.toString());
	}

	private static void cambiarValores(Cuadrado cuadrado) {
		cuadrado.setNombre("Cuadrado Modificado");
	}
}