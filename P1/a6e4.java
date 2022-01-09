import java.util.*;

public class a6e4 {
  
  static Scanner sc = new Scanner(System.in);
  
  public static void main (String args[]){
    
    System.out.printf("Quantas notas quer processar? ");
    int N = sc.nextInt();
    
    // declaração e inicialização do array
    int notas[] = new int[N];
    
    // leitura dos valores para o array
    notas = leitura(N);
    histograma(notas);
       
  }
  
  public static void histograma (int[] n){
    int hist[]=new int[21];
    int cnt=0,max=0;
    
    for (int k=0;k<21;k++) {
      cnt=0;
      for (int i=0;i<n.length;i++){
        if (n[i]==k) cnt++;
      }
      hist[k]=cnt;
      if (cnt>max) max=cnt;
    }
     System.out.println("\nHistograma de notas");
     System.out.println("------------------------------------------");
     for (int k=0;k<21;k++){
       System.out.printf("%2d | ",k);
       int n_ast=(50*hist[k]/max);
       for (int j=1;j<=n_ast;j++){
         System.out.print("*");}
       System.out.println();
     }
  }
    
  public static  int[] leitura(int dim){
   int a[] = new int[dim];
   
   for (int i=0; i<=dim-1; i++) {
    System.out.printf("Introduza a nota do aluno %2d: ",i+1);
    a[i]=sc.nextInt();
   }
   return a;
  }
  
 }
