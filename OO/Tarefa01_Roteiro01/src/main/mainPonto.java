package main;
import classes.ponto;

public class mainPonto {

	public static void main(String[] args) {
		System.out.println ("O programa a seguir faz o cálculo de 3 triangulos conforme as coordenadas passadas");
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		
		ponto p1, p2, p3, p4, p5, p6, p7, p8, p9;
		p1 = new ponto ();
		p1.preencher ();
		p1.imprimir ();
		
		p2 = new ponto ();
		p2.preencher ();
		p2.imprimir ();
		
		double distancia = p1.distanciaPontos(p2);
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.println ("A distancia do ponto 1 ate o 2 equivale a: " + distancia);
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		
		p3 = new ponto ();
		p3.preencher ();
		p3.imprimir ();
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.println("A area do triangulo equivale a: " + p1.areaTriangulo (p2, p3));
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		
		p4 = new ponto ();
		p4.preencher ();
		p4.imprimir ();
		
		p5 = new ponto ();
		p5.preencher ();
		p5.imprimir ();
		
		double distancia2 = p4.distanciaPontos(p5);
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.println ("A distancia do ponto 1 ate o 2 equivale a: " + distancia2);
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		
		p6 = new ponto ();
		p6.preencher ();
		p6.imprimir ();
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.println("A area do triangulo equivale a: " + p4.areaTriangulo (p5, p6));
		System.out.println ("----------------------------------------------------------------------------------------------------------");

		p7 = new ponto ();
		p7.preencher ();
		p7.imprimir ();
		
		p8 = new ponto ();
		p8.preencher ();
		p8.imprimir ();
		
		double distancia3 = p7.distanciaPontos(p8);
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.println ("A distancia do ponto 1 ate o 2 equivale a: " + distancia3);
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		
		p9 = new ponto ();
		p9.preencher ();
		p9.imprimir ();
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.println("A area do triangulo equivale a: " + p7.areaTriangulo (p8, p9));
		System.out.println ("----------------------------------------------------------------------------------------------------------");


	}

}
