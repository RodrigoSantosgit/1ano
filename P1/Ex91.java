import java.util.*;
import java.io.*;
public class Ex91 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int charup=0, charlow=0, numer=0, i=0;
		
		System.out.println("Analise de uma frase:");
		System.out.print("Frase de entrada -> ");
		String line = sc.nextLine();
		
		for( i=0; i<line.length(); i++) {
			if(Character.isUpperCase(line.charAt(i)))
				charup++;
			else if(Character.isLowerCase(line.charAt(i)))
					charlow++; 
				else if(Character.isDigit(line.charAt(i)))
						numer++; 
		}
		System.out.println("Numero de caracteres minusculos -> " + charlow);
		System.out.println("Numero de caracteres maiusculos -> " + charup);
		System.out.println("Numero de caracteres numericos -> " + numer);
	}
}

