package com.calc;

public class Calculadora {
	
	public static void soma(double a, double b) {
		double resultado = a + b;
		System.out.println("a soma será: " + resultado);
	}

	public static void subtracao(double a, double b) {
		double resultado = a - b;
		System.out.println("a subtração será: " + resultado);
	}
	
	public static void mult(double a, double b) {
		double resultado = a * b;
		System.out.println("a multiplicação será: " + resultado);
	}
	
	public static void div(double a, double b) {
		double resultado = a / b;
		System.out.println("a divisão será: " + resultado);
	}
}
