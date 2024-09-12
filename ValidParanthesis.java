import java.util.Scanner;
import java.util.Stack;
public class ValidParanthesis{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the paranthesis '(' , ')' ,'[' ,']','{' , '}' : ");
			String str = sc.next();

			if(isValidParanthesis(str)){
				System.out.println("\n"+str+" -> Valid Paranthesis.");
			}else {
				System.out.println("\n"+str+" Not Valid Paranthesis!!");
			}
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static boolean isValidParanthesis(String str){

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0 ; i < str.length() ; ++i) {
			
			char ch = str.charAt(i);

			if(ch == '(' || ch == '[' || ch == '{'){
				stack.push(ch);
			}else if(ch == ')' || ch == ']' || ch == '}'){

				if(stack.isEmpty()) return false;

				 char top = stack.pop();

				if(!isMatchedPair(top,ch)){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static boolean isMatchedPair(char open , char close){

		return ((open == '(' && close == ')') ||
	            (open == '[' && close == ']') ||
	            (open == '{' && close == '}'));

	}
}