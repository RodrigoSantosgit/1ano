import static java.lang.System.*;
import java.util.Scanner;
import p2utils.Stack;

public class HanoiTowers
{
	// ...
	private Stack<Integer> orig = new Stack<Integer>();
	private Stack<Integer> target  = new Stack<Integer>();
	private Stack<Integer> aux  = new Stack<Integer>();

	private int countMoves;				
	private int numDisks;
	
	public HanoiTowers(int n) {
		// Create tower with n disks
		for (int i = n; i >= 1; i--) {		
			orig.push(i);
		}
		
		this.numDisks = n;	
		this.countMoves=0;
	}
	
	public void solve() {
		
		System.out.println("-------------------------");
		printTowers();
		moveDisks(numDisks, orig, target, aux);
		System.out.println("Number of moves for tower with " + numDisks + " disks : " + countMoves);
	}
	
	public void printTowers() {
		
		System.out.printf("After %d moves: \n", countMoves);
		System.out.println("TA: " + orig.reverseString());
		System.out.println("TB: " + aux.reverseString());
		System.out.println("TC: " + target.reverseString());
		System.out.println();
	}
	
	public void moveDisks(int num, Stack<Integer> orig, Stack<Integer> target, Stack<Integer> aux){
		
		assert num >= 0;
		if (num > 0) {
			moveDisks(num-1, orig, aux, target);
			
			target.push(orig.top());		// moves disk n to the target tower
			orig.pop();
		
			countMoves++;		
			printTowers();
			
			moveDisks(num-1, aux, target, orig);
		}
	}
	
	public int numberOfMoves(){
		return this.countMoves;
	}
}
