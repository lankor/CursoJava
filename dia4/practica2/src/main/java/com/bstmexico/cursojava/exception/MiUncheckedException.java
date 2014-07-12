package com.bstmexico.cursojava.exception;

public class MiUncheckedException extends RuntimeException {
	public MiUncheckedException() {
		super("Excepcion personalizada.");
	}
	
	public MiUncheckedException(String mensaje) {
		super(mensaje);
	}
	
	public MiUncheckedException(String mensaje, Throwable ex) {
		super(mensaje, ex);
	}
}
