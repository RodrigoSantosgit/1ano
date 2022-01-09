import java.util.*;
public class Ex37_1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int X, Y, soma = 0;
		
		do {
			System.out.println("X = ");
			X = sc.nextInt();
		} while ( X < 0 );
		
		do {
			System.out.println("Y = ");
			Y = sc.nextInt();
		} while ( Y < 0 );
		
		System.out.println("  X |  Y  | SOMA");
		System.out.println("------------------");
		
		do {
			if ( X % 2 == 0 )
				System.out.printf(" %d |  %d |  nao\n", X, Y);
			else{
				System.out.printf(" %d |  %d |  sim\n", X, Y);
				soma += Y;
			}
			X = X/2;
			Y = Y*2;
		} while ( X >= 1 );
		System.out.println("------------------");
		System.out.println(" SOMA = " + soma);
	}
}
