import java.util.Scanner;
	public class Ex42 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int n, N=-1; // variaveis
	
	while (N<=0 || N>= 100) { // validação do número
		System.out.print("Introduza um numero inteiro (1 ... 99): ");
		N = sc.nextInt();
		if (N<= 0 || N >= 100) {
		    System.out.println(" ERRO ");
		}
	}
	
	System.out.printf("-----------------\n");
	System.out.printf("| Tabuada do %d | \n", N);
	System.out.printf("-----------------\n");
	
	for ( n=1; n<11; n++ ) { // cálculo da tabuada
		System.out.printf("| %d x %d | %d  | \n", N, n, N * n);
	}
	
	System.out.print("----------------");
	
}
}
	
	
