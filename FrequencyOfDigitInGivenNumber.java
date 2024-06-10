import java.util.InputMismatchException;
import java.util.Scanner;
public class FrequencyOfDigitInGivenNumber{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the number : ");
			int num = sc.nextInt();

			System.out.print("\nEnter the target digit : ");
			int targetDigit = sc.nextInt();

			int frequency = findFrequencyOfDigit(targetDigit,num);
			System.out.println("\nFrequency of -> "+targetDigit+" is : "+frequency);

		}catch (InputMismatchException ime) {
			System.out.println("\nException Occured :: Please enter valid integer!!");
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static int findFrequencyOfDigit(int targetDigit,int num){

		int temp = num;

		if(temp < 0){
			temp = -temp;
		}
		int frequency = 0;
		while (temp != 0) {
			int rem = temp % 10;

			if(rem == targetDigit){
				++frequency;
			}

			temp /= 10;
		}

		return frequency;
	}
}