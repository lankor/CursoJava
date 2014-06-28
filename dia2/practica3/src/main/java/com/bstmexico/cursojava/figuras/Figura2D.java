package com.bstmexico.cursojava.figuras;

/**
 *
 * @author PMX-Java
 */
public abstract class Figura2D extends Figura {

    private String colorBorde;

    public abstract Double getPerimetro();
    public abstract Double getArea();

    public Figura2D() {

    }
    
    public Figura2D(String nombre) {
        super(nombre);
    }
    
    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public String testFigura2D() {
        return "Estoy en la clase Figura 2D " + super.testFigura();
    }
}
