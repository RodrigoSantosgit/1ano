import java.util.*;
import java.io.*;
public class EX71_1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) throws IOException {
		
		int n=1, l=0;
		String[] a = new String[50];
		String line;
		Scanner ler;
		
		do{
		System.out.println("Nome do ficheiro: ");
		String nome = sc.nextLine();
		
		File fic = new File(nome);
		
		if(fic.isFile())
			if(fic.canRead()) {
				ler = new Scanner(fic);
				while(ler.hasNextLine()) {
					line = ler.nextLine();
					a[l] = line;
					l++;
				}
				ler.close();
				n=0;
			}
			else
				System.out.print("ERRO: Ficheiro sem permissao de leitura.");
		else
			System.out.println("ERRO: Nome de ficheiro invalido.");
		} while (n!=0);
		
		System.out.println("Ficheiro valido.");
		
		for(int i=0; i<l; i++) {
			System.out.print(a[i]);
		}
	}
}

