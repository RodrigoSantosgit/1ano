import java.util.*;
import java.lang.System.*;

public class MDC {
	
	static final Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.print("A = ");
		int a = sc.nextInt();
		
		System.out.print("B = ");
		int b = sc.nextInt();
		
		System.out.printf("MDC = %d \n", mdc(a, b));
		
	}
	
	public static int mdc (int a, int b){
		
		if(b == 0)
			return a;
		else
			return mdc(b, a % b);
	}
	
}

