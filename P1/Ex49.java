import java.util.*;
public class Ex49 {
	
	public static void main (String[] args) {
		
		int N, soma = 0;
		
		N = Functions.getIntPos("N = ");
		
		for ( int i = 1; i <= N*2; i++) {
			if ( i % 2 == 0 ) {
				soma += i;
				System.out.print(i + " ");
			} 
		}
		System.out.print("\nsoma = " + soma);
	}
}

