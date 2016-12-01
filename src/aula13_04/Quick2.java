/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula13_04;

/**
 *
 * @author lab1503
 */
public class Quick2 {
    static int[] intvet = new int[7];
    
    public static void main(String[] args) 
    {
            
            intvet[0] = 3;
            intvet[1] = 6;
            intvet[2] = 7;
            intvet[3] = 10;
            intvet[4] = 8;        
            intvet[5] = 11;       
            intvet[6] = 90;  
            System.out.println("inicio");
            for(int i =0 ;i<intvet.length;i++)
                System.out.print(" " + intvet[i]);
            
            recQuickSort(0,intvet.length-1);

            
            System.out.println("\nfinal");
            
            for(int i =0 ;i<intvet.length;i++)
                System.out.print(" " + intvet[i]);
            
        
    }
    public static void recQuickSort(int left, int right)
    {
        //comparacao
        if(right-left <= 0) // if tamanho <=1
            return; // ja ordenado
        else // senao eh maior
        {
            long pivot = intvet[right]; //escolhe pivo
            
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1); // ordena do lado esquerdo
            recQuickSort(partition+1, right); // ordenado do lado diretio
        }
    } 
     public static void swap(int dex1, int dex2) // troca dois elementos
    {
        //troca
        int temp = intvet[dex1]; // A para temp
        intvet[dex1] = intvet[dex2]; // B para A
        intvet[dex2] = temp; // temp para B
    } // fim swap
     public static int partitionIt(int left, int right, long pivot)
{
    int leftPtr = left-1; // esquerdo
    int rightPtr = right; // direito
    while(true)
    { // encontra o maior item 
        while( intvet[++leftPtr] > pivot )//MUODU SINAL 
        ; 
        // encontra o menor
        while(rightPtr > 0 && intvet[--rightPtr] < pivot)//MUODU SINAL DA 2 VALIDAÇÃO
        ; 
        //compacao
        if(leftPtr >= rightPtr) // se existe maior,
            break; // particção realizada
        else // nao existe
            swap(leftPtr, rightPtr); // troca elementos
    } // fim while(true)
    
    swap(leftPtr, right); // volta pivo
    return leftPtr; // retorna o pivo
    } 
}
