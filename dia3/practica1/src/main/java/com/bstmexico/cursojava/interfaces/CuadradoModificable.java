package com.bstmexico.cursojava.interfaces;

import com.bstmexico.cursojava.model.Cuadrado;

public class CuadradoModificable extends Cuadrado implements Modificable {

    public void modificarTamaño(Double porcentaje) {
        double lado = this.getLado();
        double pje = Math.abs(porcentaje) / 100;

        if(porcentaje < 0) {
            lado = lado - (lado * pje);
        } else {
            pje = 1 + pje;
            lado = lado * pje;
        }

        this.setLado(lado);
    }

}
