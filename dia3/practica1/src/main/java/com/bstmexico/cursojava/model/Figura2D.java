package com.bstmexico.cursojava.model;

public abstract class Figura2D extends Figura {

	private String colorBorde;

	public abstract Double getPerimetro();

	public abstract Double getArea();

	public Figura2D() {}

	public Figura2D(String nombre) {
		super(nombre);
	}

	public String getColorBorde() {
		return colorBorde;
	}

	public void setColorBorde(String colorBorde) {
		this.colorBorde = colorBorde;
	}
	
	@Override
	public String testSuper() {
		return "Estoy en Figura2D";
	}
}
