package com.calc;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		int oper;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindo � sua Calculadora Tabajara, \nqual a opera��o que voc� deseja realizar?");
		System.out.println("1 - soma" + "\n2 - subtra��o" + "\n3 - multiplica��o" + "\n4 - divis�o");
		oper = sc.nextInt();
		
					
		//puxando calculadora da classe dela			
		double a, b;	
		if (oper == 1) { 
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Calculadora de SOMA \nqual o primeiro n�mero que deseja calcular?");
			a = Double.parseDouble(sc1.nextLine());
			
			System.out.println("qual o segundo n�mero?");
			b = Double.parseDouble(sc1.nextLine());
		
			Calculadora.soma(a, b); }
		
		
		else if (oper == 2) {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Calculadora de SUBTRAC�O \nqual o primeiro n�mero que deseja calcular?");
			a = Double.parseDouble(sc1.nextLine());
			
			System.out.println("qual o segundo n�mero?");
			b = Double.parseDouble(sc1.nextLine());
			
			Calculadora.subtracao(a, b); }
		
		else if (oper == 3) {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Calculadora de MULTIPLICA��O \nqual o primeiro n�mero que deseja calcular?");
			a = Double.parseDouble(sc1.nextLine());
			
			System.out.println("qual o segundo n�mero?");
			b = Double.parseDouble(sc1.nextLine());
			
			Calculadora.mult(a, b); }
		
		else if (oper == 4) {
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Calculadora de DIVIS�O \nqual o primeiro n�mero que deseja calcular?");
			a = Double.parseDouble(sc1.nextLine());
			
			System.out.println("qual o segundo n�mero?");
			b = Double.parseDouble(sc1.nextLine());
			
			Calculadora.div(a, b);}
		
		else {System.out.println("opera��o inv�lida");}
		
		
		
		
	
		
		
		
		
		
	}
	

}
