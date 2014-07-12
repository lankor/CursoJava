package com.bstmexico.cursojava.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.bstmexico.cursojava.exception.MiCheckedException;
import com.bstmexico.cursojava.exception.MiUncheckedException;

public class LectorArchivoUnchecked {
	public void tratandoExcepcion(String file) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(new File(file));
			System.out.println(fis.available());
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.err);
			throw new MiUncheckedException("Archivo inexistente", ex);
		} catch (IOException ex) {
			ex.printStackTrace(System.err);
			throw new MiUncheckedException();
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
