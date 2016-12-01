
public class Exer2 {
    public static int i = 0;
    
    public static int BuscaRecursiva (int x ){
        
        
        int vet[] = {10,15,13,9,8,3,55,90,11,-1};
        if (i >= vet.length){
            return -1;
            
        }else if (vet[i] == x){
            return i;
            
        }else{
            i++;
            return BuscaRecursiva (x);
        }
        
    }
    
    public static void main(String[] args) {
       
       int x = 55; 
       
        
       System.out.println(BuscaRecursiva (x));
    }
}
