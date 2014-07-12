package com.bstmexico.cursojava.exception.service;

import com.bstmexico.cursojava.exception.ApplicationException;

public abstract class ServiceException extends ApplicationException {
	public ServiceException() {
		super("Excepcion personalizada.");
	}
	
	public ServiceException(String mensaje) {
		super(mensaje);
	}
	
	public ServiceException(String mensaje, Throwable ex) {
		super(mensaje, ex);
	}
}
