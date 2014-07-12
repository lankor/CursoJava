package com.bstmexico.cursojava.exception.service;

public class RangoFechasException extends ServiceException {
	public RangoFechasException() {
		super("Excepcion personalizada.");
	}
	
	public RangoFechasException(String mensaje) {
		super(mensaje);
	}
	
	public RangoFechasException(String mensaje, Throwable ex) {
		super(mensaje, ex);
	}
}
