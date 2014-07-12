package com.bstmexico.cursojava.model;

public class Cuadrado extends Figura2D {
    private Double lado;
    String color;
    
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
    
    public void modificadoresDeAcceso() {
    	
    	/* 
    	 * La propiedad no existe en la clase, pero el modificador de acceso es
    	 * protected, por lo que las clases que la extienden la tienen disponible 
    	 */
    	System.out.println(this.colorBorde);
    }
}
