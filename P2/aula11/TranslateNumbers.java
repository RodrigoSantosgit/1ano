import java.util.*;
import java.io.*;
import p2utils.KeyValueList;
public class TranslateNumbers {
	
	public static void main (String[] args) throws IOException{
		
		File fic = new File("numbers.txt");
		Scanner ler = new Scanner(fic);
		
		KeyValueList<Integer> trans = new KeyValueList<Integer>();
		
		while(ler.hasNextLine()){
			int num = ler.nextInt();
			String extense = ler.next();
			trans.set(extense, num);
		}
		
		for(int i=0; i < args.length; i++){
			if(trans.contains(args[i]))
				System.out.print(trans.get(args[i]) + " ");
			else
				System.out.print(args[i] + " ");
		}
	}
}

