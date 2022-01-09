import java.util.*;
public class Ex63 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int n, m[] = new int[50];
		
		System.out.println("Analise de uma sequencia de numeros inteiros.");
		System.out.println("1 - Ler sequencia");
		System.out.println("2 - Escrever a sequencia");
		System.out.println("3 - Calcular o maximo da sequencia");
		System.out.println("4 - Calcular o minimo da sequencia");
		System.out.println("5 - Calcular a media da sequencia");
		System.out.println("6 - Detetar se e uma sequencia so constituida por numeros pares");
		System.out.println("10 - Terminar o programa.");
		System.out.print("Opcao -> ");
		n = sc.nextInt();
		
		if ( n == 1 )
			lerseq(m);
			System.out.println("Proxima opcao -> ");
			n= sc.nextInt();
		if ( n == 2 )
			escreverseq(m);
			System.out.println("Proxima opcao -> ");
			n= sc.nextInt();
		if ( n == 3 )
			max(m);
			System.out.println("Proxima opcao -> ");
			n= sc.nextInt();
		if ( n == 4 )
			min(m);
			System.out.println("Proxima opcao -> ");
			n= sc.nextInt();
		if ( n == 5 )
			media(m);
			System.out.println("Proxima opcao -> ");
			n= sc.nextInt();
		if ( n == 6 )
			par(m);
			System.out.println("Proxima opcao -> ");
			n= sc.nextInt();
		if ( n == 10 )
			System.exit(0);
	}	
	public static int[] lerseq(int m[]) {
		int n=0, a;
		do {
			a = sc.nextInt();
			m[n] = a;
			n++;
	
		}while (a !=0 && n < m.length);
		
		return m;
	}
	
	public static void escreverseq(int m[]) {
		for (int i = 0 ; i <m.length; i++) {
			System.out.print(m[i] + " " );
		}
	}
	
	public static void max(int m[]) {
		int max=0;
		for (int i=0; i<m.length ; i++) {
			if ( m[i] > max )
				max = m[i];
		}
		System.out.println("O maximo da sequencia e: " + max);
	}	
	public static void min(int m[]) {
		int min=200;
		for (int i=0; i<m.length ; i++) {
			if ( m[i] < min )
				min = m[i];
		}
		System.out.println("O minimo da sequencia e: " + min);
	}
	public static void media(int m[]) {
		double med=0, soma=0;
		for (int i = 0; i< m.length ; i++) {
			soma += m[i];
			med = soma / (i+1);
		}
		System.out.println("A media da sequencia e: " + med);
	}
	public static void par(int m[]) {
		int i=0;
		do {
			if (m[i] % 2 != 0){
				System.out.println("A sequencia nao e composto so por numeros pares.");
				break;
			}
			i++;
		} while ( i<m.length);
		if (i== m.length)
			System.out.println("A sequencia e composta so por numeros pares.");
	}
}

