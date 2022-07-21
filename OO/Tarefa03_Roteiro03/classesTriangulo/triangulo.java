package classesTriangulo;

import classesTriangulo.ponto;

public class triangulo {
	private ponto p1;
	private ponto p2;
	private ponto p3;
	
	public triangulo () {
		this.p1 = new ponto ();
		this.p2 = new ponto ();
		this.p3 = new ponto ();
	}
	
	public void setP1 (ponto p1) {
		this.p1 = p1;
	}
	
	public ponto getP1 () {
		return this.p1;
	}
	
	public void setP2 (ponto p2) {
		this.p2 = p2;
	}
	
	public ponto getP2 () {
		return this.p2;
	}
	
	public void setP3 (ponto p3) {
		this.p3 = p3;
	}
	
	public ponto getP3 () {
		return this.p3;
	}
	
	public void preencherTriangulo () {
		this.p1.preencherPonto();
		this.p2.preencherPonto();
		this.p3.preencherPonto();
	}
	
	public double determinante (ponto p1, ponto p2, ponto p3) {
		double parcela1 = p1.getX() * p2.getY() * 1 + p2.getX() * p3.getY() * 1 +
						  p1.getY() * 1 * p3.getX();
		
		double parcela2 = p3.getX() * p2.getY() * 1 + p2.getX() * p1.getY() * 1 +
						  p3.getY() * 1 * p1.getX();
		
		double det = parcela1 - parcela2;
		return det;
	}
	
	public boolean isColinear (ponto p1, ponto p2, ponto p3) {
		if (this.determinante (p1, p2, p3) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public double areaTriangulo (ponto p1, ponto p2, ponto p3) {
		double det = this.determinante(p1, p2, p3);
		double areaT = 0;
		if (det != 0) {
			areaT = det/2.0;
		}
		if (areaT < 0) {
			 areaT *= (-1);
		}
		return areaT;
	}
	
	public double perimetroTriangulo () {
		double lado1, lado2, lado3, perimetro;
		lado1 = p1.distanciaPontos(p2);
		lado2 = p1.distanciaPontos(p3);
		lado3 = p2.distanciaPontos(p3);
		perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}
	
	public void tipo () {
		double lado1, lado2, lado3;
		double area = this.areaTriangulo(p1, p2, p3);
		lado1 = p1.distanciaPontos(p2);
		lado2 = p1.distanciaPontos(p3);
		lado3 = p2.distanciaPontos(p3);
		if (area == 0) {
			System.out.println ("As coordenadas não formam um triângulo!");
		} else if (lado1 == lado2 && lado1 == lado3) {
			System.out.println("O triângulo é equilátero");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("O triângulo é isósceles");
		} else {
			System.out.println("O triângulo é escaleno");
		}
	}
	
	public void imprimirTriangulo () {
		System.out.println ("----------------------------------------------------------------------------------------------------------");
			this.p1.imprimirPonto();
			this.p2.imprimirPonto();
			this.p3.imprimirPonto();
	}
		
}

