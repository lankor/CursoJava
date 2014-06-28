package com.bstmexico.cursojava;

public class Cuadrado {
	private static int objetosCreados = 0;
	
	private int id;
	private double lado;
	
	public Cuadrado() {
		++objetosCreados;
	}
	
	public Cuadrado(int id, double lado) {
		this();
		this.id = id;
		this.lado = lado;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getLado() {
		return lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public int getObjetosCreados() {
		return objetosCreados;
	}
	
	public void incrementar(int incremento) {
		objetosCreados += incremento;
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("id : ");
		strBuilder.append(id);
		strBuilder.append(", lado : ");
		strBuilder.append(lado);
		
		return strBuilder.toString();
	}
}
