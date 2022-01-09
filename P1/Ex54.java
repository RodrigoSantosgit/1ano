import java.util.*;

public class Ex54 {
	
	public static void main (String[] args) {
		
		int M;
		
		M = Functions.getIntRange(1, 10, "M= ");
		
		for (int i=1; i <= M; i++) {
			System.out.printf("%d! = %d\n", i, Functions.fact(i));
		}
	}
}

