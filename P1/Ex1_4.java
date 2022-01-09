import java.util.*;
public class Ex1_4 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		String s;

		do{
			System.out.print("Introduza texto a ser traduzido: ");
			s = sc.nextLine();
		
			s = s.replace('l', 'u');
			s = s.replace('L','U');
			s = s.replaceAll("r","");
			s = s.replaceAll("R","");
			
			System.out.print(s);
			
		}while(s.length() != 0);
	}
}

