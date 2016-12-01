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
public class Merge1 {
  
    
    public static void main(String[] args)
    {
        int[] intVet = new int[]{10,15,13,9,8,3,55,90,11,-1};
        int[] intVet2 = null;
        
        intVet2 =  sort(intVet);
        
        for(int i= 0; i < intVet2.length; i++)
            System.out.println(intVet2[i]);
    }

    public static int[] sort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int meio = array.length / 2;
        int[] dir = array.length % 2 == 0 ? new int[meio] : new int[meio + 1];
        int[] esq = new int[meio];

        int[] aux = new int[array.length];

        for (int i = 0; i < meio; i++) {
            esq[i] = array[i];
        }

        int auxIndex = 0;
        for (int i = meio; i < array.length; i++) {
            dir[auxIndex] = array[i];
            auxIndex++;
        }

        esq = sort(esq);
        dir = sort(dir);

        aux = mergesort(esq, dir);

        return aux;
    }

    public static int[] mergesort(int[] esq, int[] dir) {
        int[] aux = new int[esq.length + dir.length];

        int indexDir = 0, indexEsq = 0, indexAux = 0;

        while (indexEsq < esq.length || indexDir < dir.length) {
            if (indexEsq < esq.length && indexDir < dir.length) {
                if (esq[indexEsq] <= dir[indexDir]) {
                    aux[indexAux] = esq[indexEsq];
                    indexAux++;
                    indexEsq++;
                } else {
                    aux[indexAux] = dir[indexDir];
                    indexAux++;
                    indexDir++;
                }
            } else if (indexEsq < esq.length) {
                aux[indexAux] = esq[indexEsq];
                indexAux++;
                indexEsq++;
            } else if (indexDir < dir.length) {
                aux[indexAux] = dir[indexDir];
                indexAux++;
                indexDir++;
            }
        }
        return aux;
    }
}
  

