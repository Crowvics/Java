package classesQuadrado;

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
	
	public void imprimirPonto () {
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
	
	public void preencherPonto () {
		Scanner ler = new Scanner (System.in);
		System.out.println ("Informe os dados do Quadrado");
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		System.out.print ("Valor de x: ");
		this.setX(ler.nextDouble());
		System.out.print ("Valor de y: ");
		this.setY(ler.nextDouble());
	}
}
