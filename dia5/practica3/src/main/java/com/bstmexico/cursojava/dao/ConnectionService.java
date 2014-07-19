package com.bstmexico.cursojava.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectionService {
	private static final Logger LOG = LoggerFactory.getLogger(ConnectionService.class);
	
	private static final String USER = "ezfact";
	private static final String HOST = "jdbc:mysql://localhost:3306/";
	private static final String PASSWORD = "ezfact";
	private static final String DATABASE = "test";
	
	private static BasicDataSource basicDataSource;
	
	static {
		basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		basicDataSource.setUsername(USER);
		basicDataSource.setPassword(PASSWORD);
		basicDataSource.setUrl(HOST + DATABASE);
		basicDataSource.setMinIdle(5);
		basicDataSource.setMaxActive(10);

		// Opcional. Sentencia SQL que le puede servir a BasicDataSource
		// para comprobar que la conexion es correcta.
		basicDataSource.setValidationQuery("select 1");
	}
	public static Connection getConection() {
		try {
			return basicDataSource.getConnection();
		} catch (SQLException ex) {
			LOG.error("Error al recuperar una conexion del pool.");
		}
		return null;
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
