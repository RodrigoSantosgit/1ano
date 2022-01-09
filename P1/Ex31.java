import java.util.Scanner;

	public class Ex31 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int num = 0, numn = 0, numeros;
	
	while ( numn == 0 ) {
	System.out.print("Introduza um número: ");
	numeros = sc.nextInt();
	if ( numeros >= 0 ) {
		num = num + 1;
	}
	else {
		System.out.print("O número de números introduzidos é igual a " + num);
		numn = 1;
		}
	}
	}
}
		
