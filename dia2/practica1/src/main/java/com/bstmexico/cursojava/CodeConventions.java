/*
 * CodeConventions.java
 * 
 * 1.0  01/05/2014
 * 
 * Copyright (c) BSTMexico
 * 
 * Todos los derechos reservados
 * Mas información sobre la licencia de la clase.
 */
package com.bstmexico.cursojava;

/**
 * Comentarios de documentacion de la clase...
 * 
 * @version		1.0.0
 * @author 		Luis Angel Cardenas lcardenas@bstmexico.com
 *
 */
public class CodeConventions {
	/*
	 * Clase usada para mostrar los aspectos mas importantes de las 
	 * CodeConventions
	 */
	
	/**
	 * Comentarios de documentacion de la constante.
	 */
	public static final int CONSTANTE_UNO = 1;
	
	/**
	 * Comentarios de documentacion de la constante.
	 */
	protected static final int CONSTANTE_DOS = 2;
	
	/**
	 * Comentarios de documentacion de la constante.
	 */
	static final int CONSTANTE_TRES = 3;

	/**
	 * Comentarios de documentacion de la constante.
	 */
	private static final int CONSTANTE_CUATRO = 4;
	
	/**
	 * Comentarios de documentacion de la variable de clase.
	 */
	public static int VARIABLE_CLASE_UNO = 1;
	
	/**
	 * Comentarios de documentacion de la variable de clase.
	 */
	protected static int VARIABLE_CLASE_DOS = 2;
	
	/**
	 * Comentarios de documentacion de la variable de clase.
	 */
	static int VARIABLE_CLASE_TRES = 3;

	/**
	 * Comentarios de documentacion de la variable de clase.
	 */
	private static int VARIABLE_CLASE_CUATRO = 4;
	
	/**
	 * Comentarios de documentacion de la variable de instancia.
	 */
	public int variableUno = 1;
	
	/**
	 * Comentarios de documentacion de la variable de instancia.
	 */
	protected int variableDos = 2;
	
	/**
	 * Comentarios de documentacion de la variable de instancia.
	 */
	int variableTres = 3;

	/**
	 * Comentarios de documentacion de la variable de instancia.
	 */
	private int variableCuatro = 4;
	
	/**
	 * Comentarios de documentacion del constructor
	 */
	public CodeConventions() {}
	
	/**
	 * Comentarios de documentacion del constructor
	 * @param valorVariableCuatro Comentarios de documentacion del parametro del
	 * constructor.
	 */
	public CodeConventions(int valorVariableCuatro) {
		this.variableCuatro = valorVariableCuatro;
	}
	
	/**
	 * 
	 * @param sumandoUno
	 * @param sumandoDos
	 * @return
	 */
	public int sumarValores(int sumandoUno, int sumandoDos) {
		return sumandoUno + sumandoDos;
	}
	
	public static int restar(int valorUno, int valorDos) {
		return valorUno - valorDos;
	}
	
	/**
	 * 
	 * @param valorUno
	 * @param valorDos
	 * @return
	 */
	protected boolean compararEnteros(int valorUno, int valorDos) {
		return valorUno > valorDos;
	}
	/**
	 * Comentarios de documentacion del metodo
	 * @param arg Comentarios de documentacion del parametro.
	 */
	public static void main(String arg[]) {
		int sumaConstantes;		//Declaraciones al principio del bloque.
		int arrayEnteros[] = new int[10];
		
		CodeConventions codeConvInst = new CodeConventions();
		
		sumaConstantes = codeConvInst.sumarValores(codeConvInst.variableCuatro, 
				codeConvInst.variableDos);
		
		System.out.println("La suma de constantes es: " + sumaConstantes);
		
		System.out.println("Este es un ejemplo de como cortar una linea "
				+ "demasiado grande");
		
		imprimirNumeros(12, 1000);
		llenarArray(arrayEnteros);
	}

	private static void llenarArray(int[] arrayEnteros) {
		try {
			for (int i = 0; i < arrayEnteros.length; i++) {
				arrayEnteros[i] = (int) (Math.random() * 100);
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException ex) {
			System.out.println("Error que debe ser tratado.");
		}
	}

	private static void imprimirNumeros(int inferior, int superior) {
		/*
		 * Metodo que imprime los numeros desde el limite superior, hasta el
		 * numero superior
		 */
		if (inferior > superior) {
			System.out.println(String.format("El valor %s es mayor a %s, no es "
					+ "posible ejecutar el metodo con ese orden de parametros", 
					superior));
			
			return;
		} // Fin de condicion de validacion
		
		for (int i = inferior; i < superior; i++) {
			/* Imprime el valor del numero en la pantalla */
			System.out.println("Valor : " + i);
		} // Fin de for
	}
}