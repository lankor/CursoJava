package com.bstmexico.cursojava.encapsulacion;

import com.bstmexico.cursojava.model.Cuadrado;
import com.bstmexico.cursojava.model.Prisma;

public class Main {

    public static void main(String[] args) {
        /*
         * Los datos de cada una de las figuras se encuentran encapsulados,
         * ya que son privados y solo es posible acceder a cada uno de ellos a
         * través de metodos publicos.
         *
         * El prisma solo expone el metodo getVolumen() y oculta la funcionalidad
         * de calcular el area de la figura base, ya que no es relevante, solo
         * nos interesa conocer el volumen
         */
        Cuadrado basePrisma = new Cuadrado(5.5);
        Prisma prisma = new Prisma(basePrisma, 20D);

        System.out.println("Volumen: " + prisma.getVolumen());
    }
}
