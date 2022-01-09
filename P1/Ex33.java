import java.util.Scanner;
	public class Ex33 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	double cont = 0, min = 0, max = 0, valori = 0, media, num = 0, soma = 0;
	
	do {
		soma = soma + num;
		media = soma / cont;
		if ( cont == 0 ) {
			System.out.print("Introduza uma lista de números: ");
			valori = sc.nextDouble();
			cont = cont + 1;
			soma = valori;
			media = valori;
			max = valori;
			min = valori;
		}
		else { 
			num = sc.nextDouble();
			cont = cont + 1;
			if ( num > valori ) {
				max = num;
			}
			else if ( num < valori ) {
				min = num;
			}
		}
	} while ( valori > num || valori < num );
	System.out.print("O valor máximo = " + max + ", o valor mínimo = " + min + ", a média dos valores = " + media + ", o nº de elementos da lista = " + (cont - 1));
}
}
			
			
			
	
	
