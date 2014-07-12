package com.bstmexico.cursojava.main;

import com.bstmexico.cursojava.service.Traductor;
import com.bstmexico.cursojava.service.impl.AlemanTraductor;
import com.bstmexico.cursojava.service.impl.EspanolTraductor;
import com.bstmexico.cursojava.service.impl.InglesTraductor;

public class MainInterfaces {
	public static void main(String args[]) {
		Traductor traductor = new AlemanTraductor();
		
		System.out.println(traductor.saludar("Luis"));
	}
}
