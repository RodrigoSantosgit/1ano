import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;
import p2utils.LinkedList;

public class FilterLines2 {
	
	public static void main (String[] args) {
		if(args.length != 1) {
			err.printf("Usage: java -ea FilterLines2 text-file\n");
			exit(1);
		}
		File fil = new File(args[0]);
		LinkedList<String> lines  = new LinkedList<String>();
        
		Scanner scaf = new Scanner(fil);
    
		while(scaf.hasNextLine()) {
			String line = scaf.nextLine();
			if (line.length() <= 20) {
				lines.addFirst(line);
			}
			else {							
				lines.addLast(line);
			}
		}
		scaf.close();
		
		lines.print();
	}
}

