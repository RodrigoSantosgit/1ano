import java.util.Scanner;
	public class Ex210 {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int dia, mes, ano;
	
	System.out.print("Introduza o dia: ");
	dia = sc.nextInt();
	System.out.print("Introduza o mês: ");
	mes = sc.nextInt();
	System.out.print("Introduza o ano: ");
	ano = sc.nextInt();
	
	if ( mes == 8 || mes == 10 || mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 12 ) {
	    System.out.println("O mês " + mes + " do ano " + ano + " tem 31 dias.");
	    }
	else if ( mes == 2 ) {
	     if ( ano % 4 == 0 )
			if ( ano % 100 == 0)
				if ( ano % 400 == 0 )
					System.out.println ("O mês " + mes + " do ano " + ano + " tem 29 dias.");
				else 
					System.out.println ("O mês " + mes + " do ano " + ano + " tem 28 dias.");
	}
	}
}
