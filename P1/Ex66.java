import java.util.*;
public class Ex66 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		char[] alfa = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		boolean[] isone = new boolean[26];
		System.out.println("Insira uma frase: ");
		String s = sc.nextLine();
		
		
		for (int i= 0; i < s.length(); i++){
			for (int j=0; j < alfa.length;j++){
				if (Character.toLowerCase(s.charAt(i)) == alfa[j]) 
					isone[j] = true;
			}
		}
		System.out.println("As letras inseridas foram: ");
		for (int i=0; i<isone.length; i++) {
			if ( isone[i] ) 
				System.out.print( alfa[i] + " ");
		}
	}
}
