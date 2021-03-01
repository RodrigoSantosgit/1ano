// This program should use the generic mergeSort method in p2utils.Sorting
// to sort its string arguments.

//...
import java.lang.System.*;
import java.util.*;
import static p2utils.Sorting.*;

public class TestGenericSort {
	
	public static void main(String[] args) {
		
		mergeSort(args, 0, args.length);
		
		System.out.println(Arrays.toString(args));
		
	}
}
