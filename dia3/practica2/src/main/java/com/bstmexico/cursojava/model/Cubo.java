package com.bstmexico.cursojava.model;

public class Cubo extends Figura3D {
	private Cuadrado cuadrado;
	
	public Cubo(Double d) {
		this.cuadrado = new Cuadrado(d);
	}

	@Override
	public Double getVolumen() {
		return cuadrado.getArea() * cuadrado.getLado();
	}
	
	public String getColor() {
		return cuadrado.color;
	}
}
