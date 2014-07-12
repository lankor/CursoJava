package com.bstmexico.cursojava.exception.dao;

public class SelectException extends DataAccessException {
	public SelectException() {
		super("Excepcion personalizada.");
	}
	
	public SelectException(String mensaje) {
		super(mensaje);
	}
	
	public SelectException(String mensaje, Throwable ex) {
		super(mensaje, ex);
	}
}
