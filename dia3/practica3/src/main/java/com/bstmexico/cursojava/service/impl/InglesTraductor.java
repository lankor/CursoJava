package com.bstmexico.cursojava.service.impl;

import com.bstmexico.cursojava.service.Traductor;

public class InglesTraductor implements Traductor{

	@Override
	public String saludar(String nombre) {
		return "Hi " + nombre;
	}
}
