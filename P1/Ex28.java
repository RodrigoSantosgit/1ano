import java.util.Scanner;
import java.util.Locale;
	public class Ex28 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
	
	double num1, num2, num3;
	
	System.out.print("Introduza o primeiro numero: ");
	num1 = sc.nextDouble();
	
	System.out.print("Introduza o segundo numero: ");
	num2 = sc.nextDouble();
	
	System.out.print("Introduza o terceiro numero: ");
	num3 = sc.nextDouble();
	
	if ( num1 > num2 ) {
		if ( num1 > num3 )
			if ( num3 > num2 )
			System.out.print(num2 + " < " + num3 + " < " + num1);
			else if ( num2 > num3 ) {
				 System.out.print( num3 + " < " + num2 + " < " + num1);
				 }
				 else { 
					 System.out.print( num3 + " = " + num2 + " < " + num1);
				 }
		else if ( num3 > num1 ) {
				System.out.print(num2 + " < " + num1 + " < " + num3);
				}
			 else {
				System.out.print( num2 + " < " + num3 + " = " + num1 );
				}
	}
	else if ( num2 > num1 ) {
			if (num2 > num3 )
				if ( num3 > num1 )
				System.out.print( num1 + " < " + num3 + " < " + num2);
				else if ( num1 > num3 ) {
					 System.out.print( num3 + " < " + num1 + " < " + num2);
				 }
					 else {
						 System.out.print( num3 + " = " + num1 + " < " + num2);
					 }
			else if ( num3 > num2 ) {
					System.out.print( num1 + " < " + num2 + " < " + num3);
					}
				 else {
					System.out.print( num1 + " < " + num2 + " = " + num3);
					}
	}
	if ( num1 == num2 ) {
		if ( num1 > num3 )
			System.out.print( num3 + " < " + num2 + " = " + num1 );
		else if ( num3 > num1 ) {
				System.out.print( num1 + " = " + num2 + " < " + num3 );
				}
			 else {
				 System.out.print( num2 + " = " + num3 + " = " + num1 );
			 }
	}
		
	}	
}
