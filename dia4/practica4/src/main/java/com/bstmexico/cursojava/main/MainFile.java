package com.bstmexico.cursojava.main;

import java.io.File;
import java.io.IOException;

public class MainFile {
	public static void main(String args[]) {
		System.out.println("pathSeparator : " + File.pathSeparator);
		System.out.println("separator : " + File.separator);
		File carpeta = new File("D:\\BSTMexico\\Cursos\\Java\\CursoJava");
		
		System.out.println("isDirectory : " + carpeta.isDirectory());
		System.out.println("isHidden : " + carpeta.isHidden());
		System.out.println("exists : " + carpeta.exists());
		System.out.println("getParent : " + carpeta.getParent());
		
		File archivo = new File("D:\\BSTMexico\\Cursos\\Java\\CursoJava\\dia2\\ConvencionesCodigoJava.pdf");
		System.out.println("isDirectory : " + archivo.isDirectory());
		System.out.println("isHidden : " + archivo.isHidden());
		System.out.println("exists : " + archivo.exists());
		System.out.println("getParent : " + archivo.getParent());
		
		System.out.println("user.dir : " + System.getProperty("user.dir"));
		File rutaRelativa = new File("archivoRutaRelativa.txt");
		System.out.println(rutaRelativa.getAbsolutePath());
		
		try {
			rutaRelativa.createNewFile();
			File temporal = File.createTempFile("tempFile", ".txt", carpeta);
			System.out.println(temporal.getAbsolutePath());
		} catch (IOException ex) {
			ex.printStackTrace(System.err);
		}
	}
}
