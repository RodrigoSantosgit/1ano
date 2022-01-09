import java.util.*;
public class Ex58 {
	
	public static void main (String[] args) {
		
		System.out.println("-----------------------------------");
		System.out.println("|  x   | 5x2+10x+3 | 7x3+3x2+5x+2 |");
		System.out.println("-----------------------------------");
		
		for ( int i = 0; i <= 5; i++ ) {
			System.out.printf("|  %d   |    %.1f    |    %.1f    |\n", i, Functions5_2.poly3(0, 5, 10, 3, i), Functions5_2.poly3(7, 3, 5, 2, i));
			System.out.println("-----------------------------------\n");
		}
	}
}
