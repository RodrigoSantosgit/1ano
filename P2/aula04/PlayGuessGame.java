import static java.lang.System.*;
import java.util.Scanner;

public class PlayGuessGame {
  private static final Scanner scin = new Scanner(System.in);

  public static void help(GuessGame game) {
    assert game != null;
    out.printf("Find the secret number in range [%d,%d]!\n",
                game.min(), game.max());
    out.printf("Available commands:\n");
    out.printf("  <number>   (new attempt to guess secret)\n");
    out.printf("  count      (show current number of attempts)\n");
    //out.printf("  show       (show all attempts done)\n");
    out.printf("  help       (information on command usage)\n");
    out.printf("  quit       (exits the program)\n");
  }

  public static void main(String[] args) {
    if (args.length != 0 && args.length != 2) {
      out.println("Usage: PlayGuessGame [ <min> <max> ]");
      out.println("(by default range [0,20] is used)");
      exit(1);
    }
    GuessGame game = new GuessGame(0, 20);
    boolean error = true;
    while(error){
		try{
		int min = 0;
		int max = 20;
		if (args.length == 2) {
			// parse arguments...
			min = Integer.parseInt(args[0]);
			max = Integer.parseInt(args[1]);
		}
		game = new GuessGame(min, max);
		error = false;
		}catch (AssertionError e){
			System.out.print("Error: Min > Max, starting with default values.\n");
			game = new GuessGame(0, 20);
			error = false;
		}
		catch (NumberFormatException e){
			System.out.print("Error: invalid arguments, starting with default values.\n");
			game = new GuessGame(0, 20);
			error = false;
		}
	}
    out.println();
    help(game);
    out.println();
    boolean possible= false;
    while(!possible){
    while (!game.finished()) {
	  out.print("Command? ");
	  String command = scin.next();
	  out.println();
	  switch (command) {
		case "quit":
			exit(1);
			break;
		case "help":
			help(game);
			break;
		case "count":
			//...
			System.out.println("Number of attemps: " + game.numAttempts());
			break;
		default:
			//...
			try{
				if(game.validAttempt(Integer.parseInt(command))){
					possible = true;
					game.play(Integer.parseInt(command));
					if(game.attemptIsHigher())
						System.out.printf("%d is too High!\n", Integer.parseInt(command));
					else if(game.attemptIsLower())
							System.out.printf("%d is too Low!\n", Integer.parseInt(command));
				}
				break;
			}catch(NumberFormatException e){
				System.out.println("Invalid input format!\n");
			}
		  }
		}
		out.println();
    }
    out.printf("Game finished in %d attempts\n", game.numAttempts());
  }
}

