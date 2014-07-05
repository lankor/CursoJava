package com.bstmexico.cursojava;

import com.bstmexico.cursojava.factory.CuadradoFactory;
import com.bstmexico.cursojava.model.Cuadrado;

public class Metodos {
	
	public static void main(String arg[]) {
		Cuadrado cuadrado = CuadradoFactory.newInstance(); //Revisar este metodo
		
		cuadrado.setLado(10d);
		
		System.out.println("Perimetro : " + cuadrado.getPerimetro());
		System.out.println("Area : " + cuadrado.getArea());
		
		CuadradoFactory factory = new CuadradoFactory();
		Cuadrado cuadrado2 = factory.newInstance(); //Evitar este tipo de invocaciones.
		cuadrado2.setLado(3.0);
		
		System.out.println(factory.getNombreFactory());
		System.out.println("Perimetro : " + cuadrado2.getPerimetro());
		System.out.println("Area : " + cuadrado2.getArea());
		System.out.println("Tipo : " + cuadrado2.getNombreFigura()); //Revisar este metodo
		
	}
}