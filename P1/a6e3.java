import java.util.*;

// Ex 6.3

public class a6e3 {
 
 public static Scanner sc = new Scanner (System.in);
 
 public static final int DIM=50;
 
 public static void main (String args[]) {
  
  int opcao;
  int a[] = new int[DIM];
  
  do{
  System.out.printf("Analise de uma sequencia de numeros inteiros: \n");
  System.out.printf("1 - Ler a sequencia\n");
  System.out.printf("2 - Escrever a sequencia\n");
  System.out.printf("3 - Calcular o maximo da sequencia\n");
  System.out.printf("4 - Calcular o minimo da sequencia\n");
  System.out.printf("5 - Calcular a media da sequencia\n");
  System.out.printf("6 - Sequencia so com numeros pares ?\n");
  System.out.printf("10 - Terminar o programa\n");
  System.out.printf("Opção-> \n");
  
  opcao = sc.nextInt();
  
  switch(opcao){
   case 1:
    a = lerArray();
    break;
   case 2:
    imprimirArray(a);
    break;
   case 3:
    int max = maximArray(a);
    System.out.printf("Maximo: %d\n",max);
    break;
   case 4:
    int min = minimArray(a);
    System.out.printf("Minimo: %d\n",min);
    break;
   case 5:
    double media = mediaArray(a);
    System.out.printf("Media: %f\n", media);
    break;
   case 6:
    boolean res = evenArray(a);
    if(res == true)
     {
      System.out.printf("So pares! \n");
     }
     else
      System.out.printf("Pares e impares!\n");
     break;
   case 10:
    System.exit(0); // saída sem erro associado; se diferente de 0 ... associa-se erro
    break; 
    
    default:
     System.out.printf("Opção invalida!\n");
    break;
 }
 }while(opcao != 10);
 
}

// FUNCOES ##########################################################

 public static int[] lerArray()
 {
  int temp[] = new int[DIM];
  int i = 0, aux;
  
  do{
   System.out.printf(" a[%d]: ", i);
   do {
	aux = sc.nextInt();
	if (aux>=0) break;
	System.out.println("So n.os inteiros >=0 !! insira novamente: ");
	} while(true);
	temp[i] = aux;
	i++;
  }while(i<DIM && aux != 0);
  
  return temp;  
 }
 
 public static void imprimirArray(int a[])
 {
  for(int i = 0; i<a.length; i++)
   {
     if(a[i] != 0){
  System.out.printf("a[%d] = %d\n", i, a[i]);}
   }
 }
 
 public static int maximArray(int a[])
 {
  int max = 0;
  
  for(int i = 0; i<a.length; i++)
   {
    if(a[i] > max)
    {
     max = a[i];
    }
   }
    
  return max;
 }

 public static int minimArray(int a[])
 {
  int min = Integer.MAX_VALUE;
  for(int i = 0; i<a.length; i++)
   {
    if(a[i]!=0 && a[i] < min)
    {
     min = a[i];
    }
   }
  return min;
 }
 
 public static double mediaArray(int a[])
 {
  int soma = 0, n = 0;
  double media = 0;

  for(int i = 0; i<a.length; i++)
  {
   if(a[i] != 0)
   { 
    n++;
    soma = soma + a[i];
   }
  }
  
  media = (double)soma/n;
  
  return media;
 }
 
 public static boolean evenArray(int a[])
 {
  int n_par = 0, n_total = 0;
  boolean res;
   
  for(int i = 0; i<a.length; i++)
  {
   if(a[i] != 0){
     n_total++;
     if(a[i] %2 == 0){ 
       n_par++;
     }
   }
   
  }
  
  if(n_total == n_par){
   res = true;}
  else {
    res = false;}
 
  return res;
 }
 
}

