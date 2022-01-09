import java.util.*;
public class Ex1_5 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.println("Introduza uma lista de numeros:");
		
		double soma=0, media, n;
		int cont=-1;
		
		do {
			cont++;
			n = sc.nextInt();
			soma += n;
		}while ( n!=0 );
		
		System.out.println("soma = " + soma);
		
		if(cont == 0 )
			System.out.print("A lista esta vazia nao se pode calcular a media");
		else
			System.out.println("media = " + soma/cont );
	}
}

