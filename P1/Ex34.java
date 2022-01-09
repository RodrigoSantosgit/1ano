import java.util.Scanner;
	public class Ex34 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int tent = 0, numsecr = (int)(100.0*Math.random()) + 1, num;
	do {
		if ( tent == 0 ) {
			System.out.print("Tenta adivinhar o número de 1 a 100: ");
			num = sc.nextInt();
			tent = tent + 1;
		}
		else {
			System.out.println("Tenta outra vez.");
			num = sc.nextInt();
			tent = tent + 1;
		}
		if ( num < numsecr ) {
			System.out.println("Baixo.");
		}
		else if ( num > numsecr ) {
			System.out.println("Alto.");
		}
	} while ( num != numsecr );
	System.out.println( "Parabéns acertaste no numero ( " + numsecr + " ) em " + tent + " tentativas." );
		
}
}
	
	
	
