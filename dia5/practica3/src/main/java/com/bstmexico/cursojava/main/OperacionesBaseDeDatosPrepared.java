package com.bstmexico.cursojava.main;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bstmexico.cursojava.dao.UsuarioDao;
import com.bstmexico.cursojava.dao.impl.UsuarioDaoImpl;
import com.bstmexico.cursojava.dao.impl.UsuarioPreparedDaoImpl;
import com.bstmexico.cursojava.model.Usuario;

public class OperacionesBaseDeDatosPrepared {
	private static final Logger LOG = LoggerFactory
			.getLogger(OperacionesBaseDeDatosPrepared.class);
	private static final UsuarioDao usuarioDao = new UsuarioPreparedDaoImpl();

	public static void main(String args[]) {
		for (int i = 0; i < 1000; i++) {
			Usuario usuario = new Usuario();
			usuario.setNombreUsuario("angelpool" + i);
			usuario.setPassword("passwordpool" + i);

			usuarioDao.crear(usuario);
			LOG.info(usuario.toString());

			Collection<Usuario> usuarios = usuarioDao.recuperararTodos();
			LOG.info(usuarios.toString());
		}
	}
}
