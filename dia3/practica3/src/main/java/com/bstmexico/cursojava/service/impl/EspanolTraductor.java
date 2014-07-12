package com.bstmexico.cursojava.service.impl;

import com.bstmexico.cursojava.service.Traductor;

public class EspanolTraductor implements Traductor {

	@Override
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}

}
