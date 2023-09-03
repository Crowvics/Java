package com.mycompany.lfaatividade1;

import aplicacao.Arquivo;
import aplicacao.Automato;

public class LfaAtividade1 {

    public static void main(String[] args) {
        // Crie um objeto Arquivo com o nome do arquivo desejado (por exemplo, "MatrizTransicao.txt")
        Arquivo arquivo = new Arquivo("C:/Users/victo/OneDrive/Documentos/NetBeansProjects/LfaAtividade1/src/main/java/automatos/automato3.csv");


        
        // Crie um objeto Automato com base no objeto Arquivo
        Automato automato = new Automato(arquivo);

        // Palavra a ser testada
        String palavraTeste = "0111";

        // Use o método validarPalavra para verificar se a palavra é aceita pelo autômato
        boolean aceita = automato.validarPalavra(palavraTeste);

        // Imprima o resultado
        if (aceita) {
            System.out.println("A palavra \"" + palavraTeste + "\" é aceita.");
        } else {
            System.out.println("A palavra \"" + palavraTeste + "\" é rejeitada.");
        }
    }
}
