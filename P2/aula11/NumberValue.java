import java.util.*;
import java.lang.System.*;
import java.io.*;
import p2utils.KeyValueList;

public class NumberValue {
	
	public static void main (String[] args) throws IOException {
		
		File fic = new File("numbers.txt");
		Scanner ler = new Scanner(fic);
		
		KeyValueList<Integer> trans = new KeyValueList<Integer>();
		
		while(ler.hasNextLine()){
			int num = ler.nextInt();
			String extense = ler.next();
			trans.set(extense, num);
		}
		
		int res=0;
		
		for(int i=0; i < args.length; i++){
			if((i+1) < args.length){
				if(trans.get(args[i]) < trans.get(args[i+1])){
					res += trans.get(args[i])*trans.get(args[i+1]);
					i++;
				}
				else
					res += trans.get(args[i]);
			}
			else
				res += trans.get(args[i]);	
		}
		
		System.out.println("\nNumber Value: " + res);
	}
}

