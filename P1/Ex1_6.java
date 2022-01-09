import java.util.*;
public class Ex1_6 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int n = (int)(Math.random()*(100+1)), op, tent=0;
		
		System.out.println("Adivinhe o numero!");
		
		do{
			tent++;
			op = sc.nextInt();
			if(op < n)
				System.out.println("Menor!");
			if(op > n)
				System.out.println("Maior!");
			if(op == n){
				System.out.println("Acertou!");
				break;
			}
		}while(op != n);
		
		System.out.println("Numero de tentativas: " + tent);
	}
}

