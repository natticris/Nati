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
public class Quick3 {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] intVet = new int[]{10,15,13,9,8,3,55,90,11,-1};
        quick_sort(intVet, 0, intVet.length-1);
        
        for(int i=0;i<intVet.length ;i++)
                    System.out.println(intVet[i]);
    }
    
     public static void quick_sort(int []v,int ini, int fim) {
                int meio;
 
                if (ini < fim) {
                        meio = partition(v, ini, fim);
                        quick_sort(v, ini, meio-1);
                        quick_sort(v, meio + 1, fim);
                }
                
                
        }
 
        public static int partition(int []v, int ini, int fim) {
                int pivo, topo, i;
                pivo = v[ini];
                topo = ini;
 
                for (i = ini + 1; i <= fim; i++) {
                        if (v[i] < pivo) {
                                v[topo] = v[i];
                                v[i] = v[topo + 1];
                                topo++; 
                        }
                }
                v[topo] = pivo;
                return topo;
        } 
}
