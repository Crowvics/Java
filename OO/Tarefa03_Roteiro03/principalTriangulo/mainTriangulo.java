package principalTriangulo;

import classesTriangulo.triangulo;
import classesTriangulo.ponto;

public class mainTriangulo {

	public static void main(String[] args) {
	System.out.println ("----------------------------------------------------------------------------------------------------------");
		triangulo t1;
		t1 = new triangulo ();
		t1.preencherTriangulo();
		t1.imprimirTriangulo ();
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.println ("O valor da área é de: " + t1.areaTriangulo(t1.getP1(), t1.getP2(), t1.getP3()));
		System.out.println ("O valor do perímetro é de: " + t1.perimetroTriangulo());
		t1.tipo();
		System.out.println ("----------------------------------------------------------------------------------------------------------");
	}
}
