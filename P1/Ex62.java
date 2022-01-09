import java.util.*;
public class Ex62 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int m[]= new int[100], n, cont=0;
		
		System.out.println("Introduza uma sequencia de numeros: ");
		
		for (int i=0 ; i<m.length; i++){
			n = sc.nextInt();
			if (n >=0)
				m[i] = n;
			else 
				break;
		}
		
		System.out.println("N = ");
		n = sc.nextInt();
		
		for (int i=0 ; i<m.length; i++){
			if (m[i] == n)
				cont++;
		}	
		
		System.out.println("numero de vezes que N aparece : " + cont);
			 
	}
}

