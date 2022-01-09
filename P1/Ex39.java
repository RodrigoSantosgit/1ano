import java.util.*;
public class Ex39 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0, numpos=0, numneg=0, numintpos=0, numintneg=0;
		
		do {
			if ( n < -100 && n > -1000 )
				numintneg++;
			if ( n > 100 && n < 1000 )
				numintpos++;
			if ( n < 0 )
				numneg++;
			if ( n > 0 )
				numpos++;
			if (n==0)
				System.out.println("Introduza um lista de numeros terminada em 0:");
			n = sc.nextInt();
		} while ( n != 0 );
		
		System.out.println("Numeros positivos: " + numpos);
		System.out.println("Numeros negativos: " + numneg);
		System.out.println("Numeros positivos de 100 ... 1000: " + numintpos);
		System.out.println("Numeros negativos de -100 ... -1000: " + numintneg);
			
	}
}
