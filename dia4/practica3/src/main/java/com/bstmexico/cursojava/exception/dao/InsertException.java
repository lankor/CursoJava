package com.bstmexico.cursojava.exception.dao;

public class InsertException extends DataAccessException {
	public InsertException() {
		super("Excepcion personalizada.");
	}
	
	public InsertException(String mensaje) {
		super(mensaje);
	}
	
	public InsertException(String mensaje, Throwable ex) {
		super(mensaje, ex);
	}
}
