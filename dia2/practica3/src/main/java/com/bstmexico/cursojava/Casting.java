package com.bstmexico.cursojava;

import com.bstmexico.cursojava.figuras.Cuadrado;
import com.bstmexico.cursojava.figuras.Figura2D;

public class Casting {
	
	public static void main(String arg[]) {
		byte suma;
		byte valor1 = 12;
		byte valor2 = 23;
		
		suma = (byte) (valor1 + valor2);
		
		System.out.println("suma : " + suma);
		
		int sumaLongs;
		long longA = 193423;
		
		sumaLongs = (int) (longA + 1);
		System.out.println("suma : " + sumaLongs);
		
		int aleatorio = (int) (Math.random() * 100);
		System.out.println("aleatorio : " + aleatorio);
		
		double doubleA = 2342.3534;
		float floatA = 752;
		
		float sumaPuntoFlotante = (float) doubleA + floatA;
		System.out.println("suma : " + sumaPuntoFlotante);
		
		long sumaLongs2 = sumar(32L, 24323L);
		System.out.println("suma : " + sumaLongs2);
		
		Figura2D figura = new Cuadrado(21.0);
		Cuadrado cuadrado = (Cuadrado) figura;
		
		System.out.println(cuadrado);
	}
	
	private static long sumar(Long longA, Long longB) {
		return longA + longB;
	}
}