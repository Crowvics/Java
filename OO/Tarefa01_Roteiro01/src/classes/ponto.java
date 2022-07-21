package classes;

import java.util.Scanner;

public class ponto {
	private double x;
	private double y;

	public ponto () {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public double getX () {
		return this.x;
	}
	
	public void setX (double x) {
		this.x = x;
	}
	
	public double getY () {
		return this.y;
	}
	
	public void setY (double y) {
		this.y = y;
	}
	
	public void imprimir () {
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.println ("Valor de x: " + this.x + " | Valor de y: " + this.y);
		
	}
	
	public double distanciaPontos (ponto outro) {
		double deltaX = outro.getX () - this.x;
		double deltaY = outro.getY () - this.y;
		deltaX = Math.pow(deltaX, 2);
		deltaY = Math.pow(deltaY, 2);
		double distancia = Math.sqrt(deltaX + deltaY);
		return distancia;
	}
	
	public double determinante (ponto p2, ponto p3) {
		double parcela1 = this.x * p2.getY() * 1 + p2.getX() * p3.getY() * 1 +
						  this.y * 1 * p3.getX();
		
		double parcela2 = p3.getX() * p2.getY() * 1 + p2.getX() * this.y * 1 +
						  p3.getY() * 1 * this.x;
		
		double det = parcela1 - parcela2;
		return det;
	}
	
	public boolean isColinear (ponto p2, ponto p3) {
		if (this.determinante (p2, p3) == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public double areaTriangulo (ponto p2, ponto p3) {
		double det = this.determinante(p2, p3);
		double areaT = 0;
		if (det != 0) {
			areaT = det/2.0;
		}
		if (areaT < 0) {
			 areaT *= (-1);
		}
		return areaT;
	}
	
	public void preencher () {
		Scanner ler = new Scanner (System.in);
		System.out.println ("Informe os dados do triangulo");
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.print ("Valor de x: ");
		this.x = ler.nextDouble ();
		System.out.print ("Valor de y: ");
		this.y = ler.nextDouble ();
	}
}


