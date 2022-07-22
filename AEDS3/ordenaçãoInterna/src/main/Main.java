/*************************************************************/
/* Aluno: Joao Francisco da Silva Franco                     */
/* Matricula: 2021008720                                     */
/* Curso: Ciencia da Computacao                              */
/* 1o Trabalho Pratico -- Ordenacao Interna                  */
/* DCC288 -- 2022 -- IFSEMG, 3o                              */
/*  Prof. Flavio Augusto de Freitas                          */
/* Compilador: Apache NetBeans 13                            */
/* Sistema Operacional: Windows 10                           */
/*************************************************************/

package main;

import classes.Valores;

public class Main{
    
    // Funcao:
    public static void main(String[] args){
        
        // Instancias:
        Valores valoresOG = new Valores();
        Valores valoresIS = new Valores();
        Valores valoresMS = new Valores();
        Valores valoresQS = new Valores();
        Valores valoresRS = new Valores();
        
        // Copia:
        valoresIS.copiar(valoresOG);
        valoresMS.copiar(valoresOG);
        valoresQS.copiar(valoresOG);
        valoresRS.copiar(valoresOG);
        
        // Impressao:
        valoresOG.imprimeVetor(valoresOG.getVetor(), 20);
        valoresIS.ordenaVetorInsertionSort(valoresIS.getVetor(), 20);
        valoresMS.ordenaVetorMergeSort(valoresMS.getVetor(), 20);
        valoresQS.ordenaVetorQuickSort(valoresQS.getVetor(), 20);
        valoresRS.imprimeResultados();
    }
    
}
