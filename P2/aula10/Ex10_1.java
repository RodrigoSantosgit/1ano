import java.util.Scanner;

import p2utils.Queue;
import p2utils.Stack;

public class Ex10_1 {

	public static void main(String[] args) {
		

		// through args
		if (args.length >= 1)
			for (String str : args) {
				System.out.println("The string " + str + (isPalindrome(str)? " is" : " is not") + " a palindrome");
			}
		// through console
		else {
			Scanner read = new Scanner (System.in);
			String str = read.nextLine();
			System.out.println("The string " + str + (isPalindrome(str)? " is" : " is not") + " a palindrome");
		}

		System.exit(0);

	}

	public static boolean isPalindrome (String argStr) {
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new Queue<Character>();
		argStr = argStr.toUpperCase(); // ignore Capital and non Capital Letters

		// save str char by char
		int len = argStr.length();
		for (int i = 0; i < len; i++) {
			char c = argStr.charAt(i);
			if (Character.isLetterOrDigit(c)) {  // ignores spaces
				stack.push(c);
				queue.in(c);
			}
		}
		
		for (int j = 0; j < stack.size(); j++) {
			if (stack.top() != queue.peek()) {
				return false;
			}
			stack.pop();
			queue.out();

		} 
		return true;
	}		
}
		
		
