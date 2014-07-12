package com.bstmexico.cursojava.model;

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
