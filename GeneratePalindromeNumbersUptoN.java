import java.util.Scanner;
import java.util.InputMismatchException;
public class GeneratePalindromeNumbersUptoN{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter N : ");
			int n = sc.nextInt();
			System.out.println("\nPrime Numbers Upto -> "+n);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			for (int i = 1 ; i <= n ; ++i) {
				if(isPalindrome(i)){
					System.out.print(i+",");
				}
			}
		}catch (InputMismatchException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	public static boolean isPalindrome(int num)throws Exception{
		int rev = 0 , temp = num;
		while (temp != 0) {
			int rem = temp % 10;
			rev = (rev * 10 ) + rem;
			temp /= 10;
		}

		return rev == num;
	}
}