import java.util.Scanner;
import java.util.InputMismatchException;
public class LeapyearOrNot{

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the year : ");
			int year = sc.nextInt();

			if(isLeapyear(year)){
				System.out.println("\n"+year+" -> Is Leap Year.");
			}else{
				System.out.println("\n"+year+" -> Not Leap Year!!");
			}

		}catch (InputMismatchException  e) {
			System.out.println("\nInputMismatchException Occured :: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static boolean isLeapyear(int year){

		if(year % 400 == 0){
			return true;

		}else if(year % 4 == 0 && year % 100 != 0){
			return true;
		}

		return false;
	}
}