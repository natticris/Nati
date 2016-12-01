
package aula30_03;

public class Exer1 {
    public static int []vet = new int []{10,15,13,9,8,3,55,90,11,-1};
    public static void troca (int a, int b){
       
        int aux = 0;
        aux = a;
        a = b;
        b = aux;
        System.out.println("Valor a " + a + " Valor b " + b);
    }
    
    public static void Bubble (int x){
       
        int aux = 0;
        aux = vet[x];
        vet[x]= vet[x+1];
        vet[x+1] = aux;
        
    }
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
    
    public static int BuscaBinRec(int v[], int i, int f, int x){
        int m  = 0;
        m = (i + f)/2;
        
        if ( f < i){
            return -1;
        }else if (x < v[m]){
            return BuscaBinRec (v, i, m-1, x);
            
        }else if (x > v[m]){
            
            return BuscaBinRec (v, m + 1, f, x);
        }else if (x == v[m]){
            
            return m;
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int aux = 0;
        int c= 10;
        int b = 15;
        troca(c, b);
        
        System.out.println(c +" "+ b);
        
        for (int a = 0; a < vet.length; a++){
            System.out.println(vet[a]);
        }
        
        for (int i = 0; i < vet.length; i++){
            
            for (int j = 0; j < vet.length-1; j++){
            
            if (vet[j] > vet [j+1]){
                Bubble(j);
            }
        }
        
        }
        for (int a = 0; a < vet.length; a++){
            System.out.println(vet[a]);
        }
        
                
    }
    
}
