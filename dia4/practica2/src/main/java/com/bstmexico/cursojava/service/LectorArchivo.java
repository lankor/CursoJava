package com.bstmexico.cursojava.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.bstmexico.cursojava.exception.MiCheckedException;

public class LectorArchivo {
	public void tratandoExcepcion(String file) throws MiCheckedException {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(new File(file));
			System.out.println(fis.available());
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.err);
			throw new MiCheckedException("Archivo inexistente", ex);
		} catch (IOException ex) {
			ex.printStackTrace(System.err);
			throw new MiCheckedException();
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
