package classes;

import java.util.Scanner;

public class professor extends Pessoa{
    private int cpf;
	
    public professor () {
        super();
        this.cpf = 0;
    }
	
    public void setCpf (int cpf) {
        this.cpf = cpf;
    }
	
    public int getCpf () {
        return this.cpf;
    }
	
    @Override
    public void preencher() {
        Scanner ler = new Scanner (System.in);
        System.out.println("-------------------------- Preenchendo professor -------------------------------------");
        super.preencher();
        System.out.print("Cpf: ");
        this.cpf = ler.nextInt();
    }
	
    @Override
    public void imprimir () {
        System.out.println("---------------------------- Professor -----------------------------------");
        super.imprimir();
        System.out.println ("Cpf: " + this.cpf);
    }
        
    @Override
    public String imprimirParaString () {
        String saida = " ";
        saida = "---------------------------- Professor ----------------------------------- \n"
        + super.imprimirParaString()
        + "Cpf: " + this.cpf + " \n" 
        + ("-------------------------------------------------------------------------------\n");
                                    
        return saida;
    }
    
    @Override
    public String cabecalho() {
        return super.cabecalho() + ";cpf\n";
    }
    
    @Override
    public String atributoToCSV() {
        String aux = super.atributoToCSV() + this.cpf + "\n";
        return aux;
    }
    
    public void CSVToAtributo(String csv) {
            String vetor [] = csv.split(";");
            this.nome = vetor[0];
            this.sexo = vetor[1];
            this.idade = Integer.parseInt(vetor[2]);
            this.cpf = Integer.parseInt(vetor[3]);
        }
	
    public void copiar (professor outro) {
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.cpf = outro.getCpf();
    }
}
