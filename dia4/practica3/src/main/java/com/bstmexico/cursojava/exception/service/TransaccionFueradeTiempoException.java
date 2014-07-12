package com.bstmexico.cursojava.exception.service;

public class TransaccionFueradeTiempoException extends ServiceException {
	public TransaccionFueradeTiempoException() {
		super("Excepcion personalizada.");
	}
	
	public TransaccionFueradeTiempoException(String mensaje) {
		super(mensaje);
	}
	
	public TransaccionFueradeTiempoException(String mensaje, Throwable ex) {
		super(mensaje, ex);
	}
}
