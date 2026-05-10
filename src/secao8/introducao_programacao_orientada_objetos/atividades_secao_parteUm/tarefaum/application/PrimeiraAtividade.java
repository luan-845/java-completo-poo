package secao8.introducao_programacao_orientada_objetos.atividades_secao_parteUm.tarefaum.application;

import java.util.Locale;
import java.util.Scanner;

import secao8.introducao_programacao_orientada_objetos.atividades_secao_parteUm.tarefaum.entities.Rectangle;

public class PrimeiraAtividade {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		
		System.out.println("Enter rectangle widht and height");
		rectangle.width = scan.nextDouble();
		rectangle.height = scan.nextDouble();
		
		
		System.out.println("AREA: " + String.format("%.2f", rectangle.area()));
		System.out.println("PERIMETER: " + String.format("%.2f",rectangle.perimeter()));
		System.out.println("DIAGONAL: " + String.format("%.2f",rectangle.diagonal()));
		
		scan.close();

	}

}
