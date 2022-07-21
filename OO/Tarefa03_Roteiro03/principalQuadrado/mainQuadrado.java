package principalQuadrado;

import classesQuadrado.quadrado;
import classesQuadrado.ponto;

public class mainQuadrado {

	public static void main(String[] args) {
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		quadrado q1;
		q1 = new quadrado ();
		q1.preencherQuadrado();
		q1.imprimirQuadrado ();
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.println ("O valor da área é de: " + q1.areaQuadrado());
		System.out.println ("O valor do perímetro é de: " + q1.perimetroQuadrado());
		System.out.println ("----------------------------------------------------------------------------------------------------------");

	}

}
