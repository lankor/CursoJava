package com.bstmexico.cursojava.service.impl;

import com.bstmexico.cursojava.service.Traductor;

public class AlemanTraductor implements Traductor {

	@Override
	public String saludar(String nombre) {
		return "Hallo " + nombre;
	}

}
