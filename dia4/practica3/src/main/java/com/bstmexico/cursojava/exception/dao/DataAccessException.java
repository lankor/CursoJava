package com.bstmexico.cursojava.exception.dao;

import com.bstmexico.cursojava.exception.ApplicationException;

public abstract class DataAccessException extends ApplicationException {
	public DataAccessException() {
		super("Excepcion personalizada.");
	}
	
	public DataAccessException(String mensaje) {
		super(mensaje);
	}
	
	public DataAccessException(String mensaje, Throwable ex) {
		super(mensaje, ex);
	}
}
