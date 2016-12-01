
public class Busca2 {
    
    public static int i = 0;
    
    public static int Busca2 (int x ){
        
        
        int vet[] = {2, 3 , 5 , 6, 7};
        if (i >= vet.length){
            return -1;
            
        }else if (vet[i] == x){
            return i;
            
        }else{
            i++;
            return Busca2 (x);
        }
        
    }
    
    public static void main(String[] args) {
       int vet[] = {2, 3 , 5 , 6, 7};
       int x = 5; 
       
        
       System.out.println(Busca2 (x));
    }
}
