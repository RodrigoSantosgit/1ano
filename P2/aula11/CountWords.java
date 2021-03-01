import static java.lang.System.*;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import p2utils.KeyValueList;

public class CountWords
{

  public static void main(String[] args) throws IOException {
    KeyValueList<Integer> counts = new KeyValueList<>();

    for (int a = 0; a < args.length; a++) { // Processa cada ficheiro
      File fin = new File(args[a]);
      if (fin.exists() && fin.canRead()) {
        Scanner scf = new Scanner(fin);
        while (scf.hasNextLine()) { // Processa cada linha
          String line = scf.nextLine();
          // Divide a linha em "palavras", considerando como separador
          // qualquer sequência de 1 ou mais carateres não alfabéticos:
          String[] palavras = line.split("[^\\p{IsAlphabetic}]+");
          // (Sobre expressões regulares usadas no split: https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)

          for (int i = 0; i < palavras.length; i++) { // Processa cada palavra
            // Completar...
            String palavra = palavras[i].toLowerCase();

			if (palavra.compareTo("") != 0) 		
				if (counts.contains(palavra)) {
					counts.set(palavra, counts.get(palavra) + 1);
				}
				else {
					counts.set(palavra, 1);
				}
          }
        }
        scf.close();
      }
      else {
        err.println("ERRO: Nao foi possivel ler do ficheiro "+args[a]);
      }
    }
    out.println(counts.toString("Results:\n", ";\n", "\nEnd"));
    out.println(counts.toString()); // mesma lista, outro formato
    mostFrequent(counts);
  }

  // Find and print the key with most occurrences
  // and its relative frequency.
  static void mostFrequent(KeyValueList<Integer> counts) {
	String[] countKeys = counts.keys();
		System.out.println(countKeys.length);
		int max = 0;
		String maxKey = "";

		int sum = 0;

		for (String key : countKeys) {
			int num = counts.get(key);
			if (num > max) {
				max    = num;
				maxKey = key;
			}
			sum += num;
		}

		System.out.printf("\nMost frequent: %s (%d times, %.2f%%)", maxKey, max, ((max*100.0)/sum));
  }
}

