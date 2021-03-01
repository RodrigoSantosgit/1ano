import static java.lang.System.*;
import java.util.*;
public class ReverseString {

  public static void main(String[] args) {
	 
	String str; 
	Scanner read = new Scanner(System.in);
	
    if (args.length < 1) {
		System.out.println("Please insert the string you want to invert: ");
		str = read.nextLine(); 
		System.out.printf("\n'%s' -> '%s'", str, reverseString(str));
	}
	else {
		for (int i = 0; i < args.length; i++) {
			System.out.printf("\n'%s' -> '%s'", args[i], reverseString(args[i]));
		}
	}
  }
  public static String reverseString(String s) {
	if(s.length()==1){
		return s;
	}
	return s.charAt(s.length()-1) + reverseString(s.substring(0, s.length()-1));
  }
}
