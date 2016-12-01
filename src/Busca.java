
public class Busca {
    public static int Busca1 (int x, int a[] ){
        
        
        for (int i = 0; i < a.length; i++){
            
            if (a[i] == x){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
       int vet[] = {2, 3 , 5 , 6, 7};
       int x = 3; 
        
       System.out.println(Busca1(x, vet));
        
    }
    
}
