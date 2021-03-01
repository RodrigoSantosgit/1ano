import static java.lang.System.*;

public class Fibonacci {
	private static int[] vetor = new int[500];
  public static void main(String[] args) {
    if (args.length < 1) {
      out.println("USO: java -ea Fibonacci N [N ...]");
      exit(1);
    }
	
    // Alguns testes:
    assert fibonacci(0) == 0;
    assert fibonacci(1) == 1;
    assert fibonacci(2) == 1;
    assert fibonacci(5) == 5;

    for(int i = 0; i < args.length; i++) {
      int n = Integer.parseInt(args[i]);
      long time = nanoTime();  // System.nanoTime() gives the time in ns.
      int f = FibonacciMemo(n);
      time = nanoTime() - time;
      out.printf("fibonacci(%d) = %d (%d ns)\n", n, f, time);
    }
  }

  public static int fibonacci(int n) {
    assert n >= 0;
    //...
    if (n == 0)
		return 0;
	else if(n == 1)
			return 1;
		else
			return fibonacci(n-2) + fibonacci(n-1);
  }
  public static int FibonacciMemo(int n){
	 /*if(vetor[n]== 0){
		vetor[n] = fibonacci(n);
		return 0;
	 }
	 else
	 {
		 return vetor[n];
	 }
	 */
	 assert n >= 0;
	 assert n < vetor.length;
	 if (n <= 1)
		vetor[n] = n;
	 else if(vetor[n]== 0)
			vetor[n] = FibonacciMemo(n-2) + FibonacciMemo(n-1);
	return vetor[n];
  }
  
}
