import java.io.*;
import java.util.*;

public class Ex71 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) throws IOException {
		
		int n=1;
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
					System.out.println(line);
				}
				ler.close();
				n=0;
			}
			else
				System.out.print("ERRO: Ficheiro sem permissão de leitura.");
		else
			System.out.println("ERRO: Nome de ficheiro invalido.");
		} while (n!=0);
		
		
	}
}

