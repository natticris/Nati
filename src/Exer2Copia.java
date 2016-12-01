import java.util.Scanner;


public class Exer2Copia {
    public static int i = 0;
    
    public static int BuscaRecursiva (int x, int vet[] ){
        
        
        
        if (i >= vet.length){
            return -1;
            
        }else if (vet[i] == x){
            return i;
            
        }else{
            i++;
            return BuscaRecursiva (x, vet);
        }
        
    }
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int vet[] = {10,15,13,9,8,3,55,90,11,-1};
       System.out.println("Digite um número");
       int a = entrada.nextInt();
       int resp = -1;
        
       resp = BuscaRecursiva (a, vet);
       
       if (resp != -1 ){
           System.out.println("número procurado esta na posição " + resp);
       }else {
           System.out.println("Nao encontrado");
       }
    }
}
