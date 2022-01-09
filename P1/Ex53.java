import java.util.Scanner;
	public class Ex53 {
		
		Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
	
		int mes, ano;
		boolean bis;
		
		mes = Functions.getIntRange(1, 12, "Mes: ");
		ano = Functions.getIntPos("Ano: ");
		bis = Functions.bissexto(ano);
		
		if ( mes == 8 || mes == 10 || mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 12 ) {
			System.out.println("O mes " + mes + " do ano " + ano + " tem 31 dias.");
		}
		else if ( mes == 2 ) {
				if ( bis == true) 
					System.out.println("O mes " + mes + " do ano " + ano + " tem 29 dias.");
				 
				 else
					System.out.println("O mes " + mes + " do ano " + ano + " tem 28 dias.");
			 }
			  else 
				 System.out.println("O mes " + mes + " do ano " + ano + " tem 30 dias.");
				  
	}
}
