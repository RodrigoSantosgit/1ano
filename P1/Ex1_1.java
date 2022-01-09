import java.util.*;

public class Ex1_1 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.println("Introduza uma operacao matematica");
		String s = sc.nextLine();
		
		String[] val;
		val = s.split(" ");
		
		if (val[1].equals("+"))
			System.out.print(Integer.valueOf(val[0]) + Integer.valueOf(val[2]));
		else if (val[1].equals("*"))
				System.out.print(Integer.valueOf(val[0]) * Integer.valueOf(val[2]));
			else if (val[1].equals("-"))
					System.out.print(Integer.valueOf(val[0]) - Integer.valueOf(val[2]));
				else if (val[1].equals("/"))
						System.out.print(Integer.valueOf(val[0]) / Integer.valueOf(val[2]));
					else
						System.out.print("Erro operador invalido");
		
	}
}

