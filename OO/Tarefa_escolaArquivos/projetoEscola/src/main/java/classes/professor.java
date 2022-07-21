package classes;

import java.util.Scanner;

public class professor {
    private String nome;
    private String sexo;
    private int idade;
    private int cpf;
	
    public professor () {
        this.nome = "";
        this.sexo = "";
        this.idade = 0;
        this.cpf = 0;
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
	
    public void setCpf (int cpf) {
        this.cpf = cpf;
    }
	
    public int getCpf () {
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
        this.cpf = ler.nextInt();
    }
	
    public void imprimirProfessor () {
        System.out.println("---------------------------- Professor -----------------------------------");
        System.out.println ("Nome: " + this.nome);
        System.out.println ("Sexo: " + this.sexo);
        System.out.println ("Idade: " + this.idade);
        System.out.println ("Cpf: " + this.cpf);
    }
        
    public String imprimirProfessorParaString () {
        String saida = " ";
        saida = "---------------------------- Professor ----------------------------------- \n"
        + "Nome: " + this.nome + " \n"
        + "Sexo: "  + this.sexo + " \n"
        + "Idade: " + this.idade + " \n"
        + "Cpf: " + this.cpf + " \n" 
        + ("-------------------------------------------------------------------------------\n");
                                    
        return saida;
    }
    
    public String cabecalho() {
        return "Nome;sexo;idade;cpf\n";
    }
    
    public String atributoToCSV() {
        String aux = this.nome + ";" + this.sexo + ";" + this.idade + ";" + this.cpf + "\n";
        return aux;
    }
    
    public void CSVToAtributo(String csv) {
            String vetor [] = csv.split(";");
            this.nome = vetor[0];
            this.sexo = vetor[1];
            this.idade = Integer.parseInt(vetor[2]);
            this.cpf = Integer.parseInt(vetor[3]);
        }
	
    public void copiarProfessor (professor outro) {
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.cpf = outro.getCpf();
    }
}
