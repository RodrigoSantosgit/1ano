import java.io.*;
import java.util.*;
public class CutColumn {
	
	public static void main (String[] args) {
		
		int column = 0;
		try{
			column = Integer.parseInt(args[1]);
		}catch(NumberFormatException e){
			System.out.println("ERROR: Invalid column number!");
			System.exit(1);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR: No column number inserted!");
			System.exit(1);
		}
		
		Scanner ler= null;
		
		try{
			File fic = new File(args[0]);
			ler = new Scanner(fic);
		}catch(FileNotFoundException e){
			System.out.println("ERROR: File not found, or not accessible!");
			System.exit(1);
		}
		
		String[][] a = new String[500][500];
		int i=0,l=0;
		
		while(ler.hasNextLine()){
			Scanner sc2 = new Scanner(ler.nextLine());
			while(sc2.hasNext()){
				a[i][l] = sc2.next();
				l++;
			}
			i++;
			l=0;
		}
		ler.close();
		
		for(int j=0; j<i+1; j++){
			if(a[j][column-1] == null)
				System.out.println();
			else
				System.out.println(a[j][column-1]);
		}
	}
}

