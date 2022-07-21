package classes;
import java.util.Scanner;

public class aluno {
                  private String nome;
	private int idade;
	private String sexo;
	private String matricula;
	private int anoIngresso;
	
	public aluno () {
		this.nome = "";
		this.idade = 0;
		this.sexo = "";
		this.matricula = "00000";
		this.anoIngresso = 0;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public int getIdade () {
		return this.idade;
	}
	
	public void setSexo (String sexo) {
		this.sexo = sexo;
	}
	
	public String getSexo () {
		return this.sexo;
	}
	
	public void setMatricula (String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula () {
		return this.matricula;
	}
	
	public void setAnoIngresso (int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	public int getAnoIngresso () {
		return this.anoIngresso;
	}
	
	public void imprimirAluno () {
		System.out.println("------------------------------ Aluno ---------------------------------------");
		System.out.println ("Nome: " + this.getNome());
		System.out.println ("Idade: " + this.getIdade());
		System.out.println ("Sexo: " + this.getSexo());
		System.out.println ("Matrícula: " + this.getMatricula());
		System.out.println ("Ano de Ingresso: " + this.getAnoIngresso());
	}
	
	public void preencherAluno () {
		Scanner ler = new Scanner (System.in);
		System.out.println("-------------------------------------------------------------------");
		System.out.print ("Informe o nome do aluno: ");
		this.nome = ler.next();
		System.out.print ("Informe a idade do aluno: ");
		this.idade = ler.nextInt();
		System.out.print ("Informe o sexo do aluno: ");
		this.sexo = ler.next();
		System.out.print ("Informe a matrícula do aluno: ");
		this.matricula = ler.next();
		System.out.print ("Informe o ano de ingresso do aluno: ");
		this.anoIngresso = ler.nextInt();
	}
	public void copiarAluno (aluno outro) {
		this.nome = outro.getNome();
		this.sexo = outro.getSexo();
		this.idade = outro.getIdade();
		this.matricula = outro.getMatricula();
		this.anoIngresso = outro.getAnoIngresso();
	}
}



