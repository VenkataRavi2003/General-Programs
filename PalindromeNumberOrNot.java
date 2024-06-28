import java.util.Scanner;
import java.util.InputMismatchException;
public class PalindromeNumberOrNot{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the number : ");
			int num = sc.nextInt();

			if(isPalindrome(num)){
				System.out.println("\n"+num+" -> Is Palindrome.");
			}else {
				System.out.println("\n"+num+" -> Not Palindrome!!");
			}
		}catch (InputMismatchException e) {
			System.out.println("\nInvalid Input! please enter an integer as input.");
		}catch (Exception e) {
			e.printStackTrace();	
		}
	}
	public static boolean isPalindrome(int num){
		int temp = num , rev = 0;

		while (temp != 0) {
			int rem = temp % 10;
			rev = (rev * 10) + rem;
			temp /= 10;
		}

		return num == rev;
	}
}