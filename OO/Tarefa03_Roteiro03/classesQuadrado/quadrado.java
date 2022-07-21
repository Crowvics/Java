package classesQuadrado;

import classesQuadrado.ponto;

public class quadrado {
	private ponto p1;
	private ponto p2;
	private ponto p3;
	private ponto p4;
	private double lado;

	public quadrado () {
		p1 = new ponto ();
		p2 = new ponto ();
		p3 = new ponto ();
		p4 = new ponto ();
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
	
	public void setP4 (ponto p4) {
		this.p4 = p4;
	}
	
	public ponto getP4 () {
		return this.p4;
	}
	
	//Método preencherQuadrado preenche as variáveis e já retorna se é um quadrado ou não no final
	public void preencherQuadrado () {
		this.p1.preencherPonto();
		this.p2.preencherPonto();
		this.p3.preencherPonto();
		this.p4.preencherPonto();
		System.out.println ("----------------------------------------------------------------------------------------------------------");
		tipo();
	}
	
	public void imprimirQuadrado () {
		System.out.println ("----------------------------------------------------------------------------------------------------------");
			this.p1.imprimirPonto();
			this.p2.imprimirPonto();
			this.p3.imprimirPonto();
			this.p4.imprimirPonto();
	}
	
	public double areaQuadrado () {
		return this.lado * this.lado;
	}
	
	public double perimetroQuadrado () {
		return this.lado * 4;
	}
	
	public void tipo () {
		double [] l = new double [6];
		int lado = 1, diagonal = 0;
		// Criação dos lados com todas as possibilidades
		l[0] = p1.distanciaPontos(p2);
		l[1] = p2.distanciaPontos(p3);
		l[2] = p3.distanciaPontos(p4);
		l[3] = p4.distanciaPontos(p1);
		l[4] = p2.distanciaPontos(p4);
		l[5] = p1.distanciaPontos(p3);
		
		/*
		 * Laço para comparar os lados, considerando as coordenadas digitadas sendo um quadrado, caso l[0] começar como 
		 * diagonal vai retornar 4 diagonais e 2 lados, caso começar como lado vai retornar 4 lados e 2 diagonais. Lado 
		 * já inicia com 1 para contar a si próprio
		*/
		for (int i = 1; i < 6; i++) {
			if (l[0] == l[i]) {
				lado ++;
			} else {
				diagonal ++;
			}
		}
		
		//Comparação para determinar se os pontos digitados formam ou não um quadrado
		
		if (lado == 4 && diagonal == 2 || diagonal == 4 && lado == 2) {
			System.out.println("A figura é um quadrado");
		} else {
			System.out.println ("A figura não forma um quadrado!");
		}
		
		//Comparação para determinar o lado do quadrado e não a diagonal para fórmulas de área e perímetro
		if (lado == 4) {
			this.lado = l[0];
		} else {
			this.lado = l[1];
		}
	
	}
}
