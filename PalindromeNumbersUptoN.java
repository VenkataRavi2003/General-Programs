import java.util.Scanner;
import java.util.InputMismatchException;
public class PalindromeNumbersUptoN{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter N : ");
			int N = getValidInput(sc);

			System.out.println("\nPalindrome Numbers Upto : "+N);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			for (int i = 1 ; i <= N ; ++i) {
				if(isPalindrome(i)){
					System.out.print(i+",");
				}
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			int N = sc.nextInt();
			try{
				if(N > 0)return N;
			    System.out.println("\n"+N+" -> N must greater than zero!");
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid Input!Please Enter Valid Integer As Input.");
				sc.next();
			}catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	public static boolean isPalindrome(int x){
		int temp = x , rev = 0;
		while (temp != 0) {
			int rem = temp % 10;
			rev = (rev * 10) + rem;
			temp /= 10;
		}

		return rev == x;
	}
}