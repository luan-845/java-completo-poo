package secao8.introducao_programacao_orientada_objetos.atividades_secao_parteUm.tarefaum.entities;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}
	public double perimeter(){
		return (width + height) * 2.0;
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)); 
		return diagonal;
	}

}
