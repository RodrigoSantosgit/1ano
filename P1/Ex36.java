import java.util.Scanner;
	public class Ex36 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int num, num2; // variáveis
	
	// leitura dos números
	System.out.print("Introduza o primeiro numero: ");
	num = sc.nextInt();
	
	System.out.print("Introduza o segundo numero: ");
	num2 = sc.nextInt();
	
	// cálculo do MDC
	if ( num == num2 ) {
		System.out.printf("O maximo divisor comum e %d", num);
	}
	else if (num < num2 ) {
			 System.out.printf("O maximo divisor comum e %d", num2 % num);
		 }
		 else {
			 System.out.printf("O maximo divisor comum e %d", num % num2);
		 }
	 }
 }
		
	
