import java.util.Scanner;
import java.util.Locale;
	public class Ex22 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
	
	double num1, num2;
	
	System.out.print("Introduza o 1º número: ");
	num1 = sc.nextDouble();
	
	
	System.out.print("Introduza o 2º número: ");
	num2 = sc.nextDouble();
	
	if ( num2 > num1 ) {
	    System.out.printf(" O maior número introduzido é %.2f", num2);
	    }
	else if ( num1 > num2 ) {
	    System.out.printf(" O maior número introduzido é %.2f", num1);
	}
	    else  {
	    System.out.println(" Os números introduzidos são iguais.");
	}
	    
	}
}
	
