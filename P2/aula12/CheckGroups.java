import static java.lang.System.*;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.File;
import java.io.IOException;
import p2utils.HashTable;

public class CheckGroups
{
  static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    if (args.length!=1) {
      err.printf("Usage: java -ea CheckGroups Group-File\n");
      exit(1);
    }

    File fin = new File(args[0]);
    
    // Create a dictionary to store student -> group mapping
    HashTable<String> studentGroup = new HashTable<>(200);

    // Load the file and store the data in the dictionary
    loadFile(fin, studentGroup);

    // Ask for pairs of students, until EOF
    boolean finished = false;
    while(!finished) {
      try {
        out.print("Student1? ");
        String a1 = in.nextLine();
        out.print("Student2? ");
        String a2 = in.nextLine();
        
        // Now, check if a1 and a2 were in same group or not
        // Complete...
        String a1comp = studentGroup.get(a1);
        String a2comp = studentGroup.get(a2);
        if(a1comp==a2comp){
			System.out.printf("Students %s and %s WERE in the same group!", a1, a2);
		}
		else{
			System.out.printf("Students %s and %s WERE NOT in the same group!", a1, a2);
		}
        out.println();
      }
      catch(NoSuchElementException e) {
        finished = true;
      }
    }
  }

  // Load student -> group data from file and store in dictionary.
  public static void loadFile(File fin, HashTable<String> studentGroup) {
    try {
      // Complete...
	  Scanner ler = new Scanner(fin);
	  
	  while(ler.hasNextLine()){
		String conjunto = ler.nextLine();
		String[] components = conjunto.split("\t");
		studentGroup.set(components[0], components[1]);
	  }
    }
    catch (IOException e) {
      err.printf("%s: Error: %s\n", fin, e.getMessage());
      exit(1);
    }
  }
}

