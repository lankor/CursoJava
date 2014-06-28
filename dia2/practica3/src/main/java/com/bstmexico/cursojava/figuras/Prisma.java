package com.bstmexico.cursojava.figuras;

/**
 *
 * @author PMX-Java
 */
public class Prisma extends Figura3D {
    private Figura2D base;
    private Double altura;

    public Prisma(Figura2D base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double getVolumen() {
        Double areaBase = getAreaBase();
        return areaBase * this.altura;
    }

    private Double getAreaBase() {
        Double areaBase = base.getArea(); 
        return areaBase;
    }
}
