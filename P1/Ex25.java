import java.util.Scanner;
	public class Ex25 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	System.out.print("Introduza um número: ");
	num = sc.nextInt();
	
	if ( num % 2 == 0 ) {
		System.out.println("O número é par.");
	}
	else {
		System.out.println("O número é impar.");
	}
	}
}
