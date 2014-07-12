package com.bstmexico.cursojava.polimorfismo;

import com.bstmexico.cursojava.model.Cuadrado;

public class MainPolimorfismoSobrecarga {
	
	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado(5D);
		cuadrado.setNombre("Cuadrado uno");
		cuadrado.setColorBorde("Azul");

		System.out.println(cuadrado.testPolimorfismo());

		Cuadrado otroCuadrado = new Cuadrado(5D);
		otroCuadrado.setNombre("Cuadrado dos");
		otroCuadrado.setColorBorde("Amarillo");

		System.out.println("\n");
		System.out.println(otroCuadrado
				.testPolimorfismo("Otra operacion, mismo nombre"));
	}

}
