package com.bstmexico.cursojava.main.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bstmexico.cursojava.model.Usuario;

public class MainObjectInputStream {
	private static final Logger LOG = LoggerFactory
			.getLogger(MainObjectInputStream.class);

	public static void main(String args[]) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		File archivo = new File("Usuario.dat");

		try {
			fis = new FileInputStream(archivo);
			ois = new ObjectInputStream(fis);

			Usuario usuario = (Usuario) ois.readObject();

			LOG.info(usuario.toString());
		} catch (FileNotFoundException ex) {
			LOG.error("Error al cerrar el flujo del archivo.", ex);
		} catch (IOException ex) {
			LOG.error("Error al cerrar el flujo del archivo.", ex);
		} catch (ClassNotFoundException ex) {
			LOG.error("Error al cerrar el flujo del archivo.", ex);
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
