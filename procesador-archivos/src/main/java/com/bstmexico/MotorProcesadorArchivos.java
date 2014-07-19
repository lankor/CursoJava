package com.bstmexico;

import java.io.File;
import java.util.ArrayList;

import com.bstmexico.logica.ProcesadorArchivo;
import com.bstmexico.logica.ProcesadorArchivoInterface;
import com.bstmexico.modelo.Movimiento;

public class MotorProcesadorArchivos {
	private ProcesadorArchivoInterface procesador;
	
	public MotorProcesadorArchivos() {
		this.procesador = new ProcesadorArchivo();
	}
	
	public void procesar(File archivo) {
		boolean estatus = procesador.procesar(archivo);
	}
	
	public static void main(String[] args) {
		MotorProcesadorArchivos motor = new MotorProcesadorArchivos();
		motor.procesar(new File("D:\\BSTMexico\\Cursos\\Java\\CursoJava\\dia2\\ejercicio-banco\\2014_02_01_movimientos.txt"));
		
	}
}
