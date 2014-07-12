package com.bstmexico.cursojava.main;

import com.bstmexico.cursojava.exception.MiCheckedException;
import com.bstmexico.cursojava.service.LectorArchivo;

public class MainCheckedException {
	public static void main(String args[])  {
		LectorArchivo lector = new LectorArchivo();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Ejecucion " + i);
			try {
				lector.tratandoExcepcion("D:\\noexiste.pdf");
			} catch (MiCheckedException ex) {
				ex.printStackTrace(System.err);
			}
		}
	}
}
