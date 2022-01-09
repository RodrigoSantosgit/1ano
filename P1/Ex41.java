import java.util.Scanner;
	public class Ex41 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n, N=0; // variaveis
	
	while (N<=0 || N>= 100) { // validação do número
		System.out.print("Introduza um numero de repeticoes (1 ... 99): ");
		N = sc.nextInt();
		if (N<= 0 || N >= 100) {
		    System.out.println(" ERRO ");
		}
	}
	for ( n=1 ; n <= N ; n++ ) { // impressão das repetições
		 System.out.println("P1 e fixe! ");
	 }
 }
}

