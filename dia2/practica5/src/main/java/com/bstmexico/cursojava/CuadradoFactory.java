package com.bstmexico.cursojava;

public class CuadradoFactory {
	public static Cuadrado newIntance(int id) {
		Cuadrado instance = new Cuadrado(id, 0.0);
		
		return instance;
	}
}
