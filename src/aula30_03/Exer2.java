 
package aula30_03;

public class Exer2 {
    
    public static int []vet = new int []{10,15,13,9,8,3,55,90,11,-1};
    
    public static int[] insertionSort(int[] vet) {
        for (int i = 1; i < vet.length; i++) {
            int next = vet[i];
            
            int j = i;
            while (j > 0 && vet[j - 1] > next) {
                vet[j] = vet[j - 1];
                j--;
            }
            
            vet[j] = next;
        }
        return vet;
    }
    

    
    public static void Insertion (int x){
       
        int aux = 0;
        aux = vet[x];
        vet[x]= vet[x-1];
        vet[x-1] = aux;
        
    }
    public static void main(String[] args) {
        int j = 1;
        int p = vet[j];
        /*for (int a = 0; a < vet.length; a++){ 
        for (int i = 0; i < vet.length-1; i++){
             if (p > vet[i]){
                 insertionSort(i);
                 
             }
             j++;
         }
        
        }*/
         
        insertionSort(vet);
        for (int a = 0; a < vet.length; a++){
            System.out.println(vet[a]);
        }
        
        
    }
    
}
