

package aula13_04;

public class Exer2 {
    
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public static void main(String[] args) {
        String[] Vet = new String[]{"JOSE", "ANDRE", "ALINY", "MARCELO", };
        
        
        //DESORDENADO
        for(int i= 0; i < Vet.length; i++){
            System.out.println(Vet[i]);
        }
        Selection(Vet);
    }

    public static void Selection(String[] v) {
        int index_min;
        String aux;

        for (int i = 0; i < v.length; i++) {
            index_min = i;
            for (int j = i + 1; j < v.length; j++) 
            {                
                if (v[j].compareTo(v[index_min])<0) {
                    index_min = j;
                }
            }
            if (index_min != i) {
                //troca
                aux = v[index_min];
                v[index_min] = v[i];
                v[i] = aux;
            }
        }
    }

}

    

