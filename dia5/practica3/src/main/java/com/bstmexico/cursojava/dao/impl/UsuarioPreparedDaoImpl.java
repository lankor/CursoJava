package com.bstmexico.cursojava.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.management.jmxremote.ConnectorBootstrap;

import com.bstmexico.cursojava.dao.ConnectionService;
import com.bstmexico.cursojava.dao.UsuarioDao;
import com.bstmexico.cursojava.model.Usuario;

public class UsuarioPreparedDaoImpl implements UsuarioDao {
	private static final Logger LOG = LoggerFactory.getLogger(UsuarioPreparedDaoImpl.class);
	
	private static final String INSERT = "INSERT INTO tusuario (VNombreUsuario, VPassword) VALUES (?, ?)";
	private static final String SELECT_ALL = "SELECT * FROM tusuario";
	
	@Override
	public void crear(Usuario usuario) {
		Connection con = null;
		try {
			con = ConnectionService.getConection();
			
			PreparedStatement sentencia = con.prepareStatement(INSERT);
			sentencia.setString(1, usuario.getNombreUsuario());
			sentencia.setString(2, usuario.getPassword());
			
			sentencia.executeUpdate();
		} catch (SQLException ex) {
			LOG.error("Error al intentar registrar un nuevo usuario.", ex);
		} finally {
			ConnectionService.close(con);
		}
	}

	@Override
	public Collection<Usuario> recuperararTodos() {
		Connection con = null;
		try {
			con = ConnectionService.getConection();
			PreparedStatement query = con.prepareStatement(SELECT_ALL);
			
			ResultSet rs = query.executeQuery();
			
			return getList(rs);
		} catch (SQLException ex) {
			LOG.error("Error al recuperar los objetos de la base de datos.");
		} finally {
			ConnectionService.close(con);
		}
		
		return null;
	}

	private Collection<Usuario> getList(ResultSet rs) throws SQLException {
		Collection<Usuario> lista = new ArrayList<Usuario>();
		
		if (rs.next()) {
			do {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("NIdUsuario"));
				usuario.setPassword(rs.getString("VNombreUsuario"));
				usuario.setNombreUsuario(rs.getString("VNombreUsuario"));
				
				lista.add(usuario);
			} while (rs.next());

		}
		
		return lista;
	}

}
