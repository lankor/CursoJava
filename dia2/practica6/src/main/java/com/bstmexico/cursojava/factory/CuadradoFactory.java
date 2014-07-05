package com.bstmexico.cursojava.factory;

import com.bstmexico.cursojava.model.Cuadrado;

public final class CuadradoFactory {
	public static final Cuadrado newInstance() {
//		System.out.println(getNombreFactory());
		
		return new Cuadrado();
	}
	
	public String getNombreFactory() {
		return "Fabrica de Cuadrados";
	}
}
