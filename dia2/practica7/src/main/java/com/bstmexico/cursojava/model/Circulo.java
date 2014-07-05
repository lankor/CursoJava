/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bstmexico.cursojava.model;

/**
 *
 * @author PMX-Java
 */
public class Circulo extends Figura2D {
    private Double radio;

    public Circulo() {
        super();
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Circulo(String nombre, Double radio) {
        super(nombre);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double getPerimetro() {
        return Math.PI * this.radio;
    }

    @Override
    public Double getArea() {
        return Math.PI * (Math.pow(this.radio, 2d));
    }

    public String testSuper() {
        return "Estoy en " + super.getNombre() + " " + super.testFigura2D()
                + "\n" + getArea();
    }
}
