package com.bstmexico.cursojava.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.awt.SunHints.Value;

public class MainFileInputStream {
	private static final Logger LOG = LoggerFactory.getLogger(MainFileInputStream.class);
	public static void main(String args[]) {
		File archivo = new File("Archivo.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			String linea;
			while ((linea = br.readLine()) != null) {
				LOG.info(linea);
			}
		} catch (FileNotFoundException ex) {
			LOG.error("", ex);
		} catch (IOException ex) {
			LOG.error("", ex);
		} finally {
			close(fr);
		}
	}
	
	private static void close(FileReader fr) {
		if (fr != null) {
			try {
				fr.close();
			} catch (IOException ex) {
				LOG.error("Error al cerrar el flujo del archivo.", ex);
			}
		}
	}
}
