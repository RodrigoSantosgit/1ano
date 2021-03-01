import static java.lang.System.*;
import java.util.Arrays;

public class Ngrams {

  public static void main(String[] args) {
    int N = 3;
    switch (args.length) {
    case 1:
      break;
    case 2:
      try {
        N = Integer.parseInt(args[1]);
      }
      catch (NumberFormatException e) {
        err.printf("Second argument must be a number.\n");
        exit(1);
      }
      break;
    default:
      out.println("USO: java -ea Ngrams ABC [N]");
      exit(1);
    }
    String[] a;
    // Crie a função allNgrams e altere a invocação abaixo...
    a = allNgrams(args[0], Integer.parseInt(args[1]));
    out.println(Arrays.toString(a));
  }

  // Gera todos os arranjos de 3 símbolos escolhidos do alfabeto alpha.
  public static String[] all3grams(String alpha) {
    int l = alpha.length();
    String[] arr = new String[l*l*l];
    int n = 0;
    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {
        for (int k = 0; k < l; k++) {
          arr[n] = "" +  alpha.charAt(i) + alpha.charAt(j) + alpha.charAt(k);
          n++;
        }
      }
    }
    assert n == arr.length;
    return arr;
  }

  // Gera todos os N-gramas de símbolos escolhidos do alfabeto alpha.
 // public static String[] allNgrams(String alpha, int n) {
    /*assert n >= 0;
    //...
    int l = alpha.length();
    String[] arr = new String[(int)(Math.pow(l, n))];
    
    if ( n-1 > 0 ){
		String[] tmp = allNgrams(alpha, n-1);
		System.arraycopy(tmp, 0, arr, 0, tmp.length);	
	}
		
	for (int j=0; j<arr.length; j++)	
		if (arr[j] == null)
			arr[j] = "";
			
	for (int j=0; j<arr.length; j++)
		for(int i =0; i<alpha.length(); i++)
			arr[j] += alpha.charAt(i);
		
    
    /*for(int i=0; i< (int)(Math.pow(l, n-1)); i++){
		for (int j = 0; j < alpha.length(); j++){
			if (allNgrams(alpha, n-1)[i] != null){
				if (allNgrams(alpha, n-1)[i].length() < n)
					arr[i] += "" + allNgrams(alpha, n-1)[i] + alpha.charAt(j);
			}
			else
				arr[i] = "" + alpha.charAt(j);
		}
	}*/
	public static String[] allNgrams(String alpha, int n) {
		assert n >= 0;
		int p = alpha.length();
		String[] P = {""};
		if(n >0){
			String[] arr = allNgrams(alpha,n-1);
			P = new String[arr.length*p];
			int tP = 0;
			for(String x : arr){
				for(int i=0; i<p; i++){
					P[tP++] = x + alpha.charAt(i);	// &(/: 
				}
			}
		}
		return P;
    }
   // return arr;
 // }
}

