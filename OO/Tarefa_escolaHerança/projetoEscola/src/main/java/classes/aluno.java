package classes;
import java.util.Scanner;

public class aluno extends Pessoa{
    private int matricula;
    private int anoIngresso;
	
    public aluno () {
        super();
        this.matricula = 0;
        this.anoIngresso = 0;
    }
	
    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }
	
    public int getMatricula () {
        return this.matricula;
    }
	
    public void setAnoIngresso (int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
	
    public int getAnoIngresso () {
        return this.anoIngresso;
    }
	
    @Override
    public void imprimir () {
        System.out.println("------------------------------ Aluno ---------------------------------------");
        super.imprimir();
        System.out.println ("Matrícula: " + this.getMatricula());
        System.out.println ("Ano de Ingresso: " + this.getAnoIngresso());
    }
        
    
    @Override
    public String imprimirParaString () {
        String saida;
        saida = "---------------------------- Aluno ----------------------------------- \n" 
        + super.imprimirParaString()
        +"Matrícula: " + this.matricula + " \n" 
        + "Ano de Ingresso: " + this.anoIngresso + " \n"
        + ("-------------------------------------------------------------------------------\n");
        
        return saida;
    }              
	
    @Override
    public void preencher () {
        Scanner ler = new Scanner (System.in);
        System.out.println("-------------------------- Preenchendo aluno ----------------------------------------");
        super.preencher();
        System.out.print ("Informe a matrícula: ");
        this.matricula = ler.nextInt();
        System.out.print ("Informe o ano de ingresso: ");
        this.anoIngresso = ler.nextInt();
    }
    
    public void copiar (aluno outro) {
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.matricula = outro.getMatricula();
        this.anoIngresso = outro.getAnoIngresso();
    }
    
    @Override
    public String cabecalho() {
        return super.cabecalho() + ";matricula;anoIngresso\n";
    }
    
    @Override
    public String atributoToCSV() {
        String aux = super.atributoToCSV() + this.matricula + ";" + this.anoIngresso + "\n";
        return aux;
    }
    
    public void CSVToAtributo(String csv) {
            String vetor [] = csv.split(";");
            this.nome = vetor[0];
            this.sexo = vetor[1];
            this.idade = Integer.parseInt(vetor[2]);
            this.matricula = Integer.parseInt(vetor[3]);
            this.anoIngresso = Integer.parseInt(vetor[4]);
        }

}



