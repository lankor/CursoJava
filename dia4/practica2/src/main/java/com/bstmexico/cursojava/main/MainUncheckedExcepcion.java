package com.bstmexico.cursojava.main;

import com.bstmexico.cursojava.exception.MiUncheckedException;
import com.bstmexico.cursojava.service.LectorArchivoUnchecked;

public class MainUncheckedExcepcion {
	public static void main(String args[]) {
		LectorArchivoUnchecked lector = new LectorArchivoUnchecked();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Ejecucion " + i);
			try {
				if (i % 2 == 0) {
					lector.tratandoExcepcion("D:\\BSTMexico\\Cursos\\Java\\CursoJava\\dia2\\ConvencionesCodigoJava.pdf");
				} else {
					lector.tratandoExcepcion("D:\\BSTMexico\\Cursos\\Java\\CursoJava\\dia2\\NoExiste.pdf");
				}
			} catch (MiUncheckedException ex) {
				System.out.println("Ocurrio un error que ya se proceso en otro lado");
			}
		}
	}
}
