
public class Exer3 {
   public static int Busca1 (int x, int a[] ){
        
        
        for (int i = 0; i < a.length; i++){
            
            if (a[i] == x){
                return i;
            }
        }
        
        return -1;
    }
   public static int Busca2 (String x, String b[] ){
        
        
        for (int i = 0; i < b.length; i++){
            
            if (b[i].equalsIgnoreCase(x)){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
       String alunos [] = {"aline", "natalia", "mariana"};
       int notas[] = {7, 2 , 8};
       String x = "aline"; 
       int pos;
       
      System.out.println(Busca2(x, alunos));
      pos = Busca2(x, alunos);
      
      int pos2 ;
      pos2 = pos;
      
      if (notas[pos2] >= 7 ){
          System.out.println("Aluno " + alunos [pos] + " Aprovado");
      }else{
          System.out.println("Aluno " + alunos [pos] + " Reprovado");
      }
      
      
        
    }
        
       
    }
    
    
    
