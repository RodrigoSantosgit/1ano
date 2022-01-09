import java.util.*;
public class Ex64 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		// pergntar número de alunos a registar as notas:
		System.out.print("Numero de alunos: ");
		int N = sc.nextInt();
		//ler notas:
		int[] n = new int[N];
		lernotas(n);
		// chamar função para produzir histograma:
		hist(n);
	}
	public static void lernotas(int[] n) { 
		for(int i=0; i<n.length; i++){  // ler as notas de todos os alunos:
			do {
			System.out.printf("Nota do aluno %2d: ", (i+1));
			n[i] = sc.nextInt();
			} while(n[i]<0 || n[i]>20);
		}
	}
	public static void hist(int[] n) {
		System.out.println("\nHISTOGRAMA DE NOTAS:");
		System.out.println("---------------------------------------------------------");
		
		int[] hist = new int[21]; 
		int cont, n_ast, max=0;

		for(int i=0; i<21; i++){  // contagem do numero de cada nota.
			cont=0;
			for(int k=0; k<n.length; k++){
				if (n[k] == i) 
					cont++;
			}
			hist[i] = cont; 
			if (cont>max)
				max=cont;
		}
		for(int i=0; i<21; i++){	
			n_ast = (50*hist[i])/max; // normalização linear.
			System.out.printf("%2d | ", i);
			for(int j=0; j<n_ast; j++){  // impressão de histograma.
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------");
	}
}

