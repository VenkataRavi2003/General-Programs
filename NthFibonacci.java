import java.util.Scanner;
public class NthFibonacci{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter N : ");
			int N = sc.nextInt();

			if(N < 0){
				System.out.println("\nFibonacci Number Can't Be Negative!!");
				return;
			}

			int res = findNthFibonacci(N);
			System.out.println("\n"+N+" -> Fibonacci Value Is : "+res);

		}catch (Exception e) {
			System.out.println("\nException Occured : "+e.getMessage());
		}
	}
	//using iterative approach
	public static int findNthFibonacci(int N){

		if(N == 0)return 0;
		if(N == 1)return 1;

		int firstTerm = 0 , secondTerm = 1;

		for (int i = 2; i <= N ; ++i) {

		     int nextTerm = firstTerm + secondTerm;
		     firstTerm = secondTerm;
		     secondTerm = nextTerm;	
		}

		return secondTerm;
	}

	/*Using Recursion

	public static int findNthFibonacci(int N){

        if(N == 0)return 0;
		if(N == 1)return 1;

		return findNthFibonacci(N - 1) + findNthFibonacci(N - 2);

	}*/
}