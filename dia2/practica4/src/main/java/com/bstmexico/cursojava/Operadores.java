package com.bstmexico.cursojava;

public class Operadores {
	
	public static void main(String arg[]) {
		int intA = 95;
		int intB = 95;
		int intC = 100;
		int intD = 70;
		int intE = 70;
		
		/*
		 * Operadores Aritméticos
		 */
		int suma = sumar(23, 73);
		int resta = restar(33, 16);
		int multiplicacion = multiplicar(5,7);
		double division = dividir(234, 63);
		int modulo = 3 % 2;
		
		boolean booleanA = true;
		
		System.out.println("suma : " + suma);
		System.out.println("resta : " + resta);
		System.out.println("multiplicacion : " + multiplicacion);
		System.out.println("division : " + division);
		System.out.println("modulo : " + modulo);
		
		System.out.println("decremento : " + suma--);
		System.out.println("suma : " + suma);
		
		System.out.println("decremento : " + --resta);
		System.out.println("suma : " + resta);
		
		System.out.println("incremento : " + suma++);
		System.out.println("suma : " + suma);
		
		System.out.println("incremento : " + ++resta);
		System.out.println("suma : " + resta);
		
		
		/*
		 * Operadores lógicos
		 */
		if (suma > resta) {
			System.out.println("El resultado de la suma es mayor que el de la resta");
		}
		
		if (modulo < resta) {
			System.out.println("El resultado del modulo es menor que el de la resta");
		}
		
		if (intA >= intB) {
			System.out.println(intA + " es mayor o igual a " + intB);
		}
		
		if (intC >= intA) {
			System.out.println(intC + " es mayor o igual a " + intA);
		}
		
		if (intD <= intA) {
			System.out.println(intD + " es mayor o igual a " + intA);
		}
		
		if (intE <= intD) {
			System.out.println(intE + " es mayor o igual a " + intD);
		}
		
		if (intE == intD) {
			System.out.println(intE + " es igual a " + intD);
		}
		
		if (intE != intA) {
			System.out.println(intE + " es distinto a " + intD);
		}
		
		if ((intD <= intA) && (intE == intD)) {
			System.out.println(intE + " es mayor o igual a " + intD + " y " 
					+ intE + " es igual a " + intD);
		}
		
		System.out.println("boolean : " + booleanA);
		System.out.println("boolean : " + !booleanA);
		
		String resultado = (intE == intD) ? "Los valores son iguales." 
										  : "Son diferentes";
		
		System.out.println(resultado);
	}

	private static double dividir(int intA, int intB) {
		return intA / intB;
	}

	private static int multiplicar(int intA, int intB) {
		return intA * intB;
	}

	private static int restar(int intA, int intB) {
		return intA - intB;
	}

	private static int sumar(int intA, int intB) {
		return intA + intB;
	}
}