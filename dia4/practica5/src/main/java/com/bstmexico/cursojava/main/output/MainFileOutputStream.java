package com.bstmexico.cursojava.main.output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.awt.SunHints.Value;

public class MainFileOutputStream {
	private static final Logger LOG = LoggerFactory.getLogger(MainFileOutputStream.class);
	public static void main(String args[]) {
		File archivo = new File("Archivo.dat");
		FileOutputStream fos = null;
		byte[] cadena = "Una cadena para escribir algo en el archivo".getBytes();
		
		try {
			fos = new FileOutputStream(archivo);
			fos.write(cadena);
		} catch (FileNotFoundException ex) {
			LOG.info("Archivo inexistente.", ex);
		} catch (IOException ex) {
			LOG.info("Error de entrada y salida.", ex);
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
