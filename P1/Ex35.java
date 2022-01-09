import java.util.Scanner;
	public class Ex35 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int num, i;
	
	do { 
		System.out.println("Introduza um numero: ");
		num = sc.nextInt();
	} while ( num < 0 );
	
	for ( i = 2 ; i<num; i++ ) {
		if ( num % i == 0 )
			break;
	}
	
	if ( i == num ) 
		System.out.println("O numero e primo.");
	else
		System.out.println("O numero nao e primo.");
	}
}
		
		
	
	
			
