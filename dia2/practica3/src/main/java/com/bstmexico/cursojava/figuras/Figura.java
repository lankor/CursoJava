package com.bstmexico.cursojava.figuras;

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
    
    @Override
    public String toString() {
    	return this.getClass().getSimpleName();
    }
}
