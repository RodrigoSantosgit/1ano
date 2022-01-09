import java.util.*;
public class Ex84 {
	static final Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Complexo num, num2;
		char op;
		do{
			System.out.print("Operação (+, -, x, /) :");
			op = sc.nextLine().charAt(0);
			switch(op){
				case '+':
					num = lernum();
					num2 = lernum();
					soma(num, num2);
					break;
				case '-':
					num = lernum();
					num2 = lernum();
					subtr(num, num2);
					break;
				case 'x':
					num = lernum();
					num2 = lernum();
					mult(num, num2);
					break;
				case '/':
					num = lernum();
					num2 = lernum();
					div(num, num2);
					break;
			}
		}while (op != '=');
		System.out.print("O sistema vai terminar...");
		
		
	}
	public static Complexo lernum(){
		Complexo num = new Complexo();
		System.out.println("Introduza um numero complexo:");
		System.out.println("Parte real:");
		num.r = sc.nextInt();
		System.out.println("Parte imag:");
		num.i = sc.nextInt();
		return num;
	}
	public static void soma(Complexo num, Complexo num2){
		
	}
	public static void subtr(Complexo num, Complexo num2){
		
	}
	public static void mult(Complexo num, Complexo num2){
		
	}
	public static void div(Complexo num, Complexo num2){
		
	}
}
class Complexo {
	int r, i;
}
