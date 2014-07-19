package com.bstmexico.cursojava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionService {
	private static final Logger LOG = LoggerFactory.getLogger(ConnectionService.class);
	
	private static final String USER = "ezfact";
	private static final String HOST = "jdbc:mysql://localhost:3306/";
	private static final String PASSWORD = "ezfact";
	private static final String DATABASE = "test";
	
	public static Connection getConection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(HOST + DATABASE, USER, PASSWORD);
			
		} catch (ClassNotFoundException ex) {
			LOG.error("Falta agregar el Driver al CLASS_PATH del proyecto.", ex);
		} catch (SQLException ex) {
			LOG.error("Error al tratar de establecer la conexion.", ex);
		}
		
		return conn;
	}

	public static void close(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException ex) {
			LOG.error("Error al tratar de cerrar la conexion.", ex);
		}
	}
}
