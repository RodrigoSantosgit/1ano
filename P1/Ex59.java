import java.util.*;

public class Ex59 {
	
	public static void main (String[] args) {
	
		int M;
		
		M = Functions.getIntPos("Introduza um numero positivo: ");
	
		System.out.printf("Primos entre 1 ... %d:", M);
		
		for ( int i= 2; i<=M; i++) { 
			if ( Functions.isprime(i))
				System.out.printf("\n%d e primo.", i);
			
		}
	}
}
