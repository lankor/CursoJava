/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bstmexico.cursojava.model;

/**
 *
 * @author PMX-Java
 */
public abstract class Figura3D extends Figura {
    public String colorCara;

    public abstract Double getVolumen();

    public String getColorCara() {
        return colorCara;
    }

    public void setColorCara(String colorCara) {
        this.colorCara = colorCara;
    }
    
}
