package classes;

public class InsertionSort {
    
    // Atributos:
    private int acesso, comparacao, insercao, troca;
    
    // Construtor:
    public InsertionSort(){
        this.acesso = 0;
        this.comparacao = 0;
        this.insercao = 0;
        this.troca = 0;
    }
    
    // Get - Acesso:
    public int getAcessoInsertion(){
        return this.acesso;
    }
    
    // Get - Comparacao:
    public int getComparacaoInsertion(){
        return this.comparacao;
    }
    
    // Get - Insercao:
    public int getInsercao(){
        return this.insercao;
    }
    
    // Get - Troca:
    public int getTrocaInsertion(){
        return this.troca;
    }
    
    // Função:
    public void insertionSort(int vetor[], int n){
        int aux = 0, j = 0;
        for (int i = 1; i < n; i++) {
            aux = vetor[i];
            acesso++;
            j = i - 1;
            while (j >= 0 && vetor [j] > aux) {
                vetor [j + 1] = vetor [j];
                comparacao+=2;
                acesso+=3;
                insercao++;
                j--;
            }
            vetor [j + 1] = aux;
            acesso++;
            troca++;
        }
    }
    
}
