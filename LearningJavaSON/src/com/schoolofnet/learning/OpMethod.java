package com.schoolofnet.learning;

import java.util.Scanner;

public class OpMethod {
//	public static void main(String[] args) {
//		Scanner reader = new Scanner(System.in);
//		Double num1 = 0.0;
//		Double num2 = 0.0;
//		
//		System.out.println("Number 1");
//		num1 = reader.nextDouble();
//		System.out.println("Number 2");
//		num2 = reader.nextDouble();
//		
//		Double result = sub(num1, num2);
//		System.out.println(result);
//		reader.close();
//	}
	
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
