package classesCarro;

import java.util.Scanner;

public class Roda {
	private double raio;
	private String material;
	private double peso;
	private double suporteMax;
	
	public Roda (){
		this.raio = 0.0;
		this.material = "";
		this.peso = 0.0;
		this.suporteMax = 0.0;
	}
	
	public void setRaio (double raio) {
		this.raio = raio;
	}
	
	public double getRaio () {
		return this.raio;
	}
	
	public void setMaterial (String material) {
		this.material = material;
	}
	
	public String getMaterial () {
		return this.material;
	}
	
	public void setPeso (double peso) {
		this.peso = peso;
	}
	
	public double getPeso () {
		return this.peso;
	}
	
	public void setSuporteMax (double suporteMax) {
		this.suporteMax = suporteMax;
	}
	
	public double getSuporteMax () {
		return this.suporteMax;
	}
	
	public void preencherRoda () {
		Scanner ler = new Scanner (System.in);
		System.out.println ("--------------------------------- Preenchimento da Roda ---------------------------------");
		System.out.print ("Digite o valor do raio da roda: ");
		this.setRaio(ler.nextDouble());
		System.out.print ("Digite o material da roda: ");
		this.setMaterial(ler.next());
		System.out.print("Digite o peso da roda: ");
		this.setPeso(ler.nextDouble());
		System.out.print("Digite o suporte máximo da roda: ");
		this.setSuporteMax(ler.nextDouble());
	}
	
	public void copiarRoda (Roda outra) {
		this.setRaio(outra.getRaio());
		this.setMaterial(outra.getMaterial());
		this.setPeso(outra.getPeso());
		this.setSuporteMax(outra.getSuporteMax());
	}
	
	public void imprimirRoda () {
		System.out.println ("--------------------------------- Impressão da Roda ---------------------------------");
		System.out.println ("Raio: " + this.getRaio ());
		System.out.println ("Material: " + this.getMaterial ());
		System.out.println("Peso: " + this.getPeso());
		System.out.println ("Suporte Máximo: " + this.getSuporteMax());
	}
}
