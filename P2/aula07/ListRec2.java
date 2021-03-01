import static java.lang.System.*;
import java.io.File;

import p2utils.LinkedList;

public class ListRec2 {

  public static void main(String[] args) {
    if (args.length != 1) {
      err.println("Uso: java -ea ListRec2 <dir>");
      exit(1);
    }

    File dir = new File(args[0]);

    // Verificar entrada
    if (!dir.exists()) {
      err.printf("ERRO: %s nao existe!\n", dir);
      exit(2);
    }

    LinkedList<File> files = recListFiles(dir);
    files.print();
  }

  /** Devolve uma lista com o conteúdo de um directório f
   *  e de todos os seus subdirectórios recursivamente.
   */
  public static LinkedList<File> recListFiles(File f) {
    //...
    LinkedList<File> dir_files = new LinkedList<File>();
	recListFiles(f, dir_files);
	return dir_files;
  }
  private static void recListFiles(File f, LinkedList<File> list) {
	if (f.isDirectory()) {
		list.addLast(f);
		File[] contents = f.listFiles();
		if (contents != null) {			
			for (File i : contents) {
				if (i.isDirectory()) {
					recListFiles(i, list);
				}
				else {
					list.addLast(i);
				}
			}
		}
	}
 }
}
