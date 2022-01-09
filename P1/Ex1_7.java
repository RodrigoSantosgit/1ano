import java.util.*;
import java.io.*;
public class Ex1_7 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) throws IOException {
		int l=0;
		String nome, nome2;
		String[] a = new String[500]; 
		Scanner ler;
		char op='n';
		do{
			System.out.print("Introduza o nome do ficheiro a copiar: ");
			do{
				nome = sc.nextLine();
			}while(nome.length()==0);
		
			File fic1 = new File(nome);
			if(fic1.isFile())
				if(fic1.canRead()) {
					ler = new Scanner(fic1);
					while(ler.hasNextLine()) {
						a[l] = ler.nextLine();
						l++;
					}
					ler.close();
				
				}
				else
					System.out.print("ERRO: Ficheiro sem permissão de leitura.");
			else
				System.out.println("ERRO: Nome de ficheiro invalido.");
		}while(l==0);
		
		do{
			
			System.out.print("Introduza o nome do ficheiro a colar: ");
			do{
				nome2 = sc.nextLine();
			}while(nome2.length()==0);
		
			File fic2 = new File(nome2);
	
			if(fic2.exists()){
				System.out.print("Deseja substituir o ficheiro ja existente (S/N)? ");
				op = sc.nextLine().charAt(0);
			}
			else 
				op='S';
		}while(op == 'N' || op == 'n');
		
		File fic2 = new File(nome2);
		PrintWriter pw = new PrintWriter(fic2);	
		
		for(int i=0; i<a.length; i++) {
			if(a[i]!= null)
				pw.println(a[i]);
		}
		pw.close();		
	}
}

