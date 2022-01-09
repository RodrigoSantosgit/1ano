import java.util.Scanner;
	public class Ex23 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int idade;
	
	System.out.print("Introduza a sua idade: ");
	idade = sc.nextInt();
	if ( idade < 6 ) {
	System.out.println("Isento de pagamento.");
	}
	else if ( idade > 6 && idade < 12 ) {
	System.out.println("Bilhete de criança.");
	}
	     else if ( idade > 12 && idade < 65 ) {
	     System.out.println("Bilhete normal.");
	     }
	          else {
	     System.out.println("Bilhete de 3º idade.");
	     }
	     
	 }
}

