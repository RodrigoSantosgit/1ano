import java.util.Scanner;
import java.util.Locale;
	public class Ex29 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
	
	double temp, conver;
	int escala;
	
	System.out.print( "Escolha a escala, ( 0 ) para Celsius, ( 1 ) para Fahrenheit: " );
	escala = sc.nextInt();
	
	if ( escala == 0 ) {
		System.out.print( "Introduza a temperatura: " );
		temp = sc.nextDouble();
		conver = 1.8 * temp + 32;
		System.out.println( temp + "ºCelsius e equivalente a " + conver + "ºFahrenheit." );
	}
	else if ( escala == 1 ) {
			System.out.print( "Introduza a temperatura: " );
			temp = sc.nextDouble();
			conver = ( temp - 32 ) / 1.8;
			System.out.println( temp + "ºFahrenheit e equivalente a " + conver + "ºCelsius." );
			}
	}
}

