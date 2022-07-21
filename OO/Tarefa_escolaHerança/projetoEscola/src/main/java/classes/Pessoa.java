package classes;

import java.util.Scanner;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void imprimir () {
        System.out.println ("Nome: " + this.getNome());
        System.out.println ("Idade: " + this.getIdade());
        System.out.println ("Sexo: " + this.getSexo());
    }
    
    public void preencher () {
        Scanner ler = new Scanner (System.in);
        System.out.print ("Informe o nome: ");
        this.nome = ler.next();
        System.out.print ("Informe a idade: ");
        this.idade = ler.nextInt();
        System.out.print ("Informe o sexo: ");
        this.sexo = ler.next();
    }
    
    public String imprimirParaString () {
        String saida;
        saida = "Nome: " + this.nome + " \n"
        + "Idade: " + this.idade + " \n"
        + "Sexo: " + this.sexo + " \n";
        return saida;
    }
    
    public String cabecalho() {
         return "Nome;sexo;idade";
    }
    
    public String atributoToCSV() {
        String aux = this.nome + ";" + this.sexo + ";" + this.idade + ";";
        return aux;
    }
    
}
