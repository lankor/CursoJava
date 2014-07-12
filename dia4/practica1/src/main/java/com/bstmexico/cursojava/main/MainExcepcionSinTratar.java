package com.bstmexico.cursojava.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.bstmexico.cursojava.service.LectorArchivo;

public class MainExcepcionSinTratar {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		LectorArchivo lector = new LectorArchivo();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Ejecucion " + i);
			lector.sinTratarExcepcion();
		}
	}
}
