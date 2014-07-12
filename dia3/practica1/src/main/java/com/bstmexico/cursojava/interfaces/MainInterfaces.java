package com.bstmexico.cursojava.interfaces;

public class MainInterfaces {
    public static void main(String[] args) {
        CuadradoModificable cuadrado = new CuadradoModificable();
        cuadrado.setLado(2d);

        System.out.println("Lado: " + cuadrado.getLado() + "\nArea: " + cuadrado.getArea());

        cuadrado.modificarTamaño(50D);
        System.out.println("Lado: " + cuadrado.getLado() + "\nArea: " + cuadrado.getArea());

        cuadrado.modificarTamaño(-30D);
        System.out.println("Lado: " + cuadrado.getLado() + "\nArea: " + cuadrado.getArea());
    }
}
