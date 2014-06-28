package com.bstmexico.cursojava.figuras;

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

    public String testPolimorfismo() {
        return "Aqui realizo una funcion";
    }

    public String testPolimorfismo(String mensaje) {
        return "Realizo otra funcion, dependiendo de los parametros.\n" + mensaje;
    }
}
