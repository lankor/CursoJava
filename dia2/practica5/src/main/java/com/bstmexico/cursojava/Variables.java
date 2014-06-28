package com.bstmexico.cursojava;

public class Variables {
	
	public static void main(String arg[]) {
		Cuadrado cuadrado1 = new Cuadrado(2, 2345.65);
		System.out.println("Objetos creados : " + cuadrado1.getObjetosCreados());
		
		Cuadrado cuadrado2 = new Cuadrado(4, 93.65);
		System.out.println("Objetos creados : " + cuadrado2.getObjetosCreados());
		
		Cuadrado cuadrado3 = new Cuadrado(6, 42.4);
		System.out.println("Objetos creados : " + cuadrado3.getObjetosCreados());
		
		Cuadrado cuadrado4 = new Cuadrado(7, 0.5);
		System.out.println("Objetos creados : " + cuadrado4.getObjetosCreados());
		
		Cuadrado cuadrado5 = new Cuadrado(8, 1);
		System.out.println("Objetos creados : " + cuadrado5.getObjetosCreados());
		
		Cuadrado cuadrado6 = new Cuadrado(9, 10.0);
		System.out.println("Objetos creados : " + cuadrado6.getObjetosCreados());
		
		System.out.println(cuadrado1 + " objetos creados : " + cuadrado6.getObjetosCreados());
		cuadrado1.incrementar(3);
		System.out.println(cuadrado2 + " objetos creados : " + cuadrado6.getObjetosCreados());
		cuadrado5.incrementar(-4);
		System.out.println(cuadrado3 + " objetos creados : " + cuadrado6.getObjetosCreados());
		
		Cuadrado cuadrado7 = CuadradoFactory.newIntance(10);
		System.out.println(cuadrado7 + " objetos creados : " + cuadrado7.getObjetosCreados());
		System.out.println(cuadrado3 + " objetos creados : " + cuadrado6.getObjetosCreados());
		
		Cuadrado cuadrado8 = CuadradoFactory.newIntance(55);
		System.out.println(cuadrado8 + " objetos creados : " + cuadrado8.getObjetosCreados());
		System.out.println(cuadrado1 + " objetos creados : " + cuadrado6.getObjetosCreados());
	}
}