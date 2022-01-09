import java.util.*;
public class Ex48 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		do {
			System.out.print("Introduza os intervalo, A = ");
			A = sc.nextInt();
			System.out.print("B = ");
			B = sc.nextInt();
		} while ( A < 0 || B < A );
		
		for ( int i = A ; i<B ; i++ ) {
			if ( i % 2 != 0 ) {
				System.out.printf("%d e impar.\n", i);
			}
		}
	}
}
