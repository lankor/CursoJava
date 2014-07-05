package com.bstmexico.cursojava;


public class PasoPorValor {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30; // declaro y asigno valores
		System.out.println("Valores antes de cambiar");
		System.out.format("a=%d, b=%d, c=%d\n", a, b, c); 
		
		cambiarValores(a, b, c); // cambia de valores

		System.out.println("Valores después de cambiar");
		System.out.format("a=%d, b=%d, c=%d\n", a, b, c); 
	}

	private static void cambiarValores(int a, int b, int c) {
		a = 100;
		b = 200;
		c = 300;
		System.out.println("Valores cambiados en el método");
		System.out.format("a=%d, b=%d, c=%d\n", a, b, c); 
	}
}