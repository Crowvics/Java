package classes;

public class QuickSort{
    
    // Atributos:
    private int acesso, comparacao, troca, selecaoPivo;
    
    // Construtor:
    public QuickSort(){
        this.acesso = 0;
        this.comparacao = 0;
        this.troca = 0;
        this.selecaoPivo = 0;
    }
    
    // Get - Acesso:
    public int getAcessoQuick(){
        return this.acesso;
    }
    
    // Get - Comparacao:
    public int getComparacaoQuick(){
        return this.comparacao;
    }
    
    
    // Get - Troca:
    public int getTrocaQuick(){
        return this.troca;
    }
    
    // Get - Selecao de Pivô:
    public int getSelecaoPivo(){
        return this.selecaoPivo;
    }
    
    // Função:
    public void quickSort (int vetor[], int n){
        int inicio = 0;
        quick(vetor, inicio, n-1);
    }
    
    private void quick(int vetor[], int inicio, int n){
        this.comparacao++;
	if(inicio < n){
            int p = particao(vetor, inicio, n);
            quick(vetor, inicio, p);
            quick(vetor, p + 1, n);
        }
    }
    
    public int particao(int vetor[], int inicio, int n){
        int meio = (int) (inicio + n) / 2;
        int pivot = vetor[meio];
        this.selecaoPivo++;
        this.acesso++;
        int i = inicio - 1;
        int j = n + 1;
        while(true){
            do{
                i++;
                this.comparacao++;
                this.acesso++;
                }while(vetor[i] < pivot);
            do{
                j--;
                this.comparacao++;
                this.acesso++;
            }while(vetor[j] > pivot);
            if(i >= j){
                return j;
            }
            this.comparacao+=2;
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
            this.troca++;
            this.acesso += 4;
        }
    }
    
}
