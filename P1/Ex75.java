import java.util.*;
import java.io.*;

public class Ex75 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) throws IOException {
		String nome,nome2;
		String[] a = new String[500];
		int l=0,n=1;
		Scanner ler;
		
		do{
			System.out.print("Nome do ficheiro: ");
			do{
				nome = sc.nextLine();
			}while(nome.length()==0);
	 
			File fic = new File(nome);
			if(fic.isFile())
				if(fic.canRead()) {
					ler = new Scanner(fic);
					while(ler.hasNextLine()) {
						a[l] = ler.nextLine();
						l++;
					}
					ler.close();
					n=0;
				}
				else
					System.out.print("ERRO: Ficheiro sem permissão de leitura.");
			else
				System.out.println("ERRO: Nome de ficheiro invalido.");
		} while (n!=0);
		
		System.out.print("Nome do ficheiro para colar o codigo: ");
		do{
			nome2 = sc.nextLine();
		}while(nome.length()==0);
		
		File fic2 = new File(nome2);
		PrintWriter pw = new PrintWriter(fic2);
	 
		for(int i=0; i<a.length; i++) {
			if(a[i]!="//") 
			pw.println(a[i]);
			else 
				break;
		}
		pw.close();
	}
}

