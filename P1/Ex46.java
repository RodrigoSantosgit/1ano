import java.util.*;
	public class Ex46 {
		
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int larg, alt, i = 0, b = 0;
		do {
			System.out.println("Introduza a altura do retangulo: ");
			alt = sc.nextInt();
		
			System.out.println("Introduza a largura do retangulo: ");
			larg = sc.nextInt();
	
		} while ( alt < 3 || larg < 3 );
		
		for (i = 0; i < alt; i++) {
			for (b = 0; b < larg; b++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
