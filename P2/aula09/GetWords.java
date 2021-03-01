import static java.lang.System.*;
import java.io.*;
import java.util.Scanner;
import p2utils.LinkedList;

import static p2utils.Sorting.*;

public class GetWords
{
  public static void main(String[] args) throws IOException {
    if (args.length < 1) {
      err.println("Usage: java GetWords <file>");
      exit(1);
    }
    
    int n=0;
    LinkedList<String> list = new LinkedList<>();
    File fic = new File("words.txt");
    n += extractWords(fic, list);
    
    for(int i=0; i<args.length; i++){
		File fin = new File(args[i]);
		n += extractWords(fin, list);
	}
	
	quickSort(list);
	  
	list.print();
	System.out.println("Palavras listadas: " + n);
	
	PrintWriter writer = new PrintWriter(fic);
	while(!list.isEmpty()){
		writer.println(list.first());
		list.removeFirst();
	}
	System.out.println();
	writer.close();
  }

  // Read words from a file, return words in an array
  static int extractWords(File fin, LinkedList<String> list) {
    try {
      // count the words
      int n = 0;
      Scanner scf = new Scanner(fin).useDelimiter("[\\p{Punct}\\p{Space}]+");
      // (words are delimited by 1 or more punctuation or whitespace char)
      while (scf.hasNext()) {
        scf.next();
        n++;
      }
      scf.close();

      // create the array
      String[] result = new String[n];
      
      
      // read the words
      int i = 0;
      n = 0;
      scf = new Scanner(fin).useDelimiter("[\\p{Punct}\\p{Space}]+");
      while (scf.hasNext()) {
        result[i] = scf.next();
        i++;
        if(!list.contains(result[i-1])){
			list.addFirst(result[i-1]);
			n++;
		}
      }
      scf.close();
	  
      return n;
    }
    catch (IOException e) {
      err.printf("Error: %s\n", e);
      exit(1);
      return 0;  // never happens...
    }
  }
  
  public static <T extends Comparable<T>> void quickSort(LinkedList<T> lst) {
    if (lst.size() > 1) {
      // Take first element as a pivot value:
      T pivot = lst.first(); lst.removeFirst();

      // A list for elements smaller than the pivot:
      LinkedList<T> smaller = new LinkedList<T>();
      // A list for elements not smaller than the pivot:
      LinkedList<T> greater = new LinkedList<T>();

      // Now, take each element from lst and append it
      // to the smaller list, if element < pivot, or
      // to the greater list, otherwise.
      //... FILL IN THE CODE ...
      while(!lst.isEmpty()){
		if(lst.first().compareTo(pivot) < 0){
			smaller.addFirst(lst.first());
			lst.removeFirst();
		}
		else{
			greater.addFirst(lst.first());
			lst.removeFirst();
		}
	  }
      // The lst should be empty now:
      assert lst.isEmpty();

      // Sort each of the lists:
      quickSort(smaller);
      quickSort(greater);
      
      // Transfer smaller elements back to lst:
      //... FILL IN THE CODE ...
      if(!smaller.isEmpty()){
		do{
			lst.addLast(smaller.first());
			smaller.removeFirst();
		}while(!smaller.isEmpty());
	  }
	  
      // Append the pivot:
      lst.addLast(pivot);
      
      // Transfer greater elements back to lst:
      //... FILL IN THE CODE ...
      if(!greater.isEmpty()){
		do{
			lst.addLast(greater.first());
			greater.removeFirst();
		}while(!greater.isEmpty());
	  }
    }
  }
}
