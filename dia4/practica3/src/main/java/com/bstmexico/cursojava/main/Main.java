package com.bstmexico.cursojava.main;

import java.util.Date;
import java.util.Random;

import com.bstmexico.cursojava.exception.ApplicationException;
import com.bstmexico.cursojava.service.TestService;

public class Main {
	public static void main(String args[]) {
		TestService lector = new TestService();
		Random random = new Random();
		do {
			try {
				Date date1 = new Date();
				Date date2 = new Date(date1.getTime() + random.nextInt(1000000));
				if (random.nextBoolean()) {
					lector.consultarPorFechas(date1, date1);
				} else {
					lector.consultarPorFechas(date1, date2);
				}
			} catch (ApplicationException ex) {
				ex.printStackTrace(System.err);
			}
		} while (random.nextInt(1000) != 835);
	}
}
