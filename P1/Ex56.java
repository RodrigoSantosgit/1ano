import java.util.*;

public class Ex56 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		N = Functions.getIntRange(1, 100, "M= ");
		
		Functions.tabuada(N);
	}
	/*public static void tabuada(int N) {
		System.out.printf("-----------------\n");
		System.out.printf("| Tabuada do %d | \n", N);
		System.out.printf("-----------------\n");
		for (int n=1; n<11; n++ ) { 
			System.out.printf("| %d x %d | %d  | \n", N, n, N * n);
		}
		System.out.print("----------------");
	}
*/}
