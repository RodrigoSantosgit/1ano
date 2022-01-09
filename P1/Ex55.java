import java.util.*;
	public class Ex55 {
		
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int larg, alt;
		do {
			System.out.print("Introduza a altura do retangulo: ");
			alt = sc.nextInt();
		
			System.out.print("Introduza a largura do retangulo: ");
			larg = sc.nextInt();
		
			printNtimes(larg, alt);
		}while ( alt < 3 || larg < 3 );
		
	}

	public static void printNtimes(int larg,int alt) {
		
		int i = 0, b = 0;
		
		for (i = 0; i < larg; i++) {
			System.out.print("*");
		}
		
		i = 0;
		
		for (i = 0; i < alt-2; i++) {
			System.out.print("\n*");
			
			for (b = 0; b < larg-2; b++) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
		
		i = 0;
		
		for (i = 0; i < larg; i++) {
			System.out.print("*");
		}
	}
}
		
