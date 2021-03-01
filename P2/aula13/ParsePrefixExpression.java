import static java.lang.System.*;
import java.util.Scanner;
import p2utils.ExpressionTree
;

public class ParsePrefixExpression
{
  public static void main(String[] args) {
    // ...
    
	ExpressionTree tree = new ExpressionTree();
	
	tree.printInfix();
	
	System.out.print(" = " + tree.eval());
  }
  // ...
}

