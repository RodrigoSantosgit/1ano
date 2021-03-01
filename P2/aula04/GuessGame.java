import static java.lang.System.*;

public class GuessGame {

  private int secretNumber; // to hold the secret
  //...
  private int min, max;
  private int guess, attemps=0;
  

  public GuessGame(int min, int max) {
    //...
    assert (min < max): "Min needs to be smaller than Max.";
    this.secretNumber = (int)(Math.random() * (max-min +1)) + min;
    this.min = min;
    this.max = max;
    assert (this.secretNumber <= max && this.secretNumber >= min) : "Secret number out of bounds.";
  }

  public int min() {
    //...
    return this.min;
  }

  public int max() {
    //...
    return this.max;
  }

  public boolean validAttempt(int n) {
    //...
    if (n > this.max){
		System.out.println("Guess > Max! \n");
		return false;
		
	}
	else if (n < this.min){
			System.out.println("Guess < Min! \n");
			return false;
		}
		else 
			return true;
  }

  public boolean finished() {
    //...
    if(this.guess == this.secretNumber)
		return true;
	else
		return false;
		
  }

  public boolean attemptIsHigher() {
    //...
    if(this.guess > this.secretNumber)
		return true;
	else
		return false;
  }

  public boolean attemptIsLower() {
    //...
    if(this.guess < this.secretNumber)
		return true;
	else
		return false;
  }

  public void play(int n) {
    //...
    assert (n >= min && n <= max) : "Invalid play!";
    assert !finished();
    this.guess = n;
    this.attemps++;
    
    
  }

  public int numAttempts() {
    //...
    return this.attemps;
  }

  /**
   * Simple tests of the GuessGame class.
   * This method tests the functionality of the GuessGame class.
   * It should be used by the programmer to test and debug the class.
   * It is not meant to be called in client programs.
   *
   * To run from the command line, use:
   *   java -ea GuessGame
   */
  public static void main(String[] args) {
    requireEA();
    out.println("Starting tests.");
    GuessGame game = new GuessGame(1, 10);
    // initial tests:
    assert !game.finished() : "game should not be finished yet";
    assert game.min() == 1;
    assert game.max() == 10;
    assert game.numAttempts() == 0 : "there should be no attempts yet";
    for(int i = -10; i <= 20; i++) {
      assert game.validAttempt(i) == (i >= 1 && i <= 10);
    }
    // trying all wrong answers:
    int nplay = 0; // how many times play was called
    for(int n = 1; n <= 10; n++) {
      if (n != game.secretNumber) {
        game.play(n); // make a wrong guess
        nplay++;
        assert game.numAttempts() == nplay;
        assert !game.finished() : "game should not be finished yet";
        assert (n < game.secretNumber) == game.attemptIsLower();
        assert (n > game.secretNumber) == game.attemptIsHigher();
      }
    }
    // make the right guess:
    game.play(game.secretNumber);
    nplay++;
    assert game.finished() : "game should be finished now";
    assert game.numAttempts() == nplay;
    out.println("No error detected!");
  }

  /** Check if program is being run with -ea, exit if not. */
  static void requireEA() {
    boolean ea = false;
    assert ea = true; // assert with a side-effect, on purpose!
    if (!ea) {
      err.println("This program must be run with -ea!");
      exit(1);
    }
  }

}

