package com.schoolofnet.learning;

import java.util.Scanner;

public class Cond {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Double num1 = 0.0;
		Double num2 = 0.0;
		String op = "";
		Double result = 0.0;
		
		System.out.println("Number 1: ");
		num1 = reader.nextDouble();
		System.out.println("Number 2: ");
		num2 = reader.nextDouble();
		reader.nextLine();
		System.out.println("Operation (+,-,/,*): ");
		op = reader.nextLine(); // lê o input do usuário
		
		/*
		 * > maior
		 * >= maior ou igual
		 * <= menor ou igual
		 * == igual (referencia de memoria)
		 * != diferente
		 * ! nao
		 */
		
		// ternary
		String a = "b";
		Boolean res = a == "b" ? true : false;
		
		// if (op == "+") {
		if (op.equals("+")) {
			result = sum(num1, num2);
			reader.close();
			System.out.println(result);
		} else if (op.equals("-")) {
			result = sub(num1, num2);
			reader.close();
			System.out.println(result);
		} else if (op.equals("/")) {
			result = div(num1, num2);
			reader.close();
			System.out.println(result);
		} else if (op.equals("*")) {
			result = mult(num1, num2);
			reader.close();
			System.out.println(result);
		} else {
			System.out.println("Could not find operations");
		}

	}
	
	public static Double sum(Double num1, Double num2) {
		return num1 + num2;
	}
	
	public static Double sub(Double num1, Double num2) {
		return num1 - num2;
	}
	
	public static Double mult(Double num1, Double num2) {
		return num1 * num2;
	}
	
	public static Double div(Double num1, Double num2) {
		return num1 / num2;
	}
}
