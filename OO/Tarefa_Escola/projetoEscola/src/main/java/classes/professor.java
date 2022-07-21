package classes;

import java.util.Scanner;

public class professor {
	private String nome;
	private String sexo;
	private int idade;
	private String cpf;
	
	public professor () {
		this.nome = "";
		this.sexo = "";
		this.idade = 0;
		this.cpf = "000.000.000-00";
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome () {
		return this.nome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public int getIdade () {
		return this.idade;
	}
	
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf () {
		return this.cpf;
	}
	
	public void preencherProfessor () {
		Scanner ler = new Scanner (System.in);
		System.out.println("-------------------------------------------------------------------");
		System.out.println ("Informe os dados do professor");
		System.out.print("Nome: ");
		this.nome = ler.next();
		System.out.print("Sexo: ");
		this.sexo = ler.next();
		System.out.print("Idade: ");
		this.idade = ler.nextInt();
		System.out.print("Cpf: ");
		this.cpf = ler.next();
	}
	
	public void imprimirProfessor () {
		System.out.println("---------------------------- Professor -----------------------------------");
		System.out.println ("Nome: " + this.nome);
		System.out.println ("Sexo: " + this.sexo);
		System.out.println ("Idade: " + this.idade);
		System.out.println ("Cpf: " + this.cpf);
	}
	
	public void copiarProfessor (professor outro) {
		this.nome = outro.getNome();
		this.sexo = outro.getSexo();
		this.idade = outro.getIdade();
		this.cpf = outro.getCpf();
	}

}
