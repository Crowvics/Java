package com.mycompany.projetoescola;
import classes.disciplina;
import Gui.FrProfessor;

public class ProjetoEscola {
    public static void main(String[] args) {
        disciplina calculo = new disciplina ();
        calculo.preencherDisciplina();
        calculo.imprimirDisciplina();
        FrProfessor tela = new FrProfessor ();
        tela.setVisible(true);
    }
    
}
