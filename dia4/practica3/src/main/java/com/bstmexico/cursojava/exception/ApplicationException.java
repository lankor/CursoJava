package com.bstmexico.cursojava.exception;

public abstract class ApplicationException extends RuntimeException {
	public ApplicationException() {
		super("Excepcion personalizada.");
	}
	
	public ApplicationException(String mensaje) {
		super(mensaje);
	}
	
	public ApplicationException(String mensaje, Throwable ex) {
		super(mensaje, ex);
	}
}
