import static java.lang.System.*;
import java.util.*;
public class TestComplex {
  // Exemplo simples de utilização da class Complex
  public static void main(String[] args) {
    Complex a;
    
    Scanner sc = new Scanner(System.in);
    
    if (args.length < 2) {
		System.out.printf("\nRe: ");
		double re = sc.nextDouble();
		System.out.printf("\nIm: ");
		double im = sc.nextDouble();	
		a = new Complex(re, im);
	}

	else{
		a = new Complex(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
	}


    // Vamos usar métodos do objeto a
    out.println("(" + a.real() + " + " + a.imag() + "i)");
    out.println("  parte real = " + a.real());
    out.println("  parte imaginaria = " + a.imag());
    out.println("  modulo = " + a.abs());
    out.printf("  argumento =  %2.2f\n", a.arg());
  }

}
