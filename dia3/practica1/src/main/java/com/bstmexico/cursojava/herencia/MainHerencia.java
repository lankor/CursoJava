package com.bstmexico.cursojava.herencia;

import com.bstmexico.cursojava.model.Circulo;
import com.bstmexico.cursojava.model.Cuadrado;
import com.bstmexico.cursojava.model.Esfera;

public class MainHerencia {
    
    public static void main(String[] args) {
    	Circulo circulo = new Circulo();
        circulo.setRadio(2.23);

        circulo.setNombre("Circulo uno");         //Metodo Heredado
        circulo.setColorBorde("Rojo");            //Metodo Heredado

        System.out.println("Area de " + circulo.getNombre() + ": " + circulo.getArea());
        System.out.println("Perimetro de " + circulo.getNombre() + ": " + circulo.getPerimetro());
        System.out.println("Borde de " + circulo.getNombre() + ": " + circulo.getColorBorde());

        Cuadrado cuadrado = new Cuadrado(5D);
        cuadrado.setNombre("Cuadrado uno");       //Metodo Heredado
        cuadrado.setColorBorde("Azul");           //Metodo Heredado

        System.out.println("\n\n");
        System.out.println("Area de " + cuadrado.getNombre() + ": " + cuadrado.getArea());
        System.out.println("Perimetro de " + cuadrado.getNombre() + ": " + cuadrado.getPerimetro());
        System.out.println("Borde de " + cuadrado.getNombre() + ": " + cuadrado.getColorBorde());

        Esfera esfera = new Esfera();
        esfera.setNombre("Esfera Roja");        //Metodo Heredado
        esfera.setColorCara("Rojo");            //Metodo Heredado

        esfera.setRadio(5.6);

        System.out.println("\n\n");
        System.out.println("Volumen de " + esfera.getNombre() + ": " + esfera.getVolumen());
        System.out.println("Color de la figura " + esfera.getNombre() + ": " + esfera.getColorCara());
    }

}