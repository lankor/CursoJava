package com.bstmexico.cursojava.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LectorArchivo {
	public void sinTratarExcepcion() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(new File("C:\\NoExiste.txt"));
		
		System.out.println(fis.available());
		
		fis.close();
	}
	
	public void tratandoExcepcion(String file) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(new File(file));
			System.out.println(fis.available());
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.err);
		} catch (IOException ex) {
			ex.printStackTrace(System.err);
		} finally {
			System.out.println("Este mensaje se va mostrar aunque no haya " +
					"ocurrido ningun error");
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace(System.out);
			}
		}
	}
}
