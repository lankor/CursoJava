package com.bstmexico.cursojava.main;

import java.util.HashSet;
import java.util.Set;

import com.bstmexico.cursojava.model.Alumno;


public class Main {
	public static void main(String args[]) {
		String string1 = "Hola";
		String string2 = "Hola";
		
		String string3 = "HOLA";
		String string4 = new String("Hola");
		
		System.out.println("string1 == string2 " + (string1 == string2));
		System.out.println("string1 == string3 " + (string1 == string3));
		System.out.println("string1 == string4 " + (string1 == string4));
		System.out.println("*********************************************");
		System.out.println("string1.equals(string2) " + string1.equals(string2));
		System.out.println("string1.equals(string3) " + string1.equals(string3));
		System.out.println("string1.equals(string4) " + string1.equals(string4));
		
		Integer int1 = 12;
		Integer int2 = 12;
		Integer int3 = 9772048;
		Integer int4 = 9772048;
		System.out.println("*********************************************");
		System.out.println("int1 == int2 " + (int1 == int2));
		System.out.println("int3 == int4 " + (int3 == int4));
		System.out.println("*********************************************");
		System.out.println("int1.equals(int2) " + int1.equals(int2));
		System.out.println("int3.equals(int4) " + int3.equals(int4));
		
		
		System.out.println("*********************************************");
		Alumno alumno1 = createAlumno(1);
		Alumno alumno2 = createAlumno(1);
		
		/*
		 * 1.- Quitar los comentarios al metodo equals de la clase Alumno y 
		 *     volver a ejecutar. ¿Que imprime la ultima linea del metodo?
		 * 
		 * 2.- Quitar los comentarios al metodo hashCode y volver a ejecutar.
		 *     ¿Que imprime la ultima linea del metodo?
		 * 
		 * 3.- Quitar los comentarios al metodo toString. ¿Que imprime la ultima
		 *     linea del metodo?
		 */
		System.out.println("alumno1 == alumno2) : " + (alumno1 == alumno2));
		System.out.println("alumno1.equals(alumno2) : " + alumno1.equals(alumno2));
		
		System.out.println("hashCode : " + alumno1.hashCode());
		System.out.println("hashCode : " + alumno2.hashCode());
		
		Set<Alumno> alumnos = new HashSet<Alumno>();
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		alumnos.add(createAlumno(2));
		
		System.out.println(alumnos);
	}

	private static Alumno createAlumno(int i) {
		Alumno alumno = new Alumno();
		alumno.setMatricula(i);
		alumno.setNombre("Nombre" + i);
		alumno.setApellidoPaterno("ApellidoPat" + i);
		alumno.setApellidoMaterno("ApellidoMat" + i);
		
		return alumno;
	}
}
