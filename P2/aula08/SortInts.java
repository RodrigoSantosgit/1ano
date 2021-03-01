import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;

public class SortInts
{
  public static void main(String[] args) throws IOException {
    //...
    
    SortedListInt listInt = new SortedListInt();
    
    for (int i=0; i< args.length; i++){
		File fic = new File(args[i]);
		Scanner ler = new Scanner(fic);
		while (ler.hasNextLine()){
			String line = ler.nextLine();
			String[] line_words = line.split(" ");
			for(int j=0; j< line_words.length; j++){
				try{
					int num = Integer.parseInt(line_words[j]);
					listInt.insert(num);
					
				} catch(NumberFormatException e){
				}
			}	
		}
		ler.close();
	}
	while(!listInt.isEmpty()){
		System.out.print(listInt.first() + " ");
		listInt.removeFirst();
	}
  }

}


