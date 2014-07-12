package com.bstmexico.cursojava.factory;

import com.bstmexico.cursojava.model.Cuadrado;

public final class CuadradoFactory {
	public static final Cuadrado newInstance() {
		return new Cuadrado();
	}
}
