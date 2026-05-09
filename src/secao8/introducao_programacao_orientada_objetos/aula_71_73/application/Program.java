package secao8.introducao_programacao_orientada_objetos.aula_71_73.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.introducao_programacao_orientada_objetos.aula_71_73.entities.Triangle;
 
public class Program {

	public static void main(String[] args) {
		
		/**
		 * PROBLEMA SEM ORIENTAÇÃO A OBJETOS AULA 71 (SEM CLASSE E SEM MÉTODO)
		 */
			//		Locale.setDefault(Locale.US);
			//		Scanner scan = new Scanner(System.in);
			//		double xA, xB, xC, yA, yB, yC;
			//		
			//		System.out.println("Enter the measures of triangle X: ");
			//		xA = scan.nextDouble();
			//		xB = scan.nextDouble();
			//		xC = scan.nextDouble();
			//		System.out.println("Enter the measures of triangle Y: ");
			//		yA = scan.nextDouble();
			//		yB = scan.nextDouble();
			//		yC = scan.nextDouble();
			//		
			//		double p = (xA + xB + xC) / 2.0;
			//		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
			//		
			//		p = (yA + yB + yC) / 2.0;
			//		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
			//		
			//		System.out.printf("Triangle X area: %.4f%n", areaX);
			//		System.out.printf("Triangle Y area: %.4f%n", areaY);
			//		
			//		if (areaX > areaY) {
			//			System.out.println("Larger area: X");
			//		} else {
			//			System.out.println("Larger area: Y");
			//		}
			//		
			//		scan.close();
		
		/**
		 * PROBLEMA COM ORIENTAÇÃO A OBJETOS AULA 72 (CRIANDO CLASSE E ATRIBUTOS)
		 */
			//		Locale.setDefault(Locale.US);
			//		Scanner scan = new Scanner(System.in);
			//
			//		Triangle x, y;
			//		x = new Triangle();
			//		y = new Triangle();
			//		
			//		System.out.println("Enter the measures of triangle X:");
			//		x.a = scan.nextDouble();
			//		x.b = scan.nextDouble();
			//		x.c = scan.nextDouble();
			//		System.out.println("Enter the measure of triangle Y:");
			//		y.a = scan.nextDouble();
			//		y.b = scan.nextDouble();
			//		y.c = scan.nextDouble();
			//		
			//		double p = (x.a + x.b + x.c) / 2.0;
			//		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
			//		
			//		p = (y.a + y.b + y.c) / 2.0;
			//		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
			//		
			//		System.out.printf("Triangle X area: %.4f%n", areaX);
			//		System.out.printf("Triangle Y area: %.4f%n", areaY);
			//		
			//		if (areaX > areaY) {
			//			System.out.println("Larger area: X");
			//		} else {
			//			System.out.println("Larger area: Y");
			//		}
		
		/**
		 * PROBLEMA COMPLETO COM ORIENTAÇÃO A OBJETOS AULA 73 (CLASSE, ATRIBUTO E MÉTODO)
		 */
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		System.out.println("Enter the measure of triangle Y:");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		scan.close();
	}

}
