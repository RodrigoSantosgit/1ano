import java.util.*;
import java.io.*;
public class CopyFile {
	
	public static void main (String[] args) {
		
		int i = 0;
		String[] a = new String[500];
		Scanner opc = new Scanner(System.in);
		
		try{
			File fic = new File(args[0]);
			Scanner ler = new Scanner(fic);
			while(ler.hasNextLine()){
				a[i] = ler.nextLine();
				i++;
			}
			ler.close();
		}
		catch (FileNotFoundException e){
			System.out.println("Erro: Ficheiro nao encontrado.");
			System.exit(1);
		}
		try{
			File fic2= new File(args[1]);
			if (fic2.exists()) {
				PrintWriter pw = new PrintWriter(fic2);
				System.out.println("Ficheiro ja existe deseja substituir?");
				char op = opc.nextLine().charAt(0);
				if(op == 's' || op == 'S')
					for(i=0; i<a.length; i++) {
						if(a[i]!= null)
						pw.println(a[i]);
					}
				
				else
				{
					System.out.print("O programa vai terminar.");
					System.exit(0);
				}	
				pw.close();	
			}
			else {
					File fic3 = new File(args[1]);
					PrintWriter pw = new PrintWriter(fic3);
					for(i=0; i<a.length; i++) {
						if(a[i]!= null)
						pw.println(a[i]);
					}
					pw.close();	
				}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("Erro: File not acessible.");
		}
	}
}

