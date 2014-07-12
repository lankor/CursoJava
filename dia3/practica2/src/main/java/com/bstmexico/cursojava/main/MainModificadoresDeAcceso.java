package com.bstmexico.cursojava.main;

import com.bstmexico.cursojava.model.Cuadrado;
import com.bstmexico.cursojava.model.Cubo;

public class MainModificadoresDeAcceso {
	public static void main(String args[]) {
		Cuadrado cuadrado = new Cuadrado(2.8);
		
		cuadrado.modificadoresDeAcceso();
		
		/*
		 * Quitar el comentario a la siguiente linea y ver que ocurre 
		 */
		//cuadrado.color;
		
		Cubo cubo = new Cubo(2.9);
		System.out.println(cubo.getColor());
	}
}