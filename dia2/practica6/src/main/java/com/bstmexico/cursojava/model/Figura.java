/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bstmexico.cursojava.model;

/**
 *
 * @author PMX-Java
 */
public abstract class Figura {
    private String nombre;

    public Figura() {
        super();
    }

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String dibujar() {
        return "Metodo de la clase Figura";
    }

    public String testFigura() {
        return "Estoy en la clase Figura ";
    }
}
