package classes;
import classes.aluno;
import classes.professor;
import java.util.Scanner;

public class disciplina {
    private String nome;
    private int semestre;
    private String horario;
    private professor ministrante;
    private aluno [] listaAlunos;
	
    public disciplina () {
        this.nome = "";
        this.semestre = 0;
        this.horario = "0 h";
        this.ministrante = new professor ();
        this.listaAlunos = new aluno [2];
        for (int i = 0; i < 2; i++) {
            this.listaAlunos[i] = new aluno ();
        }
    }
	
    public void setNome (String nome) {
        this.nome = nome;
    }
	
    public String getNome () {
        return this.nome;
    }
	
    public void setSemestre (int semestre) {
        this.semestre = semestre;
    }
	
    public int getSemestre () {
        return this.semestre;
    }
	
    public void setHorario (String horario) {
        this.horario = horario;
    }
	
    public String getHorario () {
        return this.horario;
    }
	
    public void setMinistrante (professor ministrante) {
        this.ministrante = ministrante;
    }
	
    public professor getMinistrante () {
        return this.ministrante;
    }
	
    public void setAluno (aluno [] listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
	
    public aluno [] getListaAlunos () {
        return this.listaAlunos;
    }
	
    public void imprimirDisciplina () {
        System.out.println("---------------------------- Disciplina ------------------------------------");
        System.out.println ("Nome: " + this.nome);
        System.out.println ("Semestre: " + this.semestre);
        System.out.println ("Horário: " + this.horario);
        this.ministrante.imprimirProfessor();
        for(int i = 0; i < 2; i++) {
        this.listaAlunos[i].imprimirAluno();
        }
    }
    
    public String imprimirDisciplinaParaString () {
        String saida = " ";
        saida = "------------------------------ Disciplina --------------------------------------- \n"
        + "Nome: " + this.nome + " \n"
        + "Semestre: " + this.semestre + " \n"
        + "Horário: " + this.horario + " \n";
        
        return saida;
    }              
	
    public void preencherDisciplina () {
        Scanner ler = new Scanner (System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.print ("Informe o nome da disciplina: ");
        this.nome = ler.next();
        System.out.print ("Informe o semestre: ");
        this.semestre = ler.nextInt();
        System.out.print ("Informe o horário: ");
        this.horario = ler.next();
        this.ministrante.preencherProfessor();
        for (int i = 0; i < 2; i++) {
            this.listaAlunos[i].preencherAluno();
        }
    }
	
    public void copiarDisciplina (disciplina outra) {
        this.nome = outra.getNome();
        this.semestre = outra.getSemestre();
        this.horario = outra.getHorario();
        this.ministrante.copiarProfessor(outra.getMinistrante());
        for (int i = 0; i < 2; i++) {
            this.listaAlunos[i].copiarAluno(outra.getListaAlunos()[i]);
        }
    }
    
    public String cabecalho() {
        return "Nome;semestre;horario\n";
    }
    
    public String atributoToCSV() {
        String aux = this.nome + ";" + this.semestre + ";" + this.horario + "\n";
        return aux;
    }
    
    public void CSVToAtributo(String csv) {
            String vetor [] = csv.split(";");
            this.nome = vetor[0];
            this.semestre = Integer.parseInt(vetor[1]);
            this.horario = vetor[2];
        }
}