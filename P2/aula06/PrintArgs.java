import static java.lang.System.*;

public class PrintArgs {

  public static void main(String[] args) {
    printArray(args, args.length);
  }

  /** Imprime as N primeiras strings do array, uma por linha. */
  public static void printArray(String[] array, int N) {
    // Implemente de forma recursiva...
    if(array.length==0)
		return;
	else
		{
		System.out.println(array[array.length-N]);
		int i= N-1;
		if(i > 0)
			printArray(array, i--);
		}
  }
}

