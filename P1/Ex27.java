import java.util.Scanner;
import java.util.Locale;
	public class Ex27 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
	
	double num1, num2, num3;
	
	System.out.print("Introduza o primeiro número: ");
	num1 = sc.nextDouble();
	
	System.out.print("Introduza o segundo número: ");
	num2 = sc.nextDouble();
	
	System.out.print("Introduza o terceiro número: ");
	num3 = sc.nextDouble();
	
	if ( num1 > num2 ) {
		if ( num1 > num3 )
			System.out.print("O maior número é " + num1);
		else if ( num3 > num1 ) {
				System.out.print("O maior número é " + num3);
				}
			 else {
				System.out.print("O primeiro e o terceiro números são iguais e também o maior número ( " + num1 + " ).");
				}
	}
	else if ( num2 > num1 ) {
			if (num2 > num3 )
				System.out.print("O maior número é " + num2);
			else if ( num3 > num2 ) {
					System.out.print("O maior número é " + num3);
					}
				 else {
					System.out.print("O segundo e o terceiro números são iguais e também o maior número ( " + num2 + " ).");
					}
	}
	if ( num1 == num2 ) {
		if ( num1 > num3 )
			System.out.print("O maior número é " + num1);
		else if ( num3 > num1 ) {
				System.out.print("O maior número é " + num3);
				}
			 else {
				 System.out.print("O primeiro, o segundo e o terceiro números são iguais, o maior número é " + num2 );
				 }
	}
		
	}	
}
