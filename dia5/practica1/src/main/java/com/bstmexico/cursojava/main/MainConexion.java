package com.bstmexico.cursojava.main;

import java.sql.Connection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bstmexico.cursojava.dao.ConnectionService;

public class MainConexion {
	private static final Logger LOG = LoggerFactory.getLogger(MainConexion.class);
	
	public static void main(String args[]) {
		Connection con = ConnectionService.getConection();
		
		LOG.info(con.toString());
		
		ConnectionService.close(con);
		LOG.info(con.toString());
	}
}
