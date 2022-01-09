import java.util.*;
public class Ex67 {
	
	static Scanner sc = new Scanner(System.in);
	
	static final int DIM = 100;
	
	public static void main (String[] args) {
		
		int m[]= new int[DIM], m2[] = new int[100], n, cont=1;
		
		System.out.println("Introduza uma sequencia de numeros: ");
		
		m = lerseq();
		m2 = m;
		for (int a=0 ; a < m.length; a++){
			if (verfi(m, m2, a)== true)
				cont = contador(m[a], m);
				System.out.println(m[a] + " ocorre " + (cont) + " vezes.");
		}
	}
	public static int[] lerseq() {
		int temp[] = new int[DIM];
		int i=0,aux;
		do{
			System.out.printf("a[%d]: ", i);
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
	public static int contador(int n, int[] m) {
		int cont=0;
		for (int i = 0; i<m.length; i++){
			if ( n == m[i])
				cont++;
		}
		return cont;
	}
	public static boolean verfi(int[] m, int[] m2, int a) {
		 boolean ver = false;
		 int i =0;
		for (i = 0; i < a; i++) {
			if (m[a] == m2[i]) 
				break;
		}
		if (i == a )
			return true;
		else 
			return false;
	}
}

