package classes;

import classes.InsertionSort;
import classes.MergeSort;
import classes.QuickSort;

public class Valores {
    
    // Atributo:
    private int vetor[];
    private InsertionSort iS;
    private MergeSort mS;
    private QuickSort qS;
    private InsertionSort iS5K;
    private MergeSort mS5K;
    private QuickSort qS5K;
    private InsertionSort iS10K;
    private MergeSort mS10K;
    private QuickSort qS10K;
    private InsertionSort iS30K;
    private MergeSort mS30K;
    private QuickSort qS30K;
    
    // Construtor:
    public Valores(){
        this.vetor = new int[30000];
        // Preenchimento:
        for (int i = 0; i < this.vetor.length; i++){
            this.vetor[i] = (int) (Math.random() * this.vetor.length);
        }
        this.iS = new InsertionSort();
        this.mS = new MergeSort();
        this.qS = new QuickSort();
        this.iS5K = new InsertionSort();
        this.mS5K = new MergeSort();
        this.qS5K = new QuickSort();
        this.iS10K = new InsertionSort();
        this.mS10K = new MergeSort();
        this.qS10K = new QuickSort();
        this.iS30K = new InsertionSort();
        this.mS30K = new MergeSort();
        this.qS30K = new QuickSort();
    }
    
    // Get - Vetor:
    public int [] getVetor(){
        return this.vetor;
    }
    
