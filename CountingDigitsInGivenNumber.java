import java.util.Scanner;
import java.util.InputMismatchException;
public class CountingDigitsInGivenNumber{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter Number : ");
			int num = sc.nextInt();

			int digitCount = findDigitsCountsInNumber(num);
			System.out.println("\nNumber of digits : "+digitCount);

		}catch (InputMismatchException ime) {
			System.out.println("\nException Occured : Please enter a valid integer!!");
		}catch (Exception e) {
			System.out.println("\nException Occured : "+e.getMessage());
		}
	}
	public static int findDigitsCountsInNumber(int num){

		if(num == 0) return 1;

		int temp = num;

		if(temp < 0){
			temp = -temp;
		}

		int digitCount = 0;
		while (temp != 0) {
			++digitCount;
			temp /= 10;
		}
		return digitCount;
	}
}