package com.bstmexico.cursojava.model;

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
    
    @Override
    public String toString() {
    	StringBuffer strBuffer = new StringBuffer();
    	strBuffer.append("[nombre : ");
    	strBuffer.append(this.getNombre());
    	strBuffer.append("]");
    	return strBuffer.toString();
    }
}
