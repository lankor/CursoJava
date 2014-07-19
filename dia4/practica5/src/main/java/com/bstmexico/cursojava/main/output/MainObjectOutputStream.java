package com.bstmexico.cursojava.main.output;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bstmexico.cursojava.model.Usuario;

import sun.awt.SunHints.Value;

public class MainObjectOutputStream {
	private static final Logger LOG = LoggerFactory.getLogger(MainObjectOutputStream.class);
	
	public static void main(String args[]) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		File archivo = new File("Usuario.dat");
		LOG.debug(archivo.getAbsolutePath());
		
		try {
			Usuario usuario = new Usuario();
			usuario.setId(23533);
			usuario.setNombreUsuario("Usuario");
			usuario.setPassword("U$u4r1O");
			fos = new FileOutputStream(archivo);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(usuario);
		} catch (FileNotFoundException ex) {
			LOG.error("El archivo destino, no existe.", ex);
		} catch (IOException ex) {
			LOG.error("Error de escritura en el archivo.", ex);
		} finally {
			close(fos, oos);
		}
	}

	private static void close(FileOutputStream fos, ObjectOutputStream oos) {
		try {
			if (fos != null) {
				fos.flush();
				fos.close();
			}
		} catch (IOException ex) {
			LOG.error("Error al cerrar.", ex);
		}
		
		try {
			if (oos != null) {
				oos.flush();
				oos.close();
			}
		} catch (IOException ex) {
			LOG.error("Error al cerrar.", ex);
		}
	}
	
}
