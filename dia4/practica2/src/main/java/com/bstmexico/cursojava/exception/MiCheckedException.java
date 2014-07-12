package com.bstmexico.cursojava.exception;

public class MiCheckedException extends Exception {
	public MiCheckedException() {
		super("Excepcion personalizada.");
	}
	
	public MiCheckedException(String mensaje) {
		super(mensaje);
	}
	
	public MiCheckedException(String mensaje, Throwable ex) {
		super(mensaje, ex);
	}
}
