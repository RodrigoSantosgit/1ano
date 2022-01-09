import java.util.*;
import java.io.*;
public class Ex92 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		String nome;
		do{
			System.out.print("Introduza um nome: ");
			nome = sc.nextLine();
			acro(nome);
			System.out.println();
		}while(nome.length()>1);
	}
	public static void acro(String nome){
		for(int i=0; i<nome.length(); i++){
			if(Character.isUpperCase(nome.charAt(i)))
				System.out.print(nome.charAt(i));	
		}
		
	}
}

