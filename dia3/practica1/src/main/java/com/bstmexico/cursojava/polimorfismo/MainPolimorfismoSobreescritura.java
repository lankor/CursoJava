package com.bstmexico.cursojava.polimorfismo;

import com.bstmexico.cursojava.model.Circulo;
import com.bstmexico.cursojava.model.Cuadrado;
import com.bstmexico.cursojava.model.Figura2D;

public class MainPolimorfismoSobreescritura {
	public static void main(String[] args) {
		Figura2D circulo = new Circulo(2.23);
		
		circulo.setNombre("Circulo uno");
		circulo.setColorBorde("Rojo");
		
		Figura2D cuadrado = new Cuadrado(5D);
		cuadrado.setNombre("Cuadrado uno");
		cuadrado.setColorBorde("Azul");
		
		/*
		 * Es el mismo metodo (getArea()), pero el comportamiento depende del
		 * tipo de objeto que lo este invocando.
		 */
		System.out.println("Area de " + circulo.getNombre() + ": "
				+ circulo.getArea());
		System.out.println("Area de " + cuadrado.getNombre() + ": "
				+ cuadrado.getArea());
		
		
	}
}
