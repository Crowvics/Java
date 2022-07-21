package com.mycompany.projetoescola;
import Gui.FrAluno;
import Gui.FrDisciplina;
import classes.disciplina;
import Gui.FrProfessor;


public class ProjetoEscola {
    public static void main(String[] args) {
        FrProfessor telaProfessor = new FrProfessor();
        telaProfessor.setVisible(true);
        FrAluno telaAluno = new FrAluno();
        telaAluno.setVisible(true);
        FrDisciplina telaDisciplina = new FrDisciplina();
        telaDisciplina.setVisible(true);
    }
    
}
