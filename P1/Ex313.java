import java.util.*;
public class Ex313 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Introduza um numero: ");
		int n = sc.nextInt();
		
		do { 
			System.out.print(n % 10);
			n = n / 10;
		} while ( n != 0 );
	}
}
