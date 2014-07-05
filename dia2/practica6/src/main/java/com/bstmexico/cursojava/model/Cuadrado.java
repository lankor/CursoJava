/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bstmexico.cursojava.model;

/**
 *
 * @author PMX-Java
 */
public class Cuadrado extends Figura2D {
    private Double lado;

    public Cuadrado() {
        super();
    }

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public Double getArea() {
        return Math.pow(lado, 2D);
    }

    public String getNombreFigura() {
    	return getTipo();
    }
    
    private static String getTipo() {
    	return "Cuadrado";
    }
}
