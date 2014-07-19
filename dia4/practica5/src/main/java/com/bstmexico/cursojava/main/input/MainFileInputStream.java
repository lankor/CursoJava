package com.bstmexico.cursojava.main.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.awt.SunHints.Value;

public class MainFileInputStream {
	private static final Logger LOG = LoggerFactory.getLogger(MainFileInputStream.class);
	public static void main(String args[]) {
		File archivo = new File("D:\\BSTMexico\\Cursos\\Java\\CursoJava\\dia2\\ConvencionesCodigoJava.pdf");
		
		readBytes(archivo);
		readArray(archivo);
	}
	
	private static void readArray(File archivo) {
		FileInputStream fis = null;
		
		try {
			byte[] array = new byte[100];
			fis = new FileInputStream(archivo);
			
			int value = fis.read(array);
			while(value != -1) {
				LOG.debug(String.valueOf(array.length));
				value = fis.read(array);
			}
		} catch (IOException ex) {
			LOG.error("Error de lectura.", ex);
		} finally {
			close(fis);
		}
	}
	
	private static void readBytes(File archivo) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(archivo);
			
			int value = fis.read();
			while(value != -1) {
				LOG.debug(String.valueOf((char) value));
				value = fis.read();
			}
		} catch (IOException ex) {
			LOG.error("Error de lectura.", ex);
		} finally {
			close(fis);
		}
	}
	
	private static void close(FileInputStream fis) {
		if (fis != null) {
			try {
				fis.close();
			} catch (IOException ex) {
				LOG.error("Error al cerrar el flujo del archivo.", ex);
			}
		}
	}
}
