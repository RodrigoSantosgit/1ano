import java.util.*;
public class Ex38 {
	
	public static void main (String[] args) {
		
		int nota = 0, soma = 0, numnotas = -1;
		double media;
		
		do {
			soma += nota;
			numnotas++;
			nota = Functions.getIntRange(-20, 20, "Nota = ");
		} while ( nota > 0 );
		
		media = (double) soma / (double) numnotas;
		
		System.out.println("Soma = " + soma);
		System.out.printf("Media = %.2f", media);
	}
}
