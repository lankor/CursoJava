package com.bstmexico.cursojava.service;

import java.util.Date;

import com.bstmexico.cursojava.dao.TestDao;
import com.bstmexico.cursojava.exception.service.RangoFechasException;
import com.bstmexico.cursojava.exception.service.TransaccionFueradeTiempoException;

public class TestService {
	private TestDao dao = new TestDao();
	
	public void consultarPorFechas(Date del, Date al) {
		if (del.equals(al)) {
			throw new RangoFechasException("Rango de fechas invalido");			
		}
		dao.consulta();
		System.out.println("El servicio se ejecuta correctamente");
	}
	
	public void ejecutarTransaccion() {
		throw new TransaccionFueradeTiempoException("Transaccion fuera de tiempo, ebe hacerse ante de las 8:00 AM");
	}
}
