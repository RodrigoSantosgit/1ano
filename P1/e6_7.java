import java.util.*;

public class e6_7 {
 static final int N = 100;
 
 static final Scanner read = new Scanner(System.in);
 
 public static void main (String args[]) {
  int array[] = new int[N];
  int r, count,length=0;
  
  System.out.println("Escreva sequência de inteiros (termina com <0): ");
  
  for (r=0; r<array.length; r++)
  {     array[r] = read.nextInt();
        if (array[r] < 0) break;    }
  length = r;
  
  for(int i=0; i<r-1; i++)
  { count = 0; 
    for(int j=0; j<r; j++)
      {
        if ( (array[i] == array[j]) && (j<i) ) break;
        if (array[i] == array[j]) count++;
      }
    if (count == 0) continue;
    System.out.println(array[i]+" ocorre "+count+" vezes");
  }
 }
}
