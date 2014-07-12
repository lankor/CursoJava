package com.bstmexico.cursojava.main;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.bstmexico.cursojava.service.LectorArchivo;

public class MainExcepcionTratada {
	public static void main(String args[]) throws FileNotFoundException, IOException {
		LectorArchivo lector = new LectorArchivo();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Ejecucion " + i);
			if (i % 2 == 0) {
				lector.tratandoExcepcion("D:\\BSTMexico\\Cursos\\Java\\CursoJava\\dia2\\ConvencionesCodigoJava.pdf");
			} else {
				lector.tratandoExcepcion("D:\\BSTMexico\\Cursos\\Java\\CursoJava\\dia2\\NoExiste.pdf");
			}
		}
	}
}
