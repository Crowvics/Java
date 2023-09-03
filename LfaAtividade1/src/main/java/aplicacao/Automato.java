package aplicacao;

import java.util.List;


public class Automato {
    private int[][] matrizTransicao;
    private List<Integer> estadosFinais;

    public Automato(Arquivo arquivo) {
        this.matrizTransicao = arquivo.getMatrizTransicao();
        this.estadosFinais = arquivo.getEstadosFinais();
    }

    public boolean validarPalavra(String palavra) {
        int estadoAtual = 0;

        for (char letra : palavra.toCharArray()) {
            int coluna = letra - 'a'; // Supondo que as letras do alfabeto sejam a, b, c, ...

            if (coluna < 0 || coluna >= matrizTransicao[0].length) {
                // A letra não está no alfabeto esperado, rejeita a palavra
                return false;
            }

            int proximoEstado = matrizTransicao[estadoAtual][coluna];

            if (proximoEstado == -1) {
                // Encontrou uma transição que leva a um estado inválido, rejeita a palavra
                return false;
            }

            estadoAtual = proximoEstado;
        }

        // A palavra é aceita se o estado atual estiver na lista de estados finais
        return estadosFinais.contains(estadoAtual);
    }
}

   



