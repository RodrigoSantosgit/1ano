import java.util.Scanner;

	public class Ex32 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	double num=1, prod = 1;
	
	while ( num < 0 || num > 0 ) {
		System.out.print("Introduza uma lista de valores terminada com 0: ");
		prod = num * prod;
		num = sc.nextDouble();
		
	}
	System.out.print("O produto dos números = " + prod);
}
}
