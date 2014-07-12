package com.bstmexico.cursojava.dao;

import java.util.Random;

import com.bstmexico.cursojava.exception.dao.InsertException;
import com.bstmexico.cursojava.exception.dao.SelectException;

public class TestDao {
	public void guardarTransaccion() {
		throw new InsertException("Error al insertar en la base de datos.");
	}
	
	public void consulta() {
		Random random = new Random();
		
		if (random.nextBoolean()) {
			throw new SelectException();
		}
		System.out.println("El dao ejecuta correctamente la consulta");
	}
}
