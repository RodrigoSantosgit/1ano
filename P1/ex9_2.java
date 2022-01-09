import java.util.*;

public class ex9_2 {
	
	static final Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		String nome;
		do{
			System.out.print("Introduzir nome: ");
			nome=sc.nextLine();
			System.out.println(acronimo(nome));
		}while(nome.length()>1);
	}
	public static String acronimo(String nome){
		String[] pal; 
		String acro = new String();
		pal = nome.split(" ");
		for(int i=0;i<pal.length;i++){
			if(pal[i].length()>3)
				acro += Character.toUpperCase(pal[i].charAt(0));
		}
		return acro;
	}
}
