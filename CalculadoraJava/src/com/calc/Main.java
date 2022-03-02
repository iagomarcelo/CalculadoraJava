package com.calc;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		int oper;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindo à sua Calculadora Tabajara, \nqual a operação que você deseja realizar?");
		System.out.println("1 - soma" + "\n2 - subtração" + "\n3 - multiplicação" + "\n4 - divisão");
		oper = sc.nextInt();
		
					
		//puxando calculadora da classe dela			
		double a, b;	
		if (oper == 1) { 
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Calculadora de SOMA \nqual o primeiro número que deseja calcular?");
			a = Double.parseDouble(sc1.nextLine());
			
			System.out.println("qual o segundo número?");
			b = Double.parseDouble(sc1.nextLine());
		
			Calculadora.soma(a, b); }
		
		
		else if (oper == 2) {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Calculadora de SUBTRACÃO \nqual o primeiro número que deseja calcular?");
			a = Double.parseDouble(sc1.nextLine());
			
			System.out.println("qual o segundo número?");
			b = Double.parseDouble(sc1.nextLine());
			
			Calculadora.subtracao(a, b); }
		
		else if (oper == 3) {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Calculadora de MULTIPLICAÇÃO \nqual o primeiro número que deseja calcular?");
			a = Double.parseDouble(sc1.nextLine());
			
			System.out.println("qual o segundo número?");
			b = Double.parseDouble(sc1.nextLine());
			
			Calculadora.mult(a, b); }
		
		else if (oper == 4) {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Calculadora de DIVISÃO \nqual o primeiro número que deseja calcular?");
			a = Double.parseDouble(sc1.nextLine());
			
			System.out.println("qual o segundo número?");
			b = Double.parseDouble(sc1.nextLine());
			
			Calculadora.div(a, b);}
		
		else {System.out.println("operação inválida");}
		
		
		
		
	
		
		
		
		
		
	}
	

}
