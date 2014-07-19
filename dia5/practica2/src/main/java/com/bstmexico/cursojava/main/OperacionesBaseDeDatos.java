package com.bstmexico.cursojava.main;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bstmexico.cursojava.dao.UsuarioDao;
import com.bstmexico.cursojava.dao.impl.UsuarioDaoImpl;
import com.bstmexico.cursojava.model.Usuario;

public class OperacionesBaseDeDatos {
	private static final Logger LOG = LoggerFactory.getLogger(OperacionesBaseDeDatos.class);
	private static final UsuarioDao usuarioDao = new UsuarioDaoImpl();
	
	public static void main(String args[]) {
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario("angel");
		usuario.setPassword("password");
		
		usuarioDao.crear(usuario);
		LOG.info(usuario.toString());
		
		Collection<Usuario> usuarios = usuarioDao.recuperararTodos();
		LOG.info(usuarios.toString());
	}
}
