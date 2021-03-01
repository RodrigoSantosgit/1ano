import java.util.*;
import java.lang.System.*;
import p2utils.Stack;

public class RPNCalculator {
	
	public static void main (String[] args) {
		
		Stack<Integer> operandos = new Stack<Integer>();
		int res,op1, op2;
		
		for(int i=0; i< args.length; i++){
			try{
				int num = Integer.parseInt(args[i]);
				operandos.push(num);
				System.out.println("Stack: " + operandos.reverseString());
			}catch(NumberFormatException e){
				switch(args[i]){
					
					case "+":
						op1= operandos.top();
						operandos.pop();
						op2= operandos.top();
						operandos.pop();
						res= op1 + op2;
						operandos.push(res);
						System.out.println("Stack: " + operandos.reverseString());
						break;
						
					case "x":
						op1= operandos.top();
						operandos.pop();
						op2= operandos.top();
						operandos.pop();
						res= (op1 * op2);
						operandos.push(res);
						System.out.println("Stack: " + operandos.reverseString());
						break;
						
					case "-":
						op1= operandos.top();
						operandos.pop();
						op2= operandos.top();
						operandos.pop();
						res= op1 - op2;
						operandos.push(res);
						System.out.println("Stack: " + operandos.reverseString());
						break;
						
					case "/":
						op1= operandos.top();
						operandos.pop();
						op2= operandos.top();
						operandos.pop();
						res= (op1 / op2); 
						operandos.push(res);
						System.out.println("Stack: " + operandos.reverseString());
						break;
						
				}
			}
		}
		
		res = operandos.top();
		System.out.println("\nRes = " + res);
		
	}
}

