package com.calc;

public class Calculadora {
	
	public static void soma(double a, double b) {
		double resultado = a + b;
		System.out.println("a soma ser�: " + resultado);
	}

	public static void subtracao(double a, double b) {
		double resultado = a - b;
		System.out.println("a subtra��o ser�: " + resultado);
	}
	
	public static void mult(double a, double b) {
		double resultado = a * b;
		System.out.println("a multiplica��o ser�: " + resultado);
	}
	
	public static void div(double a, double b) {
		double resultado = a / b;
		System.out.println("a divis�o ser�: " + resultado);
	}
}
