
public class Exer1 {
     public static int BuscaIterativa (int x, int a[] ){
        
        
        for (int i = 0; i < a.length; i++){
            
            if (a[i] == x){
                return i;
            }
        }
        
        return -1;
    }
     
     
     
    public static void main(String[] args) {
       int vet[] = new int[]{10,15,13,9,8,3,55,90,11,-1};
       int resp = -1;
       int procurado = 15;
        
       resp = BuscaIterativa(procurado, vet);
       
       
       if (resp != -1){
           
           System.out.println("Numero " + procurado + "foi localizado na posicao " + resp);
       }else{
           System.out.println("Nao localizado");
       }
    }
}
