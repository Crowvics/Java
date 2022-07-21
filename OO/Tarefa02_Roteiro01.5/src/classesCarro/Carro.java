package classesCarro;
import java.util.Scanner;
import classesCarro.Roda;

public class Carro {
	private String fabricante;
	private String modelo;
	private double motor;
	private String cor;
	private Roda [] roda;
	
	public Carro (){
		this.fabricante = "";
		this.modelo = "";
		this.motor = 0.0;
		this.cor = "";
		this.roda = new Roda [4];
		for (int i = 0; i <= 3; i++) {
			roda [i] = new Roda ();
		}
	
	}
	
	public void setFabricante (String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getFabricante () {
		return this.fabricante;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo () {
		return this.modelo;
	}
	
	public void setMotor (double motor) {
		this.motor = motor;
	}
	
	public double getMotor () {
		return this.motor;
	}
	
	public void setCor (String cor) {
		this.cor = cor;
	}
	
	public String getCor () {
		return this.cor;
	}
	
	public void setRoda (Roda [] roda) {
		this.roda = roda;
	}
	
	public Roda [] getRoda () {
		return this.roda;
	}
	
	public void preencherCarro () {
		Scanner ler = new Scanner (System.in);
		System.out.println ("--------------------------------- Preenchimento do Carro ---------------------------------");
		System.out.print ("Digite o fabricante do carro: ");
		this.setFabricante(ler.next());
		System.out.print ("Digite o modelo do carro: ");
		this.setModelo(ler.next());
		System.out.print("Digite o motor do carro: ");
		this.setMotor(ler.nextDouble());
		System.out.print("Digite a cor do carro: ");
		this.setCor(ler.next());
		for (int i = 0; i <= 3; i++) {
			this.roda[i].preencherRoda();
		}
	}
	
	public void copiarCarro (Carro outro) {
		this.setFabricante(outro.getFabricante());
		this.setModelo(outro.getModelo());
		this.setMotor(outro.getMotor());
		this.setCor(outro.getCor());
		for (int i = 0; i <= 3; i++) {
			this.roda[i].copiarRoda(outro.getRoda()[i]);
		}
	}
	
	
	
	public void imprimirCarro () {
		System.out.println ("--------------------------------- Impressão do Carro ---------------------------------");
		System.out.println ("Fabricante: " + this.getFabricante ());
		System.out.println ("Modelo: " + this.getModelo ());
		System.out.println("Motor: " + this.getMotor());
		System.out.println ("Cor: " + this.getCor());
		for (int i = 0; i <= 3; i++) {
			this.roda[i].imprimirRoda();
		}
	}
	
	
}
