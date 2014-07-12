/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bstmexico.cursojava.model;

/**
 *
 * @author PMX-Java
 */
public class Esfera extends Figura3D {
    private Double radio;

    public Esfera() {
    }

    public Esfera(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double getVolumen() {
        return (4 * Math.PI * Math.pow(radio, 3.0)) / 3;
    }

}
