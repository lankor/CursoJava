package com.bstmexico.cursojava.main.output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class MainByteArrayOutputStream {
	private static final Logger LOG = LoggerFactory.getLogger(MainByteArrayOutputStream.class);
	
	public static void main(String args[]) {
		File archivo = new File("ArchivoB.dat");
		FileOutputStream fos = null;
		ByteArrayOutputStream baos = null;
		
		try {
			fos = new FileOutputStream(archivo);
			baos = new ByteArrayOutputStream();
			
			baos.write("Escribir una cadena en un archivo".getBytes());
			baos.writeTo(fos);
		} catch (FileNotFoundException ex) {
			LOG.info("El archivo no existe.", ex);
		} catch (IOException ex) {
			LOG.info("Error.", ex);
		} finally {
			close(fos);
		}
	}
	
	private static void close(FileOutputStream fos) {
		try {
			if (fos != null) {
				fos.flush();
				fos.close();
			}
		} catch (IOException ex) {
			LOG.info("Error al cerrar el flujo.", ex);
		}
	}
}