    // Set - Vetor:
    public void preencherAtributo(int vetor[]){
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }
    }
    
    // Copiar - Vetor:
    public void copiar(Valores copia){
        this.vetor = copia.getVetor();
    }
    
    // Get - Insertion Sort:
    public InsertionSort getInsertionSort(){
        return iS;
    }
    
    // Get - Merge Sort:
    public MergeSort getMergeSort(){
        return mS;
    }
    
    // Get - Quick Sort:
    public QuickSort getQuickSort(){
        return qS;
    }
    
    // Get - Insertion Sort 5K:
    public InsertionSort getInsertionSort5K(){
        return iS5K;
    }
    
    // Get - Merge Sort 5K:
    public MergeSort getMergeSort5K(){
        return mS5K;
    }
    
    // Get - Quick Sort 5K:
    public QuickSort getQuickSort5K(){
        return qS5K;
    }
    
    // Get - Insertion Sort 10K:
    public InsertionSort getInsertionSort10K(){
        return iS10K;
    }
    
    // Get - Merge Sort 10K:
    public MergeSort getMergeSort10K(){
        return mS10K;
    }
    
    // Get - Quick Sort 10K:
    public QuickSort getQuickSort10K(){
        return qS10K;
    }
    
    // Get - Insertion Sort 30K:
    public InsertionSort getInsertionSort30K(){
        return iS30K;
    }
    
    // Get - Merge Sort 30K:
    public MergeSort getMergeSort30K(){
        return mS30K;
    }
    
    // Get - Quick Sort 30K:
    public QuickSort getQuickSort30K(){
        return qS30K;
    }
    
    // Imprimir - Vetor:
    public void imprimeVetor (int vetor[], int n){
        System.out.println("[NAO ORDENADO - VETOR DE " + n + " POSICOES]:");
        for (int i = 0; i < n; i++){
            System.out.println("- Posicao " + (i+1) + ": " + this.vetor[i]);
        }
        System.out.println();
    }
    
    // Insertion Sort:
    public void ordenaVetorInsertionSort(int vetor[], int n){
        System.out.println("[INSERTION SORT - VETOR " + n + " POSICOES]:");
        iS.insertionSort(this.vetor, n);
        for(int i = 0; i < n; i++){
            System.out.println("- Posicao " + (i+1) + ": " + this.vetor[i]);
        }
        System.out.println();
    }
    
    // Merge Sort:
    public void ordenaVetorMergeSort(int vetor[], int n){
        System.out.println("[MERGE SORT - VETOR " + n + " POSICOES]:");
        mS.mergeSort(this.vetor, n);
        for(int i = 0; i < n; i++){
            System.out.println("- Posicao " + (i+1) + ": " + this.vetor[i]);
        }
        System.out.println();
    }
    
    // Quick Sort:
    public void ordenaVetorQuickSort(int vetor[], int n){
        System.out.println("[QUICK SORT - VETOR " + n + " POSICOES]:");
        qS.quickSort(this.vetor, n);
        for(int i = 0; i < n; i++){
            System.out.println("- Posicao " + (i+1) + ": " + this.vetor[i]);
        }
        System.out.println();
    }
    
    // Tabela de Resultados:
    public void imprimeResultados (){
        
        // Tempo Insertion Sort - 5K:
        long tempoCincoInsertion = System.nanoTime();
        iS5K.insertionSort(this.vetor, 5000);
        tempoCincoInsertion = System.nanoTime()- tempoCincoInsertion;
        float converterCincoInsertion = tempoCincoInsertion/(float)1000000;
        
        // Tempo Insertion Sort - 10K:
        long tempoDezInsertion = System.nanoTime();
        iS10K.insertionSort(this.vetor, 10000);
        tempoDezInsertion = System.nanoTime()- tempoDezInsertion;
        float converterDezInsertion = tempoDezInsertion/(float)1000000;
        
        // Tempo Insertion Sort - 30K:
        long tempoTrintaInsertion = System.nanoTime();
        iS30K.insertionSort(this.vetor, 30000);
        tempoTrintaInsertion = System.nanoTime()- tempoTrintaInsertion;
        float converterTrintaInsertion = tempoTrintaInsertion/(float)1000000;
        
        // Tempo Merge Sort - 5K:
        long tempoCincoMerge = System.nanoTime();
        mS5K.mergeSort(this.vetor, 5000);
        tempoCincoMerge = System.nanoTime()- tempoCincoMerge;
        float converterCincoMerge = tempoCincoMerge/(float)1000000;
        
        // Tempo Merge Sort - 10K:
        long tempoDezMerge = System.nanoTime();
        mS10K.mergeSort(this.vetor, 10000);
        tempoDezMerge = System.nanoTime()- tempoDezMerge;
        float converterDezMerge = tempoDezMerge/(float)1000000;
        
        // Tempo Merge Sort - 30K:
        long tempoTrintaMerge = System.nanoTime();
        mS30K.mergeSort(this.vetor, 30000);
        tempoTrintaMerge = System.nanoTime()- tempoTrintaMerge;
        float converterTrintaMerge = tempoTrintaMerge/(float)1000000;
        
        // Tempo Quick Sort - 5K:
        long tempoCincoQuick = System.nanoTime();
        qS5K.quickSort(this.vetor, 5000);
        tempoCincoQuick = System.nanoTime()- tempoCincoQuick;
        float converterCincoQuick = tempoCincoQuick/(float)1000000;
        
        // Tempo Quick Sort - 10K:
        long tempoDezQuick = System.nanoTime();
        qS10K.quickSort(this.vetor, 10000);
        tempoDezQuick = System.nanoTime()- tempoDezQuick;
        float converterDezQuick = tempoDezQuick/(float)1000000;
        
        // Tempo Quick Sort - 30K:
        long tempoTrintaQuick = System.nanoTime();
        qS30K.quickSort(this.vetor, 30000);
        tempoTrintaQuick = System.nanoTime()- tempoTrintaQuick;
        float converterTrintaQuick = tempoTrintaQuick/(float)1000000;
    	
        // Impressao da Tabela:
        System.out.println("         ORDENACAO                                         VETOR");
        System.out.println("----------------------  -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("METODO           TEMPO TOTAL  (ms)	                    ACESSOS	                             COMPARACOES	                       TROCAS                               OUTROS");
        System.out.println("            5000      10000      30000           5000        10000        30000             5000        10000        30000             5000        10000         30000            5000       10000        30000");
        System.out.println ("========= ========  =========  =========      ===========  ===========  ===========      ===========  ===========  ===========      ===========  ===========  ===========     ===========  ===========  ===========   ");
        System.out.println ("Insertion  " +  (Math.round(converterCincoInsertion*100.0)/100.0) + "      " + (Math.round(converterDezInsertion*100.0)/100.0) + "      " + (Math.round(converterTrintaInsertion*100.0)/100.0) +  
        "         " + iS5K.getAcessoInsertion() +  "     " + iS10K.getAcessoInsertion() +  "     " + iS30K.getAcessoInsertion() + "       " + iS5K.getComparacaoInsertion() +  "     " + iS10K.getComparacaoInsertion()
        +  "     " + iS30K.getComparacaoInsertion() + "          " + iS5K.getTrocaInsertion() + "         " + iS10K.getTrocaInsertion() +  "         " + iS30K.getTrocaInsertion() + "          " + iS5K.getInsercao() +  
        "     " + iS10K.getInsercao() +  "     " + iS30K.getInsercao() + "   [INSERCOES] ");
        
        System.out.println ("Merge      "  +  (Math.round(converterCincoMerge*100.0)/100.0) + "       " + (Math.round(converterDezMerge*100.0)/100.0) + "       " + (Math.round(converterTrintaMerge*100.0)/100.0) +  
        "           " + mS5K.getAcessoMerge() +  "       " + mS10K.getAcessoMerge() +  "       " + mS30K.getAcessoMerge() + "          " + mS5K.getComparacaoMerge() +  "        " + mS10K.getComparacaoMerge() +  
        "        " + mS30K.getComparacaoMerge() + "          " + 
        mS5K.getTrocaMerge() + "         " + mS10K.getTrocaMerge() +  "      " + mS30K.getTrocaMerge() );
        
        System.out.println ("Quick      " + (Math.round(converterCincoQuick*100.0)/100.0) + "       " + (Math.round(converterDezQuick*100.0)/100.0) + "       " + (Math.round(converterTrintaQuick*100.0)/100.0) +  
        "            " + qS5K.getAcessoQuick() +  "        " + qS10K.getAcessoQuick() +  "      " + qS30K.getAcessoQuick() + "           " + qS5K.getComparacaoQuick() +  "       " + qS10K.getComparacaoQuick() +  
        "        " + qS30K.getComparacaoQuick() + "            " + 
        qS5K.getTrocaQuick() + "         " + qS10K.getTrocaQuick() +  "        " + qS30K.getTrocaQuick() + "            " +  qS5K.getSelecaoPivo() + "        " + qS10K.getSelecaoPivo() +  "         " + qS30K.getSelecaoPivo() +
        "      [PIVOS SELECIONADOS]");
    }
    
}
