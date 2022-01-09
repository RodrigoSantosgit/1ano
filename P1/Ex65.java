import java.util.*;
public class Ex65 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		
		int n = validacao("N = "), m[] = new int[n];
		for ( int i = 0; i < n; i++ ) {
			if ( i==0)
				System.out.print("Sequencia: ");
			m[i] = sc.nextInt();
		}
		System.out.println("A media da sequencia = " + med(m));
		impressao(m, med(m));
		System.out.printf("\nO desvio padrao da sequencia: %.3f", desvio(m, med(m)));
	}
	
	public static int validacao(String msg) {
		int n;
		do {
			System.out.print(msg);
			n = sc.nextInt();
		} while ( n < 0 );
		return n;
	}
	
	public static double med(int m[]) {
		double med=0, soma=0;
		for ( int i = 0; i < m.length; i++) {
			soma += m[i];
			med = soma / (i+1);
		}
		return med;
	}
	public static void impressao(int m[],double med) {
		for (int i=0; i< m.length; i++) {
			if (i== 0)
				System.out.print("Os valores superiores a media: ");
			if (m[i]> med)
				System.out.print(m[i]+ " ");
		}
	}
	public static double desvio(int m[], double med) {
		double dest=0;
		int i=0;
		for (i=0; i<m.length; i++) {
			dest += ((m[i]- med)*(m[i]- med));
		}
		return Math.sqrt((dest/(i+1)));
	}
}

