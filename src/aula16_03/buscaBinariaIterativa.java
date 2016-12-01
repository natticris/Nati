

package aula16_03;

import java.util.Scanner;

public class buscaBinariaIterativa {
     
    
    public static int BuscaBin(int v[], int i, int f, int x){
        
        int m = 0;
        
        while (i <= f){
            m = (i+f)/2;
            if (x < v[m]){
                
                f = m - 1;
                
            }else if (x  > v[m]){
                i = m + 1;
                
            }else if (v[m] == x){
                return m;
           
            }
            
        }
        return -1;
        
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
            
        int vet[] = {2, 3 , 5 , 6, 7};
        
        int in = 0;
        int fim = vet.length-1;
        
        System.out.println ("Digite um numero");
        int a = entrada.nextInt();
        
        int resultado;
        resultado = BuscaBin (vet, in, fim, a);
        
        if (resultado == -1){
            System.out.println("Valor nao encontrado " );           
        }else {
            System.out.println("Valor encontrado, posição " + resultado);
        }
        
    }
    
}
