import java.util.*;
public class Ex61 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m[], i;
		
		System.out.print("Introduza o numero de algarismos da sequencia: ");
		m = new int[sc.nextInt()];
		
		for ( i=0; i < m.length; i++) {
			m[i] = sc.nextInt();
		}
		for ( i= m.length; i>0; i--) {
			System.out.print(m[i-1]);
		}
	}
}

