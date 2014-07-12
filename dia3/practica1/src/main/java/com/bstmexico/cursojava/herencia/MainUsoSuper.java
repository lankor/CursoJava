package com.bstmexico.cursojava.herencia;

import com.bstmexico.cursojava.model.Circulo;
import com.bstmexico.cursojava.model.Cuadrado;
import com.bstmexico.cursojava.model.Esfera;

public class MainUsoSuper {

	public static void main(String[] args) {
		Circulo circulo = new Circulo();
		circulo.setRadio(2.23);

		circulo.setNombre("Circulo Dos Uso de super"); // Metodo Heredado
		circulo.setColorBorde("Rosa"); // Metodo Heredado

		System.out.println(circulo.testSuper());

		Circulo otroCirculo = new Circulo("Otro circulo", 8.4);
		System.out.println(otroCirculo.testSuperCirculo());

	}
}
