package com.bstmexico.cursojava.dao;

import java.util.Collection;

import com.bstmexico.cursojava.model.Usuario;

public interface UsuarioDao {
	void crear(Usuario usuario);
	Collection<Usuario> recuperararTodos();
}
