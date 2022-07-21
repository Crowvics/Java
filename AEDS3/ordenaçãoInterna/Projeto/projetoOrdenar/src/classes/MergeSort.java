package classes;

public class MergeSort{
    
    // Atributos:
    private int acesso, comparacao, troca;
    
    // Construtor:
    public MergeSort(){
        this.acesso = 0;
        this.comparacao = 0;
        this.troca = 0;
    }
    
    // Get - Acesso:
    public int getAcessoMerge(){
        return this.acesso;
    }
    
    // Get - Comparacao:
    public int getComparacaoMerge(){
        return this.comparacao;
    }
    
    // Get - Troca:
    public int getTrocaMerge(){
        return this.troca;
    }
    
    // Funcao:
    public void mergeSort(int vetor[], int n){
        comparacao++;
        if(n < 2){
            return;
        }
        int meio = n / 2;
        int e[] = new int[meio];
        int d[] = new int[n - meio];
        for(int i = 0; i < meio; i++){
            e[i] = vetor[i];
            acesso++;
        }
        for(int i = meio; i < n; i++){
            d[i - meio] = vetor[i];
            acesso++;
        }
        mergeSort(e, meio);
        mergeSort(d, n - meio);
        merge(vetor, e, d, meio, n - meio);
    }
    
    public void merge(int vetor[], int e[], int d[], int esquerda, int direita) {
        int i = 0, j = 0, k = 0;
        while (i < esquerda && j < direita){
            comparacao+=3;
            acesso++;
            troca++;
            if (e[i] <= d[j]){
                vetor[k++] = e[i++];
            }else{
                vetor[k++] = d[j++];
            }
        }
        while (i < esquerda){
            acesso++;
            comparacao++;
            troca++;
            vetor[k++] = e[i++];
        }
        while (j < direita){
            acesso++;
            comparacao++;
            troca++;
            vetor[k++] = d[j++];
        }
    }
    
}
