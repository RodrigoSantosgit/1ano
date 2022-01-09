import java.util.*;
public class Ex410 {
	
	public static void main (String[] args) {
		
		int n, soma = 1;
		
		n = Functions.getIntPos("numero: ");
		
		for ( int i = 2; i < n; i++ ) {
			if ( n % i == 0 ) 
				soma += i;	
		}
		 
		if ( soma == n ) 
			System.out.printf("O numero %d e perfeito.", n);
		else 
			System.out.printf("O numero %d nao e perfeito.", n);
		
	}
}
