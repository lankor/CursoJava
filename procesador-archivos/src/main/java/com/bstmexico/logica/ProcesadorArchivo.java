package com.bstmexico.logica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.Buffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.bstmexico.modelo.Movimiento;

public class ProcesadorArchivo implements ProcesadorArchivoInterface {
	
	private ArrayList<Movimiento> leer(File archivo) {
		FileReader freader = null;
		BufferedReader breader = null;
		String strLine;
		ArrayList<Movimiento> lista = null;
		try{
			freader = new FileReader(archivo);
			breader = new BufferedReader(freader);
			
			lista = new ArrayList<Movimiento>();
			while(((strLine = breader.readLine())!= null)) {
				String[] array = strLine.split("|");
				Movimiento mov = parseMovimiento(array);
				
				lista.add(mov);
			}
			
			return lista;
		}
		catch(IOException ex){
			
			
		} finally {
			try {
				freader.close();
			} catch (IOException ex) {
				
			}
		}
		
		return null;
	}

	private Movimiento parseMovimiento(String[] array) {
		Movimiento movimiento = new Movimiento();
		movimiento.setFecha(parseFecha(array[0]));
		movimiento.setIdCliente(parseInteger(array[1]));
		movimiento.setIdEstablecimiento(parseInteger(array[2]));
		movimiento.setMonto(parseBigDecimal(array[3]));
		movimiento.setNumCuenta(validarCuenta(array[4]));
		
		return movimiento;
	}

	private String validarCuenta(String string) {
		if (string.matches("$[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}^")) {
			return string;			
		} else {
			throw new IllegalArgumentException("Formato no valido");
		}
	}

	private BigDecimal parseBigDecimal(String string) {
		try {
			return new BigDecimal(string);
		} catch (NumberFormatException ex) {
			System.out.println("Hay que hacer algo con la excepcion.");
			throw new IllegalArgumentException();
		}
	}

	private int parseInteger(String string) {
		try {
			return Integer.parseInt(string, 10);
		} catch (NumberFormatException ex) {
			System.out.println("Hay que hacer algo con la excepcion.");
			throw new IllegalArgumentException();
		}
	}

	private Date parseFecha(String string) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return format.parse(string);
		} catch (ParseException ex) {
			throw new IllegalArgumentException("Error en el formato de la fecha");
		}
	}

	private void renombrar(File archivo, boolean estatus) {
		if (estatus) {
			System.out
					.println("Debo renombrar agregando un .t al final del archivo");
		} else {
			System.out
					.println("Debo renombrar agregando un .err al final del archivo");
		}
	}

	@Override
	public boolean procesar(File archivo) {
		boolean estatus = false;
		try {
			leer(archivo);
			estatus = true;
			renombrar(archivo, estatus);
		} catch (IllegalArgumentException ex) {
			estatus = false;
			renombrar(archivo, estatus);		
		}
		
		return estatus;
	}
}
